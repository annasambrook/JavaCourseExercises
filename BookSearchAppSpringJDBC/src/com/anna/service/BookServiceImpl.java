package com.anna.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.anna.entity.Book;
import com.anna.persistence.BookDao;
import com.anna.persistence.BookDaoImpl;

@Service("service")
public class BookServiceImpl implements BookService {
	
	private BookDao bookDao;
	
	public BookServiceImpl(@Autowired BookDao bookDao) {
		super();
		this.bookDao = bookDao;
	}

	@Override
	public Collection<Book> listAllBooks() {
		return bookDao.listAllBooks();
	}

	@Override
	public Book searchBookId(int id) {
		return bookDao.searchBookId(id);
	}

	@Override
	public boolean addBook(Book book) {
		Book newBook = bookDao.searchBookId(book.getBookId());
		if (newBook!=null) {
			return false;
		}
		
		bookDao.addBook(book);
		return true;
	}

	@Override
	public boolean deleteBook(int id) {
		if(bookDao.deleteBook(id)>0) {
			return true;
		}
		else
			return false;
	}

	@Override
	public boolean updateCopies(int id, int copies) {
		if(bookDao.updateCopies(id, copies)>0)
			return true;
		return false;
	}

}
