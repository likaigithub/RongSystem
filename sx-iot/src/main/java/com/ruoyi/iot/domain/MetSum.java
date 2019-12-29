package com.ruoyi.iot.domain;

import com.ruoyi.common.base.BaseEntity;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.springframework.stereotype.Repository;

/**
 * @开发人员：周宇滔
 * @开发单位：湖南农业大学物联网工程专业
 */
@Repository
public class MetSum extends BaseEntity {

    private static final long serialVersionUID = 1L;


    private String hum;
    private String sumhum;
    private String rname;
    private String sumrain;

    public String getHum() {
        return hum;
    }

    public void setHum(String hum) {
        this.hum = hum;
    }

    public String getSumhum() {
        return sumhum;
    }

    public void setSumhum(String sumhum) {
        this.sumhum = sumhum;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public String getSumrain() {
        return sumrain;
    }

    public void setSumrain(String sumrain) {
        this.sumrain = sumrain;
    }

    /*@Override
    public String toString(){
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("hum",getHum())
                .append("sumhum",getSumhum())
                .append("rname",getRname())
                .append("sumrain",getSumrain())
                .toString();
    }*/

    @Override
    public String toString() {
        return "MetSum{" +
                "hum='" + hum + '\'' +
                ", sumhum='" + sumhum + '\'' +
                ", rname='" + rname + '\'' +
                ", sumrain='" + sumrain + '\'' +
                '}';
    }
}
