package com.chauncey.blog.service;

import com.chauncey.blog.model.Friend;

import java.util.List;

public interface FriendService {

    int deleteByPrimaryKey(Long id);

    int insert(Friend record); //添加朋友

    Friend selectByPrimaryKey(Long id);//根据id查询朋友信息


    int updateByPrimaryKeySelective(Friend record);//更新信息

    int updateByPrimaryKey(Friend record);


    List<Friend> listFriendLink(); //查询所有朋友

    Friend getFriendByBlogAddress(String blogaddress);//根据朋友博客地址查询友链

}
