package com.vegetable.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data   //getset方法
@AllArgsConstructor   //有参构造方法
@NoArgsConstructor   //无参构造方法
public class LikeCoinsCollect {
    private Integer id;
    private Integer user_id;
    private Integer video_id;
    private Integer is_like;
    private Integer is_coins;
    private Integer is_collect;
    private Date time_like;
    private Date time_coins;
    private Date time_collect;

}