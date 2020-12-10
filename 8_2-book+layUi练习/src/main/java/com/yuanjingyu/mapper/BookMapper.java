package com.yuanjingyu.mapper;

import com.yuanjingyu.entity.Book;

import java.util.List;

/**
 * 图书增删改查接口
 */
public interface BookMapper {

    /*添加图书*/
    void addBook(Book book);

    /*删除图书*/
    void deleteBook(Integer bookId);

    /*更新图书*/
    void updateBook(Book book);

    /*查询图书列表*/
    List<Book> getBookList();

}
