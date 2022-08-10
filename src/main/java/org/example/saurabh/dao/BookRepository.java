package org.example.saurabh.dao;

import org.example.saurabh.dto.Book;

import java.util.Collection;

public interface BookRepository {
    void saveBook(Book book);
    Collection<Book> findAll();
}
