package com.example.bookstore_app;

import java.util.ArrayList;
import java.util.List;

public class model_V {

    public int status;
    public String message;
    public Book book;

    public List<Book> books;

    public model_V(int status, String message, List<Book> books) {
        this.status = status;
        this.message = message;
        this.books = books;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}



