package com.vegetable.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CreateDao {

    void insert(String postJson);
}

