package com.vegetable.controller;

import com.vegetable.config.Result;
import com.vegetable.entity.Video;
import com.vegetable.entity.BulletScreen;
import com.vegetable.service.VideoService;
import com.vegetable.entity.LikeCoinsCollect;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/first")
public class VideoController {

    private VideoService videoService;

    public VideoController(VideoService videoService){
        this.videoService=videoService;
    }

    @RequestMapping(value = "/insertvideo")
    public Result<?> insertVideo(@RequestBody Video video) throws Exception {
        return videoService.insertVideo(video);
    }

    @RequestMapping(value = "/deletevideo")
    public Result<?> deleteVideo(@RequestParam Integer video_id) throws Exception {
        return videoService.deleteVideo(video_id);
    }

    @RequestMapping(value = "/updatevideo")
    public Result<?> updateVideo(@RequestBody Video video) throws Exception {
        return videoService.updateVideo(video);
    }

    @RequestMapping(value = "/findvideo")
    public Result<?> findVideo(@RequestParam Integer video_id) throws Exception {
        return videoService.findVideo(video_id);
    }

    @RequestMapping(value = "/videoplay")
    public Result<?> videoPlay(@RequestParam Integer video_id) throws Exception {
        return videoService.videoPlay(video_id);
    }

    @RequestMapping(value = "/videosearch")
    public Result<?> videoSearch(@RequestParam String key){
        return videoService.videoSearch(key);
    }

    @RequestMapping(value = "/sendbulletscreen")
    public Result<?> sendBulletScreen(@RequestBody BulletScreen bulletscreen) throws Exception {
        return videoService.sendBulletScreen(bulletscreen);
    }

    @RequestMapping(value = "/like")
    public Result<?> Like(@RequestBody LikeCoinsCollect like) throws Exception {
        return videoService.Like(like);
    }

    @RequestMapping(value = "/unlike")
    public Result<?> unLike(@RequestBody LikeCoinsCollect unlike) throws Exception {
        return videoService.unLike(unlike);
    }

    @RequestMapping(value = "/coins")
    public Result<?> Coins(@RequestBody LikeCoinsCollect coins) throws Exception {
        return videoService.Coins(coins);
    }

    @RequestMapping(value = "/collect")
    public Result<?> Collect(@RequestBody LikeCoinsCollect collect) throws Exception {
        return videoService.Collect(collect);
    }
}
