package com.skyrin.ssm.util;

import java.util.HashMap;
import java.util.Map;

public class Msg {
    private int code;
    //提示信息
    private String msg;
    //用户要返回给浏览器的数据
    private Map<String, Object> data = new HashMap<String, Object>();

    public Msg() {
    }

    public Msg(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
