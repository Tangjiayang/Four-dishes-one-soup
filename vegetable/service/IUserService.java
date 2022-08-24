package com.vegetable.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.vegetable.entity.User;


public interface IUserService  extends IService<User> {

    User selectUserById(int id);
}
