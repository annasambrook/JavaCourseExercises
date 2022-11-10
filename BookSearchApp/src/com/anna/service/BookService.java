package com.anna.service;

import java.util.Collection;
import java.util.List;

import com.anna.entity.Book;

public interface BookService {
	
	Collection<Book> listAllBooks();
	
	Book searchBookId(int id);
	
	boolean addBook(Book book);
}
