package com.chauncey.blog.dao;

import com.chauncey.blog.model.User;
import com.chauncey.blog.model.UserExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

@Repository
public interface UserMapper {
    long countByExample(UserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User findUserByNameAndPasswd(@Param("username") String username, @Param("password") String password);
}