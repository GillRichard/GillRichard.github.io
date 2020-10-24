package com.chauncey.blog.dao;

import com.chauncey.blog.model.Type;
import com.chauncey.blog.model.TypeExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.Mapping;

import java.util.List;

@Mapper
@Repository
public interface TypeMapper {
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