package com.example.bookstore_app;

public class Book {

     public int id;
     public String book_name;
    public String book_image;
    public String subtitle;
    public String full_book_image;

    public Book(int id, String book_name, String book_image, String subtitle, String full_book_image) {
        this.id = id;
        this.book_name = book_name;
        this.book_image = book_image;
        this.subtitle = subtitle;
        this.full_book_image = full_book_image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getBook_image() {
        return book_image;
    }

    public void setBook_image(String book_image) {
        this.book_image = book_image;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getFull_book_image() {
        return full_book_image;
    }

    public void setFull_book_image(String full_book_image) {
        this.full_book_image = full_book_image;
    }
}