package com.example.dorm.bean;

import java.sql.Date;

/**
 * projectName: dorm
 *
 * @author: 12510
 * time: 2020/11/4 16:36
 * description:临时访客实体类
 */
public class DormGuest {
    private int gId;
    private String gName;
    private String gSex;
    private String gTel;
    private String gNote;
    private Date gDate;
    private String gType;

    public int getgId() {
        return gId;
    }

    public void setgId(int gId) {
        this.gId = gId;
    }

    public String getgName() {
        return gName;
    }

    public void setgName(String gName) {
        this.gName = gName;
    }

    public String getgSex() {
        return gSex;
    }

    public void setgSex(String gSex) {
        this.gSex = gSex;
    }

    public String getgTel() {
        return gTel;
    }

    public void setgTel(String gTel) {
        this.gTel = gTel;
    }

    public String getgNote() {
        return gNote;
    }

    public void setgNote(String gNote) {
        this.gNote = gNote;
    }

    public Date getgDate() {
        return gDate;
    }

    public void setgDate(Date gDate) {
        this.gDate = gDate;
    }

    public String getgType() {
        return gType;
    }

    public void setgType(String gType) {
        this.gType = gType;
    }
}
