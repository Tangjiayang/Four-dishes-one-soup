package com.vegetable.service;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.vegetable.config.Result;
import com.vegetable.entity.User;
import com.vegetable.mapper.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
@RestController
@RequestMapping("/user")
@Service
public class UserServicelmp implements UserService {
    @Autowired
    private UserDao userDao;

 @Override
    public Result<?> login (User user){
        //用户登录
        User res = userDao.selectOne(Wrappers.<User>lambdaQuery()
                .eq(User::getPhone,user.getPhone())
                .eq(User::getPassword,user.getPassword()));

        //查询不到用户返回错误
        if (res == null){
            return new Result<>(401,null,"用户名或密码错误！");
        }
//        String token = UUID.randomUUID()+"";
        //String user_id = String.valueOf(res.getUser_id());
        Map<Object, Object> resInfo = new HashMap<Object, Object>();
        resInfo.put("phone",res.getPhone());
        resInfo.put("password",res.getPassword());
        return new Result<>(200,resInfo,"登录成功！");
    }
@Override
//用户注册
    public Result<?> regis(User user){
    //查询用户
    Integer count = Math.toIntExact(userDao.selectCount(Wrappers.<User>lambdaQuery()
            .eq(User::getPhone, user.getPhone())));


    if (count!=0)
        return new Result<>(401,null,"账号已存在！");
    else{

    if (user.getPassword()==null)
        user.setPassword("123456");
    if(user.getPhone().length()!=11)
        return new Result<>(403,null,"请输入正确的电话信息！");
    //user.setUser_password(com.lib.server.utils.Sha.getSHA512(user.getUser_password(),false));
    userDao.insert(user);
    Map<Object, Object> resInfo = new HashMap<Object, Object>();
    //resInfo.put("user_id",res.getId());
    resInfo.put("phone",user.getPhone());
    resInfo.put("password",user.getPassword());
    return new Result<>(200,resInfo,"注册成功！");}
}
    @Override
    public  Result<?> password_change(User user){
    //查询用户
        //用户登录传id；
        User res = userDao.selectOne(Wrappers.<User>lambdaQuery()
                .eq(User::getId,user.getId())
              );

        //查询不到用户返回错误
        if (res == null){
            return new Result<>(401,user,"不存在该用户!");
        }
    res.setPassword(user.getPassword());
    userDao.updateById(res);
    Map<Object, Object> resInfo = new HashMap<Object, Object>();
    resInfo.put("user_id",res.getId());
    resInfo.put("phone",res.getPhone());
    resInfo.put("password",res.getPassword());
    return new Result<>(200,resInfo,"更改密码后的账户信息！");
    }
@Override
    public  Result<?>phone_change(User user)
{//需要获取原id以及新phone
    User res = userDao.selectOne(Wrappers.<User>lambdaQuery()
            .eq(User::getId,user.getId()));

    if(res==null)
        return new Result<>(401,null,"用户账号不存在！");
    res.setPhone(user.getPhone());
    userDao.updateById(res);
    Map<Object, Object> resInfo = new HashMap<Object, Object>();
    resInfo.put("user_id",res.getId());
    resInfo.put("newphone",res.getPhone());
   return new Result<>(200,resInfo,"更改手机绑定后的账户信息！");
}
    public Result<?>information_change(User user){
        User res = userDao.selectOne(Wrappers.<User>lambdaQuery()
                .eq(User::getId,user.getId())
        );
        //yyyy-MM-dd HH:mm:ss
        //查询不到用户返回错误
        if (res == null){
            return new Result<>(401,user,"不存在该用户！");
        }
        userDao.updateById(user);
        return new Result<>(200,user,"更新后的用户信息！");
    }

}

