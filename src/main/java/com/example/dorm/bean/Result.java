package com.example.dorm.bean;

/**
 * projectName: dorm
 *
 * @author: 赵振华
 * time: 2020/11/4 10:18
 * description:用户返回前端的封装类
 */
public class Result {
    private int code = 0;
    private String meaasge;
    private Object data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMeaasge() {
        return meaasge;
    }

    public void setMeaasge(String meaasge) {
        this.meaasge = meaasge;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
