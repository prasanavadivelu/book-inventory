package com.book.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import com.book.entity.Book;

@Repository
public interface BookInventoryRepository extends CrudRepository<Book,Integer>{

	Book findById(int bookId);
    


}
