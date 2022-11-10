package com.anna.client;

import org.springframework.context.annotation.Bean;

import com.anna.persistence.BookDao;
import com.anna.persistence.BookDaoImpl;
import com.anna.presentation.BookPresentationImpl;
import com.anna.service.BookServiceImpl;

public class BookConfig {
	
	@Bean(name="dao")
	public BookDaoImpl getPersistence() {
		return new BookDaoImpl();
	}
	
	@Bean(name="service")
	public BookServiceImpl getBookService() {
		return new BookServiceImpl(getPersistence());
	}
	
	@Bean(name="bookPresentation")
	public BookPresentationImpl getBookPresentation() {
		BookPresentationImpl presentation=new BookPresentationImpl();
		presentation.setBookService(getBookService());
		return presentation;
	}

}
