package com.vegetable.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RecordWatch {
    private Integer id;
    private Integer user_id;
    private Integer video_id;
    private Date time_watch;
    private Integer record_watch;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getVideo_id() {
        return video_id;
    }

    public void setVideo_id(Integer video_id) {
        this.video_id = video_id;
    }

    public Date getTime_watch() {
        return time_watch;
    }

    public void setTime_watch(Date time_watch) {
        this.time_watch = time_watch;
    }

    public Integer getRecord_watch() {
        return record_watch;
    }

    public void setRecord_watch(Integer record_watch) {
        this.record_watch = record_watch;
    }
}
