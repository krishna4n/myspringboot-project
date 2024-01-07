package com.example.myproject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.myproject.model.Book;

@Repository
public interface BookJpaRepository extends JpaRepository<Book,Integer>{

    @Query(value = "SELECT b FROM BOOK b WHERE b.bookName LIKE :bookName%",nativeQuery = true )
    List<Book> findByBookName(@Param("bookName") String bookName);

}
