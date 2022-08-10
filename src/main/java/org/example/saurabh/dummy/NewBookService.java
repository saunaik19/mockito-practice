package org.example.saurabh.dummy;

import org.example.saurabh.book.Book;

public class NewBookService {
    private DummyBookRepository bookRepository;
    private EmailService emailService;

    public NewBookService(DummyBookRepository bookRepository, EmailService emailService) {
        this.bookRepository = bookRepository;
        this.emailService = emailService;
    }

    public void addBook(Book book){
        bookRepository.saveBook(book);
    }
    public Integer findNoOfBooks(){
        return bookRepository.findAll().size();
    }

    //methods which use email
    public void sendEmail(String message){
        emailService.sendEmail(message);
    }
}
