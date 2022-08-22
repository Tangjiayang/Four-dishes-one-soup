package com.vegetables.shortvideo.entity;

/**
* 消息模型对象（数据响应）
*    状态码
*        1=成功，0=失败
*    提示信息
*        字符串
*    回显数据
*        object对象
* */


public class MessageModel {

    private Integer code=1;
    private String msg="成功！";
    private Object object;

    public Integer getCode(){
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public Object getObject() {
        return object;
    }

    public void setCode(Integer code){
        this.code=code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
