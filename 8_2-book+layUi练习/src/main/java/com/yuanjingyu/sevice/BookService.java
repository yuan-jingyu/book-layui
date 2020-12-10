package com.yuanjingyu.sevice;

import com.yuanjingyu.dto.Page;
import com.yuanjingyu.entity.Book;

public interface BookService {

    /*添加图书*/
    void addBook(Book book);

    /*删除图书*/
    void deleteBook(Integer bookId);

    /*更新图书*/
    void updateBook(Book book);

    /*查询图书分页*/
    Page getBookPage(Integer pageNo,Integer pageSize);


}
