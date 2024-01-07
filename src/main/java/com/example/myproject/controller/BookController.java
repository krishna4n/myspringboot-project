package com.example.myproject.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.myproject.model.Book;
import com.example.myproject.service.BookService;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public ArrayList<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

    @GetMapping("/books/bookname/{bookName}")
    public List<Book> findByBookName(@PathVariable("bookName") String bookName){
        return bookService.findByBookName(bookName);
    }

    @PostMapping("/books")
    public Book addBook(@RequestBody Book book){
        return bookService.addBook(book);
    }

    @GetMapping("/books/{bookId}")
    public Book getBookById(@PathVariable("bookId") int bookId ){
        return bookService.getBookById(bookId);
    }

    @PutMapping("/books/{bookId}")
    public Book updaBook(@RequestBody Book book, @PathVariable("bookId") int bookId){
        return bookService.updateBook(book, bookId);
    }

    @DeleteMapping("/books/{bookId}")
    public void deleteBook(@PathVariable("bookId") int bookId){
        bookService.deleteBook(bookId);
    }


    
}
