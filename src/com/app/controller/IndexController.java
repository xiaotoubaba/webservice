package com.app.controller;

import com.jfinal.core.Controller;

/**
 * Created by Yale on 2017/5/5.
 */
public class IndexController extends Controller {

    public void index() {

        this.render("/index.jsp");

    }

    public void sayHello() {

        String userName = this.getAttr("userName");

        String sayHello = "Hello " + userName + "，welcome to JFinal world.";

        this.setAttr("sayHello", sayHello);

        this.render("/hello.jsp");

    }
}
