package com.yuanjingyu.controller;

import com.yuanjingyu.dto.Message;
import com.yuanjingyu.dto.Result;
import com.yuanjingyu.entity.Category;
import com.yuanjingyu.sevice.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@CrossOrigin
@ResponseBody
@Controller
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    /*获取分类列表*/
    @RequestMapping(value = "/getCategoryList")
    public Result getCategoryList(){
        Result result = new Result();
        Message message = new Message();
        message.setCode(0);
        message.setMsg("成功");
        //int i = 1/0;  //异常
        result.setMessage(message);
        List<Category> categoryList = categoryService.getCategoryList();
        result.setData(categoryList);
        return result;
    }

}
