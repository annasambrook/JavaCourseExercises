package com.anna.persistence;

import java.util.Collection;

import com.anna.entity.Book;

public interface BookDao {
	Collection<Book> listAllBooks();
	
	Book searchBookId(int id);
	Book addBook(Book book);
}
