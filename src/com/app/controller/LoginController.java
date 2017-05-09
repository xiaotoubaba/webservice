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
        String username = getPara("username");
        String password = getPara("password");
        String msg = "";
        boolean result = false;
        if (checkLogin(username, password)) {
            result = true;
        } else {
            msg = "账号或密码错误！";
            result = false;
        }
        setAttr("result", result);
        setAttr("msg", msg);
        renderJson();
    }

    private boolean checkLogin(String username, String password) {
        List<Record> admin = Db.find("select * from user");
        for (Record record : admin) {
            if (record.getStr("username").equals(username.trim())
                    && record.getStr("password").equals(password.trim())) {
                return true;
            }

        }
        return false;
    }
}
