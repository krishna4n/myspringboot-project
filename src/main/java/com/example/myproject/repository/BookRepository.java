package com.example.myproject.repository;

import java.util.ArrayList;

import com.example.myproject.model.Book;

public interface BookRepository {

    ArrayList<Book> getAllBooks();
    Book addBook(Book book);
    Book getBookById(int bookId);
    Book updateBook(Book book, int bookId);
    void deleteBook(int bookId);
}