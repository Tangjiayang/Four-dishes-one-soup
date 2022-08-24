package com.vegetable.service;

import com.vegetable.entity.CommentArea;
import com.vegetable.mapper.CommentAreaDao;
import org.springframework.stereotype.Service;

@Service
public class CommentAreaServiceImpl implements CommentAreaService {
    private CommentAreaDao commentAreaDao;
    @Override
    public CommentArea getCommentArea(Integer id){
        return commentAreaDao.selectById(id);
    }
    @Override
    public void insertCommentArea(CommentArea commentArea){
        commentAreaDao.insert(commentArea);
    }
    @Override
    public void deleteCommentArea(Integer id){
        commentAreaDao.deleteById(id);
    }
    @Override
    public void updateCommentArea(CommentArea commentArea){
        commentAreaDao.updateById(commentArea);
    }
}
