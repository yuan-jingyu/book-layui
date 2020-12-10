package com.yuanjingyu.sevice.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yuanjingyu.dto.Page;
import com.yuanjingyu.entity.Book;
import com.yuanjingyu.mapper.BookMapper;
import com.yuanjingyu.sevice.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;

    @Override
    public void addBook(Book book) {
        bookMapper.addBook(book);
    }

    @Override
    public void deleteBook(Integer bookId) {
        bookMapper.deleteBook(bookId);
    }

    @Override
    public void updateBook(Book book) {
        bookMapper.updateBook(book);
    }

    @Override
    public Page getBookPage(Integer pageNo, Integer pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        List<Book> bookList = bookMapper.getBookList();
        Page page = new Page();
        PageInfo<Book> pageInfo = new PageInfo<>(bookList);
        page.setCount(pageInfo.getTotal());
        page.setObj(pageInfo.getList());
        return page;
    }
}
