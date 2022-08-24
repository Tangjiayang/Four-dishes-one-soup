package com.vegetable.controller;

import com.vegetable.config.Result;
import com.vegetable.entity.VideoTag;
import com.vegetable.service.VideoTagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@RequestMapping("/VideoTag")
public class VideoTagController {
    @Autowired

    VideoTagService videoTagService;

    @PostMapping("/get")
    public Result<?> getVideoTag(Integer id) throws Exception{
        return videoTagService.getVideoTag(id);
    }
    @PostMapping("/insert")
    public Result<?> insertVideoTag(VideoTag videoTag) throws Exception{
        return videoTagService.insertVideoTag(videoTag);
    }
    @PostMapping("/delete")
    public Result<?> deleteVideoTag(Integer id) throws Exception{
        return videoTagService.deleteVideoTag(id);
    }
    @PostMapping("/updata")
    public Result<?> updateVideoTag(VideoTag videoTag) throws Exception{
        return videoTagService.updateVideoTag(videoTag);
    }
}
