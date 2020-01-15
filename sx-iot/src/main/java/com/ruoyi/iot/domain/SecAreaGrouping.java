package com.ruoyi.iot.domain;

import java.util.List;

/**
 * Created by ASUS on 2019/8/2.
 * @author 陈霞
 * 分组管理
 */
public class SecAreaGrouping {
    private String aid;//区域编号
    private String parentaid;//父区域编号
    private String aname;//区域名称
    private String note;//备注
    private String time;//最后警报时间
    private String userid;//用户id

    private String parentaname;
    private List<SecArea> subSecArea;
    private Long uid;

    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid;
    }

    public String getParentaid() {
        return parentaid;
    }

    public void setParentaid(String parentaid) {
        this.parentaid = parentaid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getNote() {
        return note;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getParentaname() {
        return parentaname;
    }

    public void setParentaname(String parentaname) {
        this.parentaname = parentaname;
    }

    public List<SecArea> getSubSecArea() {
        return subSecArea;
    }

    public void setSubSecArea(List<SecArea> subSecArea) {
        this.subSecArea = subSecArea;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        return "SecAreaGrouping{" +
                "aid='" + aid + '\'' +
                ", parentaid='" + parentaid + '\'' +
                ", aname='" + aname + '\'' +
                ", note='" + note + '\'' +
                ", time='" + time + '\'' +
                ", userid='" + userid + '\'' +
                ", parentaname='" + parentaname + '\'' +
                ", subSecArea=" + subSecArea +
                ", uid=" + uid +
                '}';
    }
}