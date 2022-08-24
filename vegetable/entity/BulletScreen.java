package com.vegetable.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data   //getset方法
@AllArgsConstructor   //有参构造方法
@NoArgsConstructor   //无参构造方法
public class BulletScreen {
    private Integer id;
    private Integer user_id;
    private Integer video_id;
    private String bullet_screen;
    private Date in_time;
    private Integer mode;
    private Integer fontsize;
    private Integer color;
    private Integer count_dislike;
    private Integer count_like;
}
