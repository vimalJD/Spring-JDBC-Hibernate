package com.spring.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.model.Book;
public class App 
{
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		System.out.println("After application context ");
		Book book = (Book)applicationContext.getBean("book");
		
	
		System.out.println(book.getBookName());

	}
}
