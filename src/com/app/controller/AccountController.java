package com.app.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.app.application.entity.ErrMsg;
import com.app.application.res.Response;
import com.app.request.req.LoginReq;
import com.app.request.req.LoginReq2;
import com.app.request.res.LoginRes;
import com.jfinal.core.Controller;
import com.jfinal.kit.HttpKit;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;
import java.util.List;

/**
 * Created by Yale on 2017/5/8.
 */
public class AccountController extends Controller {


    // 登录验证
    public void login() {
        LoginReq2 req = JSON.parseObject(HttpKit.readData(getRequest()), new TypeReference<LoginReq2>(){});
        Response<LoginRes> response = new Response();
        if (checkLogin(req.getParam().getUsername(), req.getParam().getPassword())) {

            response.setRt(ErrMsg.SUCC_CODE);
            response.setErrmsg(ErrMsg.SUCC);
            LoginRes res = new LoginRes();
            res.setUsername(req.getParam().getUsername());
            res.setPassword(req.getParam().getPassword());
            response.setParam(res);
        } else {
            response.setRt(ErrMsg.FAIL_CODE);
            response.setErrmsg(ErrMsg.SUCC);
        }
        renderJson(JSON.toJSONString(response));
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
