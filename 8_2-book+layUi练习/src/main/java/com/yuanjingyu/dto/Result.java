package com.yuanjingyu.dto;


/**
 * 规定前端返回的格式
 */
public class Result {

    private Message  message = new Message(); //返回信息
    private Object data;      //返回数据格式

    public Result() {
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "message=" + message +
                ", data=" + data +
                '}';
    }
}
