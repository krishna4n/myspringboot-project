package com.example.myproject.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.myproject.model.Book;
import com.example.myproject.model.Publisher;
import com.example.myproject.repository.BookJpaRepository;
import com.example.myproject.repository.PublisherJpaRepository;
import com.example.myproject.repository.PublisherRepository;

@Service
public class PublisherService implements PublisherRepository{

    @Autowired
    private PublisherJpaRepository publisherJpaRepository;

    @Autowired
    private BookJpaRepository bookJpaRepository;

    @Override
    public ArrayList<Publisher> getAllPublishers() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllPublishers'");
    }

    @Override
    public Publisher addPublisher(Publisher publisher) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addPublisher'");
    }

    @Override
    public Publisher getPublisherById(int publisherId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPublisherById'");
    }

    @Override
    public Publisher updatePublisherId(Publisher publisher, int publisherId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updatePublisherId'");
    }

    @Override
    public void deletePublisher(int publisherId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deletePublisher'");
    }

    
}
