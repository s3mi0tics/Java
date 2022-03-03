package com.colby.bookclub.bookclub.services;

import java.util.List;
import java.util.Optional;

import com.colby.bookclub.bookclub.models.Book;
import com.colby.bookclub.bookclub.repositories.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;


    //___________Read All_______________
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    
    
    //__________Create__________________
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
    
    
    //__________Read One______________
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
    
    //___________Update One_______________
    public Book updateBook(Book b) {
        return bookRepository.save(b);
    }


    //__________Delete______________
    public void deleteBook(Long id) {
    	bookRepository.deleteById(id);
    }
}
