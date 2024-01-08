package com.example.myproject.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.example.myproject.model.Publisher;
import com.example.myproject.repository.PublisherJpaRepository;
import com.example.myproject.repository.PublisherRepository;

@Service
public class PublisherService implements PublisherRepository{

    @Autowired
    private PublisherJpaRepository publisherJpaRepository;


    @Override
    public ArrayList<Publisher> getAllPublishers() {
       try{
        List<Publisher> publishers = publisherJpaRepository.findAll();
        return (ArrayList<Publisher>) publishers;
       }
       catch(Exception e){
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
       }
    }

    @Override
    public Publisher addPublisher(Publisher publisher) {
        try{
            publisherJpaRepository.save(publisher);
            return publisher;
        }
        catch(Exception e){
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public Publisher getPublisherById(int publisherId) {
        try{
            Publisher publisher = publisherJpaRepository.findById(publisherId).get();
            return publisher;
        }
        catch(Exception e){
throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        
    }

    @Override
    public Publisher updatePublisherId(Publisher publisher, int publisherId) {
        try{
            Publisher p = publisherJpaRepository.findById(publisherId).get();
            if(publisher.getPublisherName() != null){
                p.setPublisherName(publisher.getPublisherName());
            }

            publisherJpaRepository.save(p);
            return p;
        }
        catch(Exception e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public void deletePublisher(int publisherId) {
        try{
            publisherJpaRepository.deleteById(publisherId);
        }
        catch(Exception e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }

        throw new ResponseStatusException(HttpStatus.NO_CONTENT);
    }

    
}
