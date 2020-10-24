package com.chauncey.blog.dao;

import com.chauncey.blog.model.Picture;
import com.chauncey.blog.model.PictureExample;

public interface PictureMapper {
    long countByExample(PictureExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Picture record);

    int insertSelective(Picture record);

    Picture selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Picture record);

    int updateByPrimaryKey(Picture record);
}