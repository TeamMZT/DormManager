package com.example.dorm.bean;

/**
 * projectName: dorm
 *
 * @author: 赵振华
 * time: 2020/11/4 14:39
 * description:学生实体类
 */
public class Student {
    private int stuId;//编号
    private int stuNum;//学号
    private String stuName;//姓名
    private String stuBuidId;//宿舍楼id
    private int dormName;//宿舍房间id
    private String stuSex;//性别
    private String stuTel;//电话

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public int getStuNum() {
        return stuNum;
    }

    public void setStuNum(int stuNum) {
        this.stuNum = stuNum;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuBuidId() {
        return stuBuidId;
    }

    public void setStuBuidId(String stuBuidId) {
        this.stuBuidId = stuBuidId;
    }

    public int getDormName() {
        return dormName;
    }

    public void setDormName(int dormName) {
        this.dormName = dormName;
    }

    public String getStuSex() {
        return stuSex;
    }

    public void setStuSex(String stuSex) {
        this.stuSex = stuSex;
    }

    public String getStuTel() {
        return stuTel;
    }

    public void setStuTel(String stuTel) {
        this.stuTel = stuTel;
    }
}
