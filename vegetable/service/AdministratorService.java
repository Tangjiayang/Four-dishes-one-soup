package com.vegetable.service;

import com.vegetable.config.Result;
import com.vegetable.entity.Administrator;


public interface AdministratorService {
    Integer administratorLogin(String name,String password);

    Result<?> getAdministrator(Integer ad_id);

    Result<?> insertAdministrator(Administrator administrator);

    Result<?> deleteAdministrator(Integer ad_id);

    Result<?> updateAdministrator(Administrator administrator);
}
