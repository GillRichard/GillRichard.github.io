package com.chauncey.blog.service;

import com.chauncey.blog.model.User;

public interface UserService {
    public User findUserByNameAndPasswd(String username, String password);
}
