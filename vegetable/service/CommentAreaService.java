package com.vegetable.service;


import com.vegetable.entity.CommentArea;

public interface CommentAreaService {
    CommentArea getCommentArea(Integer id);
    void insertCommentArea(CommentArea commentArea);
    void deleteCommentArea(Integer id);
    void updateCommentArea(CommentArea commentArea);
}
