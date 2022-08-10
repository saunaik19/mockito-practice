package org.example.saurabh.book;

import org.example.saurabh.book.dao.BookRepositoryTest;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class BookServiceTest {
    @Test
    public void addBookTest(){
        //BookService bookService=new BookService();
        BookRepository bookRepository=new BookRepositoryTest();
        BookService bookService=new BookService(bookRepository);
        bookService.addBook(new Book("101","Java",200.0, LocalDate.now()));
    }
    @Test
    public void findBookCountTest(){
        //BookService bookService=new BookService();
        BookRepository bookRepository=new BookRepositoryTest();
        BookService bookService=new BookService(bookRepository);
        bookService.findNoOfBooks();
    }
}
