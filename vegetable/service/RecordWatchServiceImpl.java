package com.vegetable.service;

import com.vegetables.shortv.dao.RecordWatchDao;
import com.vegetable.entity.RecordWatch;
import org.springframework.stereotype.Service;
import com.vegetable.config.Result;

@Service
public class RecordWatchServiceImpl implements RecordWatchService{
    private RecordWatchDao recordWatchDao;
    @Override
    public Result<?> getRecordWatch(Integer id){

        return new Result<>(200,recordWatchDao.selectById(id),"读取成功！");
    }
    @Override
    public Result<?> insertRecordWatch(RecordWatch recordWatch){
        recordWatchDao.insert(recordWatch);
        return new Result<>(200,null,"插入成功！");
    }
    @Override
    public Result<?> deleteRecordWatch(Integer id){
        recordWatchDao.deleteById(id);
        return new Result<>(200,null,"删除成功！");
    }
    @Override
    public Result<?> updateRecordWatch(RecordWatch recordWatch){
        recordWatchDao.updateById(recordWatch);
        return new Result<>(200,null,"更新成功！");
    }
}
