package com.chauncey.blog.dao;

import com.chauncey.blog.model.Friend;
import com.chauncey.blog.model.FriendExample;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FriendMapper {
    long countByExample(FriendExample example);

    int deleteByPrimaryKey(Long id);


    int insert(Friend record); //添加朋友

    int insertSelective(Friend record);

    Friend selectByPrimaryKey(Long id);//根据id查询朋友信息


    int updateByPrimaryKeySelective(Friend record);//更新信息

    int updateByPrimaryKey(Friend record);


    List<Friend> listFriendLink(); //查询所有朋友

    Friend getFriendByBlogAddress(String blogaddress);//根据朋友博客地址查询友链




}