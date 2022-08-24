package com.vegetable.service;

import com.vegetable.config.Result;
import com.vegetable.entity.VideoTag;


public interface VideoTagService {
    Result<?> getVideoTag(Integer id);
    Result<?> deleteVideoTag(Integer id);
    Result<?> insertVideoTag(VideoTag videoTag);
    Result<?> updateVideoTag(VideoTag videoTag);
}
