package com.jalo.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jalo.book.model.BookModel;

@Repository
public interface BookRepository extends JpaRepository<BookModel, String> {

}
