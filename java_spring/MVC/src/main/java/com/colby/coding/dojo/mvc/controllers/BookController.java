package com.colby.coding.dojo.mvc.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.colby.coding.dojo.mvc.models.Book;
import com.colby.coding.dojo.mvc.services.BookService;

@Controller
public class BookController {
	
	
	private final BookService bookService;
	
    public BookController(BookService bookService){
        this.bookService = bookService;
    }
	
    @GetMapping("/books/new")
    	public String bookForm(@ModelAttribute("book") Book book) {
    	return "BookForm.jsp";
    }
    @PostMapping("/api/books")
    public String create(@Valid @ModelAttribute("book") Book book, BindingResult result) {
        if (result.hasErrors()) {
            return "BookForm.jsp";
        } else {
            bookService.createBook(book);
            return "redirect:/books";
        }
    }
   
    @GetMapping("/books/{id}")
		public String showOneBook(@PathVariable("id") Long id, Model model) {
	        Book book = bookService.findBook(id);
	        model.addAttribute("book", book);
	        System.out.println(id);
	        return "ShowOne.jsp";	 
	    }
   
    @GetMapping("/books")
    public String showAllBooks(Model model) {
        List<Book> books = bookService.allBooks();
        model.addAttribute("books", books);
        return "ShowAll.jsp";  
    } 
     	
} 
