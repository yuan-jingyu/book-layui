package com.yuanjingyu.mapper;

import com.yuanjingyu.entity.Category;

import java.util.List;

/**
 * 下拉分类的接口
 */
public interface CategoryMapper {

    /*获取分类列表*/
    List<Category> getCategoryList();

}
