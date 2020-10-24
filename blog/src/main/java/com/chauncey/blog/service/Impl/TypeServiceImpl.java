package com.chauncey.blog.service.Impl;

import com.chauncey.blog.dao.TypeMapper;
import com.chauncey.blog.model.Type;
import com.chauncey.blog.model.TypeExample;
import com.chauncey.blog.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class TypeServiceImpl implements TypeService {

    @Autowired
    private TypeMapper typeMapper;

    @Transactional
    @Override
    public long countByExample(TypeExample example) {
        return typeMapper.countByExample(example);
    }

    @Transactional
    @Override
    public int deleteByPrimaryKey(Long id) {
        return typeMapper.deleteByPrimaryKey(id);
    }

    @Transactional
    @Override
    public int insert(Type record) {
        return typeMapper.insert(record);
    }

    @Transactional
    @Override
    public int insertSelective(Type record) {
        return typeMapper.insertSelective(record);
    }

    @Transactional
    @Override
    public Type selectByPrimaryKey(Long id) {
        return typeMapper.selectByPrimaryKey(id);
    }

    @Transactional
    @Override
    public int updateByPrimaryKeySelective(Type record) {
        return typeMapper.updateByPrimaryKeySelective(record);
    }

    @Transactional
    @Override
    public int updateByPrimaryKey(Type record) {
        return typeMapper.updateByPrimaryKey(record);
    }

    @Transactional
    @Override
    public List<Type> selectAllType() {
        return typeMapper.selectAllType();
    }

    @Override
    public Type getTypeByName(String name) {
        return typeMapper.getTypeByName(name);
    }
}
