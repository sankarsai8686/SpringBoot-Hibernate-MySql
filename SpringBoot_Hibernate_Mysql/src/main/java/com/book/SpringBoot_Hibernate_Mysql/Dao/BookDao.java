package com.book.SpringBoot_Hibernate_Mysql.Dao;

import java.util.List;

import com.book.SpringBoot_Hibernate_Mysql.model.Book;

public interface BookDao 
{
	//save the record
	/*long save(Book book);*/
	void save(Book book);
	
	//Get a single record
	Book get(long id);
	
	//Get all the Records
	/*List<Book> list();*/
	List<Book> get();

	/*//update the record
	void update(long id,Book book);*/
	
	//Delete a record
	void delete(long id);
}
