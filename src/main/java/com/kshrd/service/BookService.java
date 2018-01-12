package com.kshrd.service;
import java.util.List;
import com.kshrd.model.Book;
import com.kshrd.utility.Paging;

public interface BookService {
	public List<Book> findAll();
	public Book findById(int id);
	public boolean save(Book b);
	public boolean remove(int id);
	public boolean update(Book b,int id);
	public List<Book> searchBook(String keyword);
	public boolean savesaveBookPublisher(int bookId,int publisherid);
	public boolean deleteBookPublisherByBookId(int BookId);
	public List<Book> findAllByPagination(Paging page);
	public int countBook();
}
