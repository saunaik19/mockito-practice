package org.example.saurabh.service.dao;

import org.example.saurabh.dao.BookRepository;
import org.example.saurabh.dto.Book;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class BookRepositoryTest implements BookRepository {
    Map<String,Book> bookStore=new HashMap<>();

    @Override
    public void saveBook(Book book) {
        bookStore.put(book.getBookId(),book);
    }

    @Override
    public Collection<Book> findAll() {
        return bookStore.values();
    }
}
