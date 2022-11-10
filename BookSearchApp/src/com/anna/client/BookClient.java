package com.anna.client;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.anna.presentation.BookPresentation;
import com.anna.presentation.BookPresentationImpl;

public interface BookClient {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		AnnotationConfigApplicationContext springContainer=new AnnotationConfigApplicationContext(BookConfig.class);
		
		BookPresentation bookPresentation = (BookPresentation)springContainer.getBean("bookPresentation");
		while(true) {
			bookPresentation.showMenu();
			System.out.println("Enter choice: ");
			int choice = scn.nextInt();
			bookPresentation.performMenu(choice);
			
		}
		
	}
}
