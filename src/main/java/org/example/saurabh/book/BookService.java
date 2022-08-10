package org.example.saurabh.book;

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
