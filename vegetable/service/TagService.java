package com.vegetables.shortv.service;

import com.vegetable.config.Result;
import com.vegetable.entity.Tag;


public interface TagService {
    Result<?> getTag(Integer tag_id);
    Result<?> insertTag(Tag tag);
    Result<?> deleteTag(Integer tag_id);
    Result<?> updateTag(Tag tag);
}
