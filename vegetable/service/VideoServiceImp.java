package com.vegetable.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.vegetable.config.Result;
import com.vegetable.entity.BulletScreen;
import com.vegetable.mapper.BulletScreenDao;
import com.vegetable.mapper.LikeCoinsCollectDao;
import com.vegetable.entity.LikeCoinsCollect;
import com.vegetable.entity.Video;
import org.springframework.stereotype.Service;
import com.vegetable.mapper.VideoDao;

import java.util.List;

@Service
public class VideoServiceImp implements VideoService {
    private VideoDao videoDao;
    private BulletScreenDao bulletScreenDao;
    private LikeCoinsCollectDao likeCoinsCollectDao;
    @Override
    public Result<?> videoPlay(Integer video_id){
        Video x = videoDao.selectById(video_id);
        if(x==null)
        {return new Result<>(401,null,"视频不存在!");}
        Integer num = x.getCount_play()+1;
        x.setCount_play(num);
        videoDao.updateById(x);
        return new Result<>(200,x,"成功");
    };

    @Override
    public Result<?> insertVideo(Video video){
        videoDao.insert(video);
        return new Result<>(200,null,"成功");
    };

    @Override
    public Result<?> deleteVideo(Integer video_id){
        Video x = videoDao.selectById(video_id);
        if(x==null)
        {return new Result<>(401,null,"视频不存在!");}
        videoDao.deleteById(video_id);
        return new Result<>(200,null,"成功");
    };

    @Override
    public Result<?> updateVideo(Video video){
        Video x = videoDao.selectById(video.getVideo_id());
        if(x==null)
        {return new Result<>(401,null,"视频不存在!");}
        videoDao.updateById(video);
        return new Result<>(200,null,"成功");
    };

    @Override
    public Result<?> findVideo(Integer video_id){
        Video x = videoDao.selectById(video_id);
        if(x==null)
        {return new Result<>(401,null,"视频不存在!");}
        return new Result<>(200,videoDao.selectById(video_id),"成功");
    };

    @Override
    public Result<?> videoSearch(String key){
        QueryWrapper<Video> videoWrapper = new QueryWrapper<>();
        videoWrapper.like("title",key).orderByAsc("number");
        List<Video> videos = videoDao.selectList(videoWrapper);
        if(videos==null)
        {return new Result<>(401,null,"无相关视频！");}
        return new Result<>(200,videos,"成功");
    }

    @Override
    public Result<?> sendBulletScreen(BulletScreen bullet_screen){
        bulletScreenDao.insert(bullet_screen);
        Video x = videoDao.selectById(bullet_screen.getVideo_id());
        Integer num = x.getCount_bullet_screen()+1;
        x.setCount_bullet_screen(num);
        videoDao.updateById(x);
        return new Result<>(200,null,"成功");
    }
    @Override
    public Result<?> Like(LikeCoinsCollect like){
        likeCoinsCollectDao.insert(like);
        Video x = videoDao.selectById(like.getVideo_id());
        Integer num = x.getCount_like()+1;
        x.setCount_like(num);
        videoDao.updateById(x);
        return new Result<>(200,null,"成功");
    }
    @Override
    public Result<?> unLike(LikeCoinsCollect unlike){
        likeCoinsCollectDao.deleteById(unlike.getId());
        Video x = videoDao.selectById(unlike.getVideo_id());
        Integer num = x.getCount_like()-1;
        x.setCount_like(num);
        videoDao.updateById(x);
        return new Result<>(200,null,"成功");
    }
    @Override
    public Result<?> Coins(LikeCoinsCollect coins){
        likeCoinsCollectDao.insert(coins);
        Video x = videoDao.selectById(coins.getVideo_id());
        Integer num = x.getCount_coins()+1;
        x.setCount_coins(num);
        videoDao.updateById(x);
        return new Result<>(200,null,"成功");
    }
    @Override
    public Result<?> Collect(LikeCoinsCollect collect){
        likeCoinsCollectDao.insert(collect);
        Video x = videoDao.selectById(collect.getVideo_id());
        Integer num = x.getCount_collect()+1;
        x.setCount_collect(num);
        videoDao.updateById(x);
        return new Result<>(200,null,"成功");
    }
}
