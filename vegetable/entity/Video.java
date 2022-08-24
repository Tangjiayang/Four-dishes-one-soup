package com.vegetable.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data   //getset方法
@AllArgsConstructor   //有参构造方法
@NoArgsConstructor   //无参构造方法
public class Video {
    private Integer video_id;
    private String url_video;
    private String pic;
    private String title;
    private String desc;
    private Date pubdate;
    private Date ctime;
    private String user_grab;
    private Integer state;
    private Integer duration;
    private Integer count_dislike;
    private Integer count_like;
    private Integer count_coins;
    private Integer count_collect;
    private Integer count_play;
    private Integer count_bullet_screen;
    private Integer count_comment;
}
