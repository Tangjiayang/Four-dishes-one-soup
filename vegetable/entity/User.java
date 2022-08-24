package com.vegetable.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * User实体类
 * */
@TableName("user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @TableId(value = "id",type= IdType.AUTO)
    private Integer id;
    private String username;
    private String password;
    private String phone;
    private Integer sex;
    private String face;
    private String sign;
    private Date birthday;
    private String school;
    private Integer is_administrator;
    private String live_room;

}
