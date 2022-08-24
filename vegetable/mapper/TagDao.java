package com.vegetable;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.vegetable.entity.Tag;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TagDao extends BaseMapper<Tag> {
}
