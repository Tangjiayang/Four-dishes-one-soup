package com.vegetable.service;

import com.vegetable.config.Result;
import com.vegetable.entity.BulletScreen;
import com.vegetable.entity.LikeCoinsCollect;
import com.vegetable.config.Result;
import com.vegetable.entity.Video;

public interface VideoService {
    Result<?> videoPlay(Integer video_id);

    Result<?> insertVideo(Video video);

    Result<?> deleteVideo(Integer video_id);

    Result<?> updateVideo(Video video);

    Result<?> findVideo(Integer video_id);

    Result<?> videoSearch(String key);

    Result<?> sendBulletScreen(BulletScreen bullet_screen);

    Result<?> Like(LikeCoinsCollect like);

    Result<?> unLike(LikeCoinsCollect unlike);

    Result<?> Coins(LikeCoinsCollect coins);

    Result<?> Collect(LikeCoinsCollect collect);


}
