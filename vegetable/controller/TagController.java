package com.vegetable.controller;

import com.vegetable.config.Result;
import com.vegetable.entity.Tag;
import com.vegetables.shortv.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/tag")
public class TagController {
    @Autowired

    TagService tagService;

    @PostMapping("/get")
    public Result<?> getTag(Integer id) throws Exception{
        return tagService.getTag(id);
    }
    @PostMapping("/insert")
    public Result<?> insertTag(Tag tag) throws Exception{
        return tagService.insertTag(tag);
    }
    @PostMapping("/delete")
    public Result<?> deleteTag(Integer id) throws Exception{
        return tagService.deleteTag(id);
    }
    @PostMapping("/updata")
    public Result<?> updateTag(Tag tag) throws Exception{
        return tagService.updateTag(tag);
    }




}
