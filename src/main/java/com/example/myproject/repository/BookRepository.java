package com.example.myproject.repository;

import java.util.ArrayList;

import com.example.myproject.model.Book;
import com.example.myproject.model.Publisher;

public interface BookRepository {

    ArrayList<Book> getAllBooks();
    Book addBook(Book book);
    Book getBookById(int bookId);
    Book updateBook(Book book, int bookId);
    void deleteBook(int bookId);
    Publisher getBookPublisher(int bookId);
}