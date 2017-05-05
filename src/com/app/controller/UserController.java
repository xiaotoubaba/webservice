package com.app.controller;

import com.app.model.User;
import com.jfinal.core.Controller;

import javax.sound.sampled.Control;
import java.util.List;

/**
 * Created by Yale on 2017/5/5.
 */
public class UserController extends Controller {
    public void register() {
        render("register.jsp");
    }

    public void login() {
        render("hello.jsp");
    }

    public void submit() {
        String name = getPara("username");
        String password = getPara("password");

        List users = User.dao.find("SELECT * FROM user WHERE user = '" + name + "' AND password = '" + password + "'");
        setAttr("users", users);
        if (users.size() > 0) {
            System.out.println("登录成功");
            login();
        } else {
            System.out.println("登录失败");
        }

    }

    public void add() {
        User user = getModel(User.class, "user");
        user.save();

        System.out.println("注册成功");
        login();
    }
}
