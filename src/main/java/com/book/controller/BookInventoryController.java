package com.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.book.entity.Book;
import com.book.service.BookInventoryService;

@RestController
public class BookInventoryController {
	
	@Autowired
	BookInventoryService service;

    @RequestMapping(method = RequestMethod.POST, value = "/addBook",   produces = MediaType.APPLICATION_JSON_VALUE)
    public void addBook(@RequestBody Book book) {
    	service.insert(book);
    }
    @RequestMapping(method = RequestMethod.GET, value = "/getBook/{bookId}")
    public Book getBook(@PathVariable int bookId) {
    	return service.getBookById(bookId);
    }
    @RequestMapping(method = RequestMethod.GET, value = "/getBooks")
    public List<Book> getAllBooks() {
    	return service.getAllBooks();
    }
    @RequestMapping(value = "/updateBook/{bookId}",
            method = RequestMethod.PUT,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public void updateBook(@RequestBody Book book,@PathVariable int bookId) {
        service.updateBook(book,bookId);
    }
    @RequestMapping(method = RequestMethod.DELETE, value = "/deleteBook/{bookId}")
    public void deleteBook(@PathVariable int bookId) {
    	 service.deleteBook(bookId);
    }
}
