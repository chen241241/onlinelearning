package com.ck.onlinelearning.entity;

import javax.annotation.Generated;

public class User {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-03-21T15:33:52.992+08:00", comments="Source field: user.uid")
    private Integer uid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-03-21T15:33:52.995+08:00", comments="Source field: user.name")
    private String name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-03-21T15:33:52.995+08:00", comments="Source field: user.nickname")
    private String nickname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-03-21T15:33:52.995+08:00", comments="Source field: user.password")
    private String password;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-03-21T15:33:52.996+08:00", comments="Source field: user.pid")
    private Integer pid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-03-21T15:33:52.995+08:00", comments="Source field: user.uid")
    public Integer getUid() {
        return uid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-03-21T15:33:52.995+08:00", comments="Source field: user.uid")
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-03-21T15:33:52.995+08:00", comments="Source field: user.name")
    public String getName() {
        return name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-03-21T15:33:52.995+08:00", comments="Source field: user.name")
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-03-21T15:33:52.995+08:00", comments="Source field: user.nickname")
    public String getNickname() {
        return nickname;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-03-21T15:33:52.995+08:00", comments="Source field: user.nickname")
    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-03-21T15:33:52.995+08:00", comments="Source field: user.password")
    public String getPassword() {
        return password;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-03-21T15:33:52.995+08:00", comments="Source field: user.password")
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-03-21T15:33:52.996+08:00", comments="Source field: user.pid")
    public Integer getPid() {
        return pid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-03-21T15:33:52.996+08:00", comments="Source field: user.pid")
    public void setPid(Integer pid) {
        this.pid = pid;
    }
}