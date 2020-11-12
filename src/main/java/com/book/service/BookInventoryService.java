package com.book.service;

import java.util.List;
import java.util.Optional;

import com.book.entity.Book;

public interface BookInventoryService {

	public void insert(Book book) ;

	public Book getBookById(int bookId);

	public List<Book> getAllBooks();

	public void updateBook(Book book, int bookId);

	public void deleteBook(int bookId);


}
