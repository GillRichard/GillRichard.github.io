package com.chauncey.blog.dao;

import com.chauncey.blog.model.Blog;
import com.chauncey.blog.model.BlogExample;

public interface BlogMapper {
    long countByExample(BlogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Blog record);

    int insertSelective(Blog record);

    Blog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Blog record);

    int updateByPrimaryKeyWithBLOBs(Blog record);

    int updateByPrimaryKey(Blog record);
}