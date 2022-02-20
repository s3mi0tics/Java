package com.colby.coding.dojo.mvc.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.colby.coding.dojo.mvc.models.Book;
import com.colby.coding.dojo.mvc.models.repositories.BookRepository;

import java.util.List;

@Service
public class BookService {
	// adding the book repository as a dependency
	private final BookRepository bookRepository;

	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	// returns all the books
	public List<Book> allBooks() {
		return bookRepository.findAll();
	}

	// creates a book
	public Book createBook(Book b) {
		return bookRepository.save(b);
	}

	// retrieves a book
	public Book findBook(Long id) {
		Optional<Book> optionalBook = bookRepository.findById(id);
		if (optionalBook.isPresent()) {
			return optionalBook.get();
		} else {
			return null;
		}
	}

	// updates a book
	public Book updateBook(Long id, String title, String des, String lang, Integer pages) {
		Optional<Book> optionalBook = bookRepository.findById(id);
		if (optionalBook.isPresent()) {
			Book book = optionalBook.get();
			book.setTitle(title);
			book.setDescription(des);
			book.setLanguage(lang);
			book.setNumberOfPages(pages);
			String updatedBook = book.getTitle();
			System.out.println(updatedBook + "was updated");
			return bookRepository.save(book);
		} else {
			System.out.println("this book is unavailable for update");
			return null;
		}

	}

	// deletes a book
	public Book deleteBook(Long id) {
		Optional<Book> optionalBook = bookRepository.findById(id);
		if (optionalBook.isPresent()) {
			bookRepository.deleteById(id);
			System.out.println("book deleted");
			return null;
		} else {
			System.out.println("no book to delete");
			return null;
		}

	}
}
