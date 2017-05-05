package com.app.service;

import com.app.model.User;

/**
 * Created by Yale on 2017/5/5.
 */
public class UserService {
    public User findUser(String name, String password) {
        User user = new User();
        user = null;

        String sql = "select * from user where name='" + name + "' and password='" + password + "';";

        user = User.dao.findFirst(sql);

        System.out.printf("sql:" + sql);

        return user;
    }
}
