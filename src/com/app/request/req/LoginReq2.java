package com.app.request.req;

import com.app.bean.LoginUser;

/**
 * Created by Yale on 2017/5/10.
 */
public class LoginReq2 {
    private String method;
    private LoginUser param;

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public LoginUser getParam() {
        return param;
    }

    public void setParam(LoginUser param) {
        this.param = param;
    }
}
