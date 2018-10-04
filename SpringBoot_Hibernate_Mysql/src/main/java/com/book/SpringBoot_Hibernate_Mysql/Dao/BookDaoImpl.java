package com.book.SpringBoot_Hibernate_Mysql.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.book.SpringBoot_Hibernate_Mysql.model.Book;
/*@Repository: This is the Persistence layer(Data Access Layer) of application which used to get data from the database. 
i.e. all the Database related operations are done by the repository.*/
@Repository
public class BookDaoImpl implements  BookDao
{
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void save(Book book) {
		sessionFactory.getCurrentSession().saveOrUpdate(book);
	}

	@Override
	public Book get(long id) {
		return sessionFactory.getCurrentSession().get(Book.class, id);
	}

	

	@Override
	public void delete(long id) {
		Session session =  sessionFactory.getCurrentSession();
		Book book = session.get(Book.class, id);
		session.delete(book);
	}

	@Override
	public List<Book> get() {
		System.out.println("BookDaoImpl");
		return sessionFactory.getCurrentSession().createQuery("from Book").list();
		
	}

	

}
