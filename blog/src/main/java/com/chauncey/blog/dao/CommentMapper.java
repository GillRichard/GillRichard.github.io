package com.chauncey.blog.dao;

import com.chauncey.blog.model.Comment;
import com.chauncey.blog.model.CommentExample;

public interface CommentMapper {
    long countByExample(CommentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Comment record);

    int insertSelective(Comment record);

    Comment selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Comment record);

    int updateByPrimaryKey(Comment record);
}