package com.example.dorm.bean;

/**
 * projectName: dorm
 *
 * @author: 赵振华
 * time: 2020/11/4 11:10
 * description:系统管理员实体类
 */
public class Admin {
    private int adminId;//管理员id
    private String userName;//用户名
    private String password;//用户密码
    private String adminName;//管理员姓名
    private String adminSex;//性别
    private String adminTel;//电话

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminSex() {
        return adminSex;
    }

    public void setAdminSex(String adminSex) {
        this.adminSex = adminSex;
    }

    public String getAdminTel() {
        return adminTel;
    }

    public void setAdminTel(String adminTel) {
        this.adminTel = adminTel;
    }
}

