package com.yuanjingyu.controller;

import com.yuanjingyu.dto.Page;
import com.yuanjingyu.dto.Result;
import com.yuanjingyu.entity.Book;
import com.yuanjingyu.sevice.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@CrossOrigin
@ResponseBody
@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    /*获取分页数据*/
    @RequestMapping(value = "/getBookPage")
    public Result getBookPage(Integer pageNo,Integer pageSize){
        if (pageNo==null){
            pageNo=1;
        }
        if (pageSize==null){
            pageSize=5;
        }
        Page page = bookService.getBookPage(pageNo, pageSize);

        //-->com.yuanjingyu.dto.Message  -补充->private String msg = "ok!";
        //-->com.yuanjingyu.dto.Result   -补充->private Message  message = new Message(); //返回信息
        Result result = new Result();
        result.setData(page);
        return result;
    }

    /*添加图书*/
    @RequestMapping(value = "/addBook")
    public Result addBook(@RequestBody Book book){  //@RequestBody前台传数据
        bookService.addBook(book);
        Result result = new Result();
        return result;
    }

    /*删除图书*/
    @RequestMapping(value = "/deleteBook")
    public Result deleteBook(Integer bookId){
        bookService.deleteBook(bookId);
        Result result = new Result();
        return result;
    }

    /*更新图书*/
    @RequestMapping(value = "/updateBook")
    public Result updateBook(@RequestBody Book book){
        bookService.updateBook(book);
        Result result = new Result();
        return result;
    }

}



























