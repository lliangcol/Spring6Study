package com.liuliang.spring6.iocxml.di;

public class Book {
    private String isbn;
    private String name;
    private String author;
    private String remark;

    public Book() {
        System.out.println("Book constructor...");
    }

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
        System.out.println("Book parameter constructor...");
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
