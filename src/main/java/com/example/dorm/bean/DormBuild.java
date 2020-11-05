package com.example.dorm.bean;

/**
 * projectName: dorm
 *
 * @author: 12510
 * time: 2020/11/4 14:40
 * description:宿舍楼实体类
 */
public class DormBuild {
    private int dormBuildId;
    private String dormBuildName;
    private String dormBuildNote;

    public int getDormBuildId() {
        return dormBuildId;
    }

    public void setDormBuildId(int dormBuildId) {
        this.dormBuildId = dormBuildId;
    }

    public String getDormBuildName() {
        return dormBuildName;
    }

    public void setDormBuildName(String dormBuildName) {
        this.dormBuildName = dormBuildName;
    }

    public String getDormBuildNote() {
        return dormBuildNote;
    }

    public void setDormBuildNote(String dormBuildNote) {
        this.dormBuildNote = dormBuildNote;
    }
}
