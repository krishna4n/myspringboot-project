package com.example.myproject.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name="book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "bookid")
    private int bookId;

    @Column(name="bookname")
    private String bookName;

    @Column(name = "imageurl")
    private String imageUrl;

    @ManyToMany
    @JoinTable(name = "book_author",
    joinColumns = @JoinColumn(name = "bookid"),
    inverseJoinColumns = @JoinColumn(name = "authorid"))    
    private List<Author> authors = new ArrayList<>();

    public Book() {
    }

    public Book(int bookId, String bookName, String imageUrl) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.imageUrl = imageUrl;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }


    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }



}
