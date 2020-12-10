package com.yuanjingyu.sevice.impl;

import com.yuanjingyu.entity.Category;
import com.yuanjingyu.mapper.CategoryMapper;
import com.yuanjingyu.sevice.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public List<Category> getCategoryList() {
        return categoryMapper.getCategoryList();
    }
}
