package com.app.controller;

import com.app.util.CommStaticUtile;
import com.app.util.CommonUtils;
import com.jfinal.core.Controller;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;

import java.awt.image.DataBuffer;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

/**
 * Created by Yale on 2017/5/8.
 */
public class RegisterController extends Controller {

    public void reg(){
        String username = getPara("username");
        String password = getPara("password");
        boolean result = false;
        String msg = "";
       if(checkUserNameExit(username)){
           insertDb(username, password);
           msg = "注册成功";
           result = true;
       }else{
           msg = "用户已经存在";
       }

        setAttr("result", result);
        setAttr("msg", msg);
        renderJson();
    }

    private boolean checkUserNameExit(String username){
        List<Record> accounts = Db.find("select * from user");
        for(Record record : accounts){
            if(record.getStr("username").equals(username.trim()))
                return false;
        }

        return true;
    }

    private void insertDb(String username, String password){
        Record record = new Record();
        record.set("username", username).set("password", password);
        Db.save("user", record);
    }

}
