package com.example.dorm.bean;

import java.security.SecureRandom;

/**
 * projectName: dorm
 *
 * @author: 12510
 * time: 2020/11/4 17:43
 * description:宿舍实体类
 */
public class Dorm {
    private int dormId;
    private int dormBuildId;
    private String dormName;
    private String dormType;
    private int dormNumber;
    private String dormTel;

    public int getDormId() {
        return dormId;
    }

    public void setDormId(int dormId) {
        this.dormId = dormId;
    }

    public int getDormBuildId() {
        return dormBuildId;
    }

    public void setDormBuildId(int dormBuildId) {
        this.dormBuildId = dormBuildId;
    }

    public String getDormName() {
        return dormName;
    }

    public void setDormName(String dormName) {
        this.dormName = dormName;
    }

    public String getDormType() {
        return dormType;
    }

    public void setDormType(String dormType) {
        this.dormType = dormType;
    }

    public int getDormNumber() {
        return dormNumber;
    }

    public void setDormNumber(int dormNumber) {
        this.dormNumber = dormNumber;
    }

    public String getDormTel() {
        return dormTel;
    }

    public void setDormTel(String dormTel) {
        this.dormTel = dormTel;
    }
}