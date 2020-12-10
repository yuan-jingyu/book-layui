package com.yuanjingyu.sevice;

import com.yuanjingyu.base.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class CategoryServiceTest extends BaseTest {

    @Autowired
    private CategoryService categoryService;

    @Test
    public void getCategoryList() {
        categoryService.getCategoryList().forEach(System.out::println);
    }
}