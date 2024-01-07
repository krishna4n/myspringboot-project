package com.example.myproject.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.myproject.model.Book;
import com.example.myproject.model.Publisher;
import com.example.myproject.service.BookService;
import com.example.myproject.service.PublisherService;

@RestController
public class PublisherController {

    @Autowired
    private PublisherService publisherService;

    @Autowired
    private BookService bookService;

    @GetMapping("/books/publishers")
    public ArrayList<Publisher> getAllPublishers(){
        return publisherService.getAllPublishers();
    }

    @PostMapping("/books/publishers")
    public Publisher addPublisher(Publisher publisher){
        return publisherService.addPublisher(publisher);
    }

    @GetMapping("/books/publishers/{publisherId}")
    public Publisher getPublisherId(@PathVariable("publisherId") int publisherId){
        return publisherService.getPublisherById(publisherId);
    }

    @PutMapping("/books/publishers/{publisherId}")
    public Publisher updatePublisher(@RequestBody Publisher publisher,@PathVariable("publisherId") int publisherId)
    {
        return publisherService.updatePublisherId(publisher, publisherId);
    }

    @DeleteMapping("/books/publishers/{publisherId}")
    public void deletePublisher(@PathVariable("publisherId") int publisherId)
    {
        publisherService.deletePublisher(publisherId);
    }

    @GetMapping("/publishers/{publisherId}/book")
    public Book getPublisherBook(@PathVariable("publisherId") int publisherId){
        return publisherService.getPublisherBook(publisherId);
    }

}
