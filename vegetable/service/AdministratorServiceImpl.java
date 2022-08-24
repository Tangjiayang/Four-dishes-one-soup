package com.vegetable.service;

import com.vegetable.entity.Administrator;
import com.vegetable.mapper.AdministratorDao;
import com.vegetable.service.AdministratorService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import com.vegetable.config.Result;
@Service
public class AdministratorServiceImpl implements AdministratorService {
    private AdministratorDao administratorDao;
    @Override
    public Integer administratorLogin(String name,String password){
        Map<String, Object> param = new HashMap<>();
        param.put("name",name);
        List<Administrator> ad=administratorDao.selectByMap(param);
        if(ad.isEmpty()){
            return 22;
        }
        for(Administrator a:ad){
            if(Objects.equals(a.getPassword(), password)){
                return 0;
            }
            else{
                return 11;
            }
        }
        return 33;
    }

    @Override
    public Result<?> getAdministrator(Integer ad_id){
        return new Result<>(200,administratorDao.selectById(ad_id),"读取成功！");
    }
    @Override
    public Result<?> insertAdministrator(Administrator administrator){
        administratorDao.insert(administrator);
        return new Result<>(200,null,"插入成功！");
    }
    @Override
    public Result<?> deleteAdministrator(Integer ad_id){
        administratorDao.deleteById(ad_id);
        return new Result<>(200,null,"删除成功！");
    }
    @Override
    public Result<?> updateAdministrator(Administrator administrator){
        administratorDao.updateById(administrator);
        return new Result<>(200,null,"更新成功！");
    }
}
