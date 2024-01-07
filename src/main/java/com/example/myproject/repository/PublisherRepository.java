package com.example.myproject.repository;

import java.util.ArrayList;

import com.example.myproject.model.Publisher;

public interface PublisherRepository {

    ArrayList<Publisher> getAllPublishers();
    Publisher addPublisher(Publisher publisher);
    Publisher getPublisherById(int publisherId);
    Publisher updatePublisherId(Publisher publisher,int publisherId);
    void deletePublisher(int publisherId);
}