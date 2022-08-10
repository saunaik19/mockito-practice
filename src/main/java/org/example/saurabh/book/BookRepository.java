package org.example.saurabh.book;

import java.util.Collection;

public interface BookRepository {
    void saveBook(Book book);
    Collection<Book> findAll();
}
