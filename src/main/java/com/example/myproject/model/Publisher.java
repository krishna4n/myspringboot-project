package com.example.myproject.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name ="publisher")
public class Publisher {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="publisherid")
    private int publisherId;
    
    @Column(name = "publishername")
    private String publisherName;
    
    @ManyToOne
    @JoinColumn(name = "bookid")
    private Book book;
       
    
    public Publisher(int publisherId, String publisherName, Book book) {
        this.publisherId = publisherId;
        this.publisherName = publisherName;
        this.book = book;
    }

    public Publisher() {
    }
    public int getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(int publisherId) {
        this.publisherId = publisherId;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

}
