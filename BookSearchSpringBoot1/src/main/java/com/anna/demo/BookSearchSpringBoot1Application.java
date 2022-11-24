package com.anna.demo;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.anna.presentation.BookPresentation;

@SpringBootApplication(scanBasePackages = "com.anna")
public class BookSearchSpringBoot1Application {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		ApplicationContext springContainer=SpringApplication.run(BookSearchSpringBoot1Application.class, args);
		
		BookPresentation bookPresentation = (BookPresentation)springContainer.getBean("bookPresentation");
		while(true) {
			bookPresentation.showMenu();
			System.out.println("Enter choice: ");
			int choice = scn.nextInt();
			bookPresentation.performMenu(choice);
			
		}
	}

}
