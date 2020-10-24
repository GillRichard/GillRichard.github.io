package com.chauncey.blog.service;


import com.chauncey.blog.model.Type;
import com.chauncey.blog.model.TypeExample;

import java.util.List;

/**
 * @Description 分类业务层接口
 */
public interface TypeService{
    long countByExample(TypeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Type record);

    int insertSelective(Type record);

    Type selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Type record);

    int updateByPrimaryKey(Type record);

    List<Type> selectAllType();

    Type getTypeByName(String name);
}
