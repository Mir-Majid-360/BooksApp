package com.example.booksapp;

public class Book {

    private String bookName;
    private String bookAuthor;
    private String booksBIN;
    private String bookCourse;

    public Book() {

    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBooksBIN() {
        return booksBIN;
    }

    public void setBooksBIN(String booksBIN) {
        this.booksBIN = booksBIN;
    }

    public String getBookCourse() {
        return bookCourse;
    }

    public void setBookCourse(String bookCourse) {
        this.bookCourse = bookCourse;
    }

    public Book(String bookName, String bookAuthor, String booksBIN, String bookCourse) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.booksBIN = booksBIN;
        this.bookCourse = bookCourse;
    }

    public Book(String bookName, String bookAuthor) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
    }
}
