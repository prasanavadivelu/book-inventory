package com.book.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.entity.Book;
import com.book.repository.BookInventoryRepository;
@Service
public class BookInventoryServiceImpl implements BookInventoryService{

	@Autowired
	BookInventoryRepository repository;

	@Override
	public void insert(Book book) {
		repository.save(book);
	}

	@Override
	public Book getBookById(int bookId) {
		return repository.findById(bookId);
	}

	@Override
	public List<Book> getAllBooks() {
		return (List<Book>) repository.findAll();
	}

	@Override
	public void updateBook(Book book,int bookId) {
		Book getBook = repository.findById(bookId);
		getBook.setName(book.getName());
		getBook.setAuthor(book.getAuthor());
		repository.save(getBook);
	}

	@Override
	public void deleteBook(int bookId) {
		repository.deleteById(bookId);		
	}


}
