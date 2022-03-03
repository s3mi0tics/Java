package com.colby.bookclub.bookclub.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import com.colby.bookclub.bookclub.models.Book;
import com.colby.bookclub.bookclub.models.User;
import com.colby.bookclub.bookclub.services.BookService;
import com.colby.bookclub.bookclub.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@Controller
public class BookController {

    @Autowired
    private UserService userService;

    @Autowired
    private BookService bookService;

    // ______________Read one User and Read all Books___________________
    @GetMapping("/books")
    public String home(HttpSession session, Model model) {
        // Retrieve the user from database using session id
        Long userId = (Long) session.getAttribute("user_id");
        // Route gard check if userID is null
        if (userId == null) {
            return "redirect:/";
        }
            // Retrieve a list of all books add to model
            List<Book> books = bookService.allBooks();
            model.addAttribute("books", books);
            // retrieve the user using the Id and add it to the model
            User thisUser = userService.findOne(userId);
            model.addAttribute("thisUser", thisUser);
        return "home.jsp";
    }

    // ____________________Create book__________________________//

    // Form:
    @GetMapping("/books/new")
    public String bookForm(@ModelAttribute("book") Book book, HttpSession session, Model model) {
        // Retrieve the user from database using session id
        Long userId = (Long) session.getAttribute("user_id");
        // Route gard check if userID is null
        if (userId == null) {
            return "redirect:/";
        } else {
            // retrieve the user using the Id and add it to the model
            User thisUser = userService.findOne(userId);
            model.addAttribute("thisUser", thisUser);

            return "createBook.jsp";
        }
    }

    // Submit new book:
    @PostMapping("/books/new")
    public String createBook(@Valid @ModelAttribute("book") Book book, BindingResult result, HttpSession session,
            Model model) {
        Long userId = (Long) session.getAttribute("user_id");
        if (result.hasErrors()) {
            // retrieve the User and add to model before rerendering the form
            User thisUser = userService.findOne(userId);
            model.addAttribute("thisUser", thisUser);
            return "createBook.jsp";
        } else {
            User thisUser = userService.findOne(userId);
            model.addAttribute("thisUser", thisUser);
            book.setUser(thisUser);
            bookService.createBook(book);
            return "redirect:/books";
        }
    }

    // ________________Show one book____________________________//
    @GetMapping("/books/{id}")
    public String showBook(@PathVariable("id") Long id, HttpSession session, Model model) {
        // Retrieve the user from database using session id
        Long userId = (Long) session.getAttribute("user_id");
        // Route gard check if userID is null
        if (userId == null) {
            return "redirect:/";
        } else {
            User thisUser = userService.findOne(userId);
            model.addAttribute("thisUser", thisUser);
            Book book = bookService.findBook(id);
            model.addAttribute("book", book);
            return "bookDetails.jsp";
        }
    }

//______________________Edit Book________________________________//
    
//  Form:
    @GetMapping("/books/edit/{id}")
    public String editForm(@PathVariable("id") Long id, HttpSession session, Model model){
//      Retrieve the user from database using session id
        Long userId = (Long) session.getAttribute("user_id");
//      Route gard check if userID is null
        if(userId== null){
            return "redirect:/";
        }else{
            Book book = bookService.findBook(id);
            model.addAttribute("book", book);
            return "bookEdit.jsp";
        }
    }

//  Submit update:
    @PutMapping("/books/edit/{id}")
    public String updateBook(@Valid @ModelAttribute("book") Book book, BindingResult result, Model model, HttpSession session, @PathVariable("id") Long id){
        Long userId = (Long) session.getAttribute("user_id");
//      Protect so that a user can only edit books that it created
        // if(userId != book.getUser().getId()){
        //     return "redirect:/books";
        // }
        if (result.hasErrors()) {
            // // keeps title from disappearing when you rerender the form
            // Book book1 = bookService.findBook(book.getId());
            // book.setTitle(book1.getTitle());
            // List<User> users = userService.allUsers();
            // model.addAttribute("users", users);
            return "bookEdit.jsp";
        }else {
            // User thisUser = userService.findOne(userId);
            // model.addAttribute(thisUser);
            // Book thisBook = bookService.findBook(id);
            // model.addAttribute(thisBook);
            // book.setUser(thisBook.getUser());
            System.out.println(book.getUser());
            bookService.updateBook(book);
            return "redirect:/books/";
        }
    }

//_________________________Delete Book________________________________
    @DeleteMapping("/books/delete/{id}")
    public String deleteBook(@PathVariable("id")Long id){
        bookService.deleteBook(id);
        return "redirect:/books";
    }

//_________________________Borrow a Book_____________________________
    @PutMapping("/books/borrow/{id}")
    public String borrowBook(@PathVariable("id") Long id, HttpSession session){
        Long userId = (Long) session.getAttribute("user_id");
        User borrower = userService.findOne(userId);
        Book book = bookService.findBook(id);
        book.setBorrower(borrower);
        bookService.updateBook(book);
        return "redirect:/books";
    }

//_________________________Return a Book_____________________________
    @PutMapping("/books/return/{id}")
    public String returnBook(@PathVariable("id") Long id){
        Book book = bookService.findBook(id);
        book.setBorrower(null);
        bookService.updateBook(book);
        return "redirect:/books";
    }
//__________________________Finish_______________________________________
}
