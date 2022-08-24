package com.vegetable.service;

import com.vegetable.TagDao;

import com.vegetable.config.Result;
import com.vegetable.entity.Tag;
import org.springframework.stereotype.Service;
@Service
public class TagServiceImpl implements com.vegetables.shortv.service.TagService {
    private TagDao tagDao;

    @Override
    public Result<?> getTag(Integer tag_id){
        return new Result<>(200,tagDao.selectById(tag_id),"读取成功！");

    }
    @Override
    public Result<?> insertTag(Tag tag){
        tagDao.insert(tag);
        return new Result<>(200,null,"插入成功！");
    }
    @Override
    public Result<?> deleteTag(Integer tag_id){
        tagDao.deleteById(tag_id);
        return new Result<>(200,null,"删除成功！");
    }
    @Override
    public Result<?> updateTag(Tag tag){
        tagDao.updateById(tag);
        return new Result<>(200,null,"更新成功！");
    }



}
