package com.vegetable.service;

import com.vegetable.entity.RecordWatch;
import com.vegetable.config.Result;

public interface RecordWatchService {
    Result<?> getRecordWatch(Integer id);
    Result<?> insertRecordWatch(RecordWatch recordWatch);
    Result<?> deleteRecordWatch(Integer id);
    Result<?> updateRecordWatch(RecordWatch recordWatch);
}
