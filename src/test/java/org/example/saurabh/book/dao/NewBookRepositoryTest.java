package org.example.saurabh.book.dao;

import org.example.saurabh.book.Book;
import org.example.saurabh.dummy.DummyBookRepository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class NewBookRepositoryTest implements DummyBookRepository {
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
