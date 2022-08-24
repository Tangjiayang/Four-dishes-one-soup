package com.vegetable.controller;

import com.vegetable.config.Result;
import com.vegetable.entity.Administrator;
import com.vegetable.service.AdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/Administrator")
public class AdministratorController{
    @Autowired

    AdministratorService administratorService;

    @PostMapping("/get")
    public Result<?> getAdministrator(Integer ad_id) throws Exception{
        return administratorService.getAdministrator(ad_id);
    }
    @PostMapping("/insert")
    public Result<?> insertAdministrator(Administrator administrator) throws Exception{
        return administratorService.insertAdministrator(administrator);
    }
    @PostMapping("/delete")
    public Result<?> deleteAdministrator(Integer ad_id) throws Exception{
        return administratorService.deleteAdministrator(ad_id);
    }
    @PostMapping("/updata")
    public Result<?> updateAdministrator(Administrator administrator) throws Exception{
        return administratorService.updateAdministrator(administrator);
    }
}
