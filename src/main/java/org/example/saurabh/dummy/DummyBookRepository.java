package org.example.saurabh.dummy;

import org.example.saurabh.book.Book;

import java.util.Collection;

public interface DummyBookRepository {
    void saveBook(Book book);
    Collection<Book> findAll();
}
