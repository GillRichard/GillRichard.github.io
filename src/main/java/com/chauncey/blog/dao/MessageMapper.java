package com.chauncey.blog.dao;

import com.chauncey.blog.model.Message;
import com.chauncey.blog.model.MessageExample;

public interface MessageMapper {
    long countByExample(MessageExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Message record);

    int insertSelective(Message record);

    Message selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Message record);

    int updateByPrimaryKey(Message record);
}