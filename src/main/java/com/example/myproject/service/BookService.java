package com.example.myproject.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.example.myproject.model.Book;
import com.example.myproject.repository.BookJpaRepository;
import com.example.myproject.repository.BookRepository;

@Service
public class BookService implements BookRepository{

    @Autowired
    private BookJpaRepository bookJpaRepository;

    @Override
    public ArrayList<Book> getAllBooks() {
        try{
        List<Book> books = bookJpaRepository.findAll();
        return (ArrayList<Book>) books;
        }
        catch(Exception e){
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }

    }

    @Override
    public Book addBook(Book book) {
        try{
            bookJpaRepository.save(book);
            return book;
        }
        catch(Exception e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        
    }

    @Override
    public Book getBookById(int bookId) {
        try{
            Book book = bookJpaRepository.findById(bookId).get();
            return book;
        }
        catch(Exception e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        
    }

    @Override
    public Book updateBook(Book book, int bookId) {
        try{
            Book b = bookJpaRepository.findById(bookId).get();
            if(book.getBookName() != null){
                b.setBookName(book.getBookName());
            }
            if(book.getImageUrl() != null){
                b.setImageUrl(book.getImageUrl());
            }
            bookJpaRepository.save(b);
            return b;

        }
        catch(Exception e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        
    }

    @Override
    public void deleteBook(int bookId) {
        try{
            bookJpaRepository.deleteById(bookId);
        }
        catch(Exception e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }

        throw new ResponseStatusException(HttpStatus.NO_CONTENT);
        
    }

    
    public List<Book> findByBookName(String bookName){
        try{
        return bookJpaRepository.findByBookName(bookName);
        }
        catch(Exception e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }
    
}
