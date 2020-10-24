package com.chauncey.blog.service.Impl;

import com.chauncey.blog.dao.UserMapper;
import com.chauncey.blog.model.User;
import com.chauncey.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Transactional
    @Override
    public User findUserByNameAndPasswd(String username, String password) {
        return userMapper.findUserByNameAndPasswd(username, password);
    }
}
