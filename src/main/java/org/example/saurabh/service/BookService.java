package org.example.saurabh.service;

import org.example.saurabh.dao.BookRepository;
import org.example.saurabh.dto.Book;

public class BookService {
    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    public void addBook(Book book){
        bookRepository.saveBook(book);
    }
    public Integer findNoOfBooks(){
        return bookRepository.findAll().size();
    }
}
