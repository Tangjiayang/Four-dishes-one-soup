package com.vegetable.controller;

import com.vegetable.entity.RecordWatch;
import com.vegetable.service.RecordWatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.vegetable.config.Result;

@RequestMapping("/RecordWatch")
public class RecordWatchController {
    @Autowired

    RecordWatchService recordWatchService;

    @PostMapping("/get")
    public Result<?> getRecordWatch(Integer id) throws Exception{
        return recordWatchService.getRecordWatch(id);
    }
    @PostMapping("/insert")
    public Result<?> insertRecordWatch(RecordWatch recordWatch) throws Exception{
        return recordWatchService.insertRecordWatch(recordWatch);
    }
    @PostMapping("/delete")
    public Result<?> deleteRecordWatch(Integer id) throws Exception{
        return recordWatchService.deleteRecordWatch(id);
    }
    @PostMapping("/update")
    public Result<?> updateRecordWatch(RecordWatch recordWatch) throws Exception{
        return recordWatchService.updateRecordWatch(recordWatch);
    }
}
