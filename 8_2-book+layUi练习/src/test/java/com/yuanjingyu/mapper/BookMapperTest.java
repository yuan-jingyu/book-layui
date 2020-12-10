package com.yuanjingyu.mapper;

import com.yuanjingyu.base.BaseTest;
import com.yuanjingyu.entity.Book;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BookMapperTest extends BaseTest {

    @Autowired
    private BookMapper bookMapper;

    @Test
    public void addBook() {
        Book book = new Book();
        book.setBookName("我是好人");
        book.setAuthorName("哈哈哈");
        book.setPrice(123.11);
        book.setCategoryId(1002);

        bookMapper.addBook(book);
        System.out.println(book);
    }

    @Test
    public void deleteBook() {
        bookMapper.deleteBook(1005);
    }

    @Test
    public void updateBook() {
        Book book = new Book();
        book.setBookId(1005);
        book.setBookName("西游记");
        book.setPrice(100.99);
        book.setCategoryId(1002);

        bookMapper.updateBook(book);
        System.out.println(book);
    }

    @Test
    public void getBookList() {
        List<Book> bookList = bookMapper.getBookList();
        System.out.println(bookList);
    }
}