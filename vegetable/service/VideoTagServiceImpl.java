package com.vegetable.service;

import com.vegetable.config.Result;
import com.vegetable.entity.VideoTag;
import com.vegetable.mapper.VideoTagDao;
import org.springframework.stereotype.Service;

@Service
public class VideoTagServiceImpl implements VideoTagService{
    private VideoTagDao videoTagDao;
    @Override
    public Result<?> getVideoTag(Integer id){

        return new Result<>(200,videoTagDao.selectById(id),"读取成功！");
    }
    @Override
    public Result<?> deleteVideoTag(Integer id){
        videoTagDao.deleteById(id);
        return new Result<>(200,null,"插入成功！");
    }
    @Override
    public Result<?> insertVideoTag(VideoTag videoTag){
        videoTagDao.insert(videoTag);
        return new Result<>(200,null,"删除成功！");
    }
    @Override
    public Result<?> updateVideoTag(VideoTag videoTag){
        videoTagDao.updateById(videoTag);
        return new Result<>(200,null,"更新成功！");
    }

}
