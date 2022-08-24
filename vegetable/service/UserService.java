package com.vegetable.service;
import com.vegetable.config.Result;
import com.vegetable.entity.User;

public interface UserService {
    //用户登录
    Result<?> login(User user) ;
    //用户注册
    Result<?> regis(User user);
    //用户密码修改
    Result<?> password_change(User user);
    //用户账户改绑
    Result<?> phone_change(User user);
    //用户信息修改
    Result<?> information_change(User user);

    //Result<?> password_change(User user, String new_pass);
    //信息修改：1
    //
}
