package com.app.controller;

import com.app.util.CommStaticUtile;
import com.app.util.CommonUtils;
import com.jfinal.core.Controller;
import com.jfinal.ext.render.CaptchaRender;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

/**
 * Created by Yale on 2017/5/8.
 */
public class LoginController extends Controller {

    // 登录验证
    public void login() {
        String vilidate = getPara("vilidate");
        String username = getPara("username");
        String password = getPara("password");
        String msg = "";
        boolean result = CaptchaRender.validate(this, vilidate.toUpperCase(),
                CommStaticUtile.RANDOM_CODE_KEY);
        result = true;
        if (result) {
            List<Record> admin = Db.find("select * from account");
            for (Record record : admin) {
                if (record.getStr("username").equals(username.trim())
                        && record.getStr("password").equals(password.trim())) {
                    setSessionAttr(CommStaticUtile.USER_NAME,
                            record.getStr("username"));
                    setSessionAttr(CommStaticUtile.PASS_WORD,
                            record.getStr("password"));
                    setSessionAttr(CommStaticUtile.ADMIN_IP, record.getStr("id"));
                    String adminIp = CommonUtils.getRemoteLoginUserIp(getRequest());
                    record.set("old_ip", record.get("ip")).set("old_date", record.getTimestamp("old_date"));
                    record.set("ip", adminIp).set("date", new Timestamp(new Date().getTime()));
                    Db.update("account", record);
                } else {
                    msg = "账号或密码错误！";
                    result = false;
                }
            }
        } else {
            msg = "验证码错误";
        }
        setAttr("result", result);
        setAttr("msg", msg);
        renderJson();
    }

}
