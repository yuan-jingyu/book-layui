package com.yuanjingyu.entity;

/**
 * book实体类
 */
public class Book {

    private Integer bookId;     //书的id；
    private String bookName;    //书的名字；
    private String authorName;  //书的作者；
    private Double price;       //书的价格
    /*多对一*/
    private Integer categoryId; //分类id
    private Category category;  //书对应的分类；


    public Book() {
    }

    public Book(Integer bookId, String bookName, String authorName, Double price, Integer categoryId, Category category) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
        this.price = price;
        this.categoryId = categoryId;
        this.category = category;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", price=" + price +
                ", categoryId=" + categoryId +
                ", category=" + category +
                '}';
    }
}
