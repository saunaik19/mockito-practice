package org.example.saurabh.book.dummy;

import org.example.saurabh.book.Book;
import org.example.saurabh.book.BookRepository;
import org.example.saurabh.book.BookService;
import org.example.saurabh.book.dao.BookRepositoryTest;
import org.example.saurabh.book.dao.NewBookRepositoryTest;
import org.example.saurabh.dummy.EmailService;
import org.example.saurabh.dummy.DummyBookRepository;
import org.example.saurabh.dummy.NewBookService;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class NewBookServiceTest {
    @Test
    public void addBookTest(){
        //BookService bookService=new BookService();
        DummyBookRepository newBookRepository=new NewBookRepositoryTest();
        EmailService emailService=new DummyEmailService();
        NewBookService newBookService=new NewBookService(newBookRepository,emailService);

        newBookService.addBook(new Book("101","Java",200.0, LocalDate.now()));
        newBookService.addBook(new Book("102","Spring",60.0, LocalDate.now()));
        newBookService.addBook(new Book("103","Oracle",270.0, LocalDate.now()));
    }
    @Test
    public void findBookCountTest(){
        //BookService bookService=new BookService();
        DummyBookRepository bookRepository=new NewBookRepositoryTest();
        EmailService emailService=new DummyEmailService();
        NewBookService newBookService=new NewBookService(bookRepository,emailService);
       newBookService.findNoOfBooks();
    }
}
