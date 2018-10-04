package com.book.SpringBoot_Hibernate_Mysql.service;

import java.util.List;

import com.book.SpringBoot_Hibernate_Mysql.model.Book;

public interface BookService
{
	/*//save the record
		void save(Book book);
		
		//Get a single record
		Book get(long id);
		
		//Get all the Records
		List<Book> list();

		//update the record
		void update(long id,Book book);
		
		//Delete a record
		void delete(long id);*/
	
	
	void save(Book book);
	Book get(int id);
	void delete(int id);
	List<Book> get();
}
