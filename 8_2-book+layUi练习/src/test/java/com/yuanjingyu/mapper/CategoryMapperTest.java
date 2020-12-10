package com.yuanjingyu.mapper;

import com.yuanjingyu.base.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class CategoryMapperTest extends BaseTest {

    @Autowired
    private CategoryMapper categoryMapper;

    @Test
    public void getCategoryList() {
        categoryMapper.getCategoryList().forEach(System.out::println);
    }
}