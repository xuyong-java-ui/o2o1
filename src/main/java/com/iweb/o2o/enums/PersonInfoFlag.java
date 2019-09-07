package com.iweb.o2o.enums;


/**
 * @Auter : Xuyong
 * @Date : 2019/9/4 14:01
 * Description:
 */
public enum PersonInfoFlag {
    CUSTOMER(0,"普通用户"),SHOPOEMPLOYEE(1,"店主");

    private int code;
    private String msg;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    PersonInfoFlag() {
    }

    PersonInfoFlag(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
