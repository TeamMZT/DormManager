package com.example.dorm.bean;

/**
 * projectName: dorm
 *
 * @author: 12510
 * time: 2020/11/4 11:16
 * description:宿舍管理员实体类
 */
public class DormManager {
    private int dormManId;
    private String userName;
    private String password;
    private int dormBuildId;
    private String dManName;
    private String dManSex;
    private int dManTel;

    public int getDormManId() {
        return dormManId;
    }

    public void setDormManId(int dormManId) {
        this.dormManId = dormManId;
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

    public int getDormBuildId() {
        return dormBuildId;
    }

    public void setDormBuildId(int dormBuildId) {
        this.dormBuildId = dormBuildId;
    }

    public String getdManName() {
        return dManName;
    }

    public void setdManName(String dManName) {
        this.dManName = dManName;
    }

    public String getdManSex() {
        return dManSex;
    }

    public void setdManSex(String dManSex) {
        this.dManSex = dManSex;
    }

    public int getdManTel() {
        return dManTel;
    }

    public void setdManTel(int dManTel) {
        this.dManTel = dManTel;
    }
}
