package com.yuanjingyu.dto;

/**
 * 定义前端返回信息格式
 */
public class Message {

    private Integer code = 0;       //可以给个默认值200，或者0
    private String msg = "ok";

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Message{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                '}';
    }
}
