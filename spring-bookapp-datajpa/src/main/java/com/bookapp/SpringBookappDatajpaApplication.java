package com.bookapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bookapp.model.Book;
import com.bookapp.service.IBookService;

@SpringBootApplication
public class SpringBookappDatajpaApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBookappDatajpaApplication.class, args);
	}

	@Autowired
	IBookService bookService;
	@Override
	public void run(String... args) throws Exception {

//		Book book=new Book("Head first Java", 1, "Kathy", "Tech", 900);
		Book book1=new Book("Learn English", 2, "Pramod", "Communication", 500);
		Book book2=new Book("Cooking", 3, "Ram", "Testy", 1000);
		Book book3=new Book("Ramayana", 4, "Guru", "Drama", 800);
		bookService.addBook(book1);
		bookService.addBook(book2);
		bookService.addBook(book3);
		bookService.updateBook(book1);
		bookService.updateBook(book2);
		bookService.updateBook(book3);
//		System.out.println("Get All");
//		bookService.getAll();
	}

}
