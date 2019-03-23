package com.ck.onlinelearning.entity;

import javax.annotation.Generated;

public class Power {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-03-21T15:33:53.007+08:00", comments="Source field: power.pid")
    private Integer pid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-03-21T15:33:53.007+08:00", comments="Source field: power.pname")
    private String pname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-03-21T15:33:53.007+08:00", comments="Source field: power.pid")
    public Integer getPid() {
        return pid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-03-21T15:33:53.007+08:00", comments="Source field: power.pid")
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-03-21T15:33:53.007+08:00", comments="Source field: power.pname")
    public String getPname() {
        return pname;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-03-21T15:33:53.008+08:00", comments="Source field: power.pname")
    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
    }
}