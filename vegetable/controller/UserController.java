package com.vegetable.controller;

import com.vegetable.config.Result;
import com.vegetable.entity.User;
import com.vegetable.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {


//    @Autowired
//    UserDao userMapper;
//
//    @PostMapping("/login")
//    public Result<?> login(@RequestBody User user){
//        //数据校验；
//        user.setPassword(user.getPassword());
//        //查询用
//        User res = userMapper.selectOne(Wrappers.<User>lambdaQuery()
//                .eq(User::getUser_id,user.getUser_id())
//                .eq(User::getPassword,user.getPassword()));
//
//        //查询不到用户返回错误
//        if (res == null){
//            return new Result<>(401,null,"用户名或密码错误！");
//        }
//
////        String token = UUID.randomUUID()+"";
//        String user_id = String.valueOf(res.getUser_id());
//        Map<Object, Object> resInfo = new HashMap<Object, Object>();
//        resInfo.put("user_id",user_id);
//        resInfo.put("password",res.getPassword());
//        System.out.println("user_id now is " +user_id);
//        return new Result<>(200,resInfo,"登录成功！");
//    }
    @Autowired
UserService userService;
    @PostMapping("/login")
    public Result<?> login(@RequestBody User user) throws Exception{
        return userService.login(user);
    }

    @PostMapping("/regis")
    public Result<?> regis(@RequestBody User user){
        return userService.regis(user);
    }
    @PostMapping("/change/password")

    public  Result<?>password_change( @RequestBody User user){
        return userService.password_change(user);
    }
    @PostMapping("/change/phone")
    public  Result<?>phone_change(@RequestBody User user){
        return userService.phone_change(user);
    }
    @PostMapping("/change/information")
    public  Result<?>information_change(@RequestBody User user){
        return userService.information_change(user);
    }




}
