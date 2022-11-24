package com.anna.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.anna.persistence.BookDao;
import com.anna.persistence.BookDaoImpl;
import com.anna.presentation.BookPresentationImpl;
import com.anna.service.BookServiceImpl;

@Configuration
@ComponentScan(basePackages = "com.anna")
public class BookConfig {
	
}
