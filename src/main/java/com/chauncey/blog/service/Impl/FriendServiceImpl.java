package com.chauncey.blog.service.Impl;

import com.chauncey.blog.dao.FriendMapper;
import com.chauncey.blog.model.Friend;
import com.chauncey.blog.service.FriendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class FriendServiceImpl implements FriendService {

    @Autowired
    private FriendMapper friend;

    @Transactional
    @Override
    public int deleteByPrimaryKey(Long id) {
        return friend.deleteByPrimaryKey(id);
    }
    @Transactional
    @Override
    public int insert(Friend record) {
        return friend.insert(record);
    }
    @Transactional
    @Override
    public Friend selectByPrimaryKey(Long id) {
        return friend.selectByPrimaryKey(id);
    }
    @Transactional
    @Override
    public int updateByPrimaryKeySelective(Friend record) {
        return friend.updateByPrimaryKeySelective(record);
    }
    @Transactional
    @Override
    public int updateByPrimaryKey(Friend record) {
        return friend.updateByPrimaryKey(record);
    }
    @Transactional
    @Override
    public List<Friend> listFriendLink() {
        return friend.listFriendLink();
    }
    @Transactional
    @Override
    public Friend getFriendByBlogAddress(String blogaddress) {
        return friend.getFriendByBlogAddress(blogaddress);
    }
}
