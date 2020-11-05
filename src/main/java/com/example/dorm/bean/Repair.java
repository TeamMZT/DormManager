package com.example.dorm.bean;

import java.util.Date;

/**
 * projectName: dorm
 *
 * @author: 赵振华
 * time: 2020/11/4 17:39
 * description:报修实体类
 */
public class Repair {
    private int rID;
    private String dormBuildName;//报修宿舍楼
    private String dormName;//报修宿舍
    private String dormNote;//报修内容
    private Date reportDate;//报修时间

    public int getrID() {
        return rID;
    }

    public void setrID(int rID) {
        this.rID = rID;
    }

    public String getDormBuildName() {
        return dormBuildName;
    }

    public void setDormBuildName(String dormBuildName) {
        this.dormBuildName = dormBuildName;
    }

    public String getDormName() {
        return dormName;
    }

    public void setDormName(String dormName) {
        this.dormName = dormName;
    }

    public String getDormNote() {
        return dormNote;
    }

    public void setDormNote(String dormNote) {
        this.dormNote = dormNote;
    }

    public Date getReportDate() {
        return reportDate;
    }

    public void setReportDate(Date reportDate) {
        this.reportDate = reportDate;
    }
}
