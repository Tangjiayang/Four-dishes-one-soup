package com.vegetables.shortvideo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * User实体类
 * */

@Data
@AllArgsConstructor
@NoArgsConstructor

public class User {

    private Integer user_id;
    private String username;
    private String password;
    private Integer sex;
    private String face;
    private String sign;
    private Date birthday;
    private String school;
    private Integer is_administrator;
    private String live_room;

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public Integer getIs_administrator() {
        return is_administrator;
    }

    public void setIs_administrator(Integer is_administrator) {
        this.is_administrator = is_administrator;
    }

    public String getLive_room() {
        return live_room;
    }

    public void setLive_room(String live_room) {
        this.live_room = live_room;
    }
}
