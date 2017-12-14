package com.kshrd.repositories;
import java.util.List;
import com.kshrd.model.Book;

public interface BookRepository {
	public List<Book> findAll();
	public Book findById(int id);
	public boolean save(Book b);
	public boolean remove(int id);
	public boolean update(Book b,int id);
}
