package com.kshrd.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kshrd.model.Book;
import com.kshrd.repositories.MyBatisBookRepository;
import com.kshrd.utility.Paging;
@Service
public class BookServiceImp implements BookService {
	@Autowired
	MyBatisBookRepository myBookRepository;
	@Override
	public List<Book> findAll() {
		
		return myBookRepository.findAll();
	}

	@Override
	public Book findById(int id) {
		
		return myBookRepository.findById(id);
	}

	@Override
	public boolean save(Book b) {
		return myBookRepository.save(b);
	}

	@Override
	public boolean remove(int id) {
		return myBookRepository.remove(id);
	}

	@Override
	public boolean update(Book b, int id) {
		return myBookRepository.update(b, id);
	}

	@Override
	public List<Book> searchBook(String keyword) {
		return myBookRepository.searchBook(keyword);
	}

	@Override
	public boolean savesaveBookPublisher(int bookId, int publisherid) {
		return myBookRepository.saveBookPublisher(bookId, publisherid);
	}

	@Override
	public boolean deleteBookPublisherByBookId(int BookId) {
		return myBookRepository.deleteBookPublisherByBookId(BookId);
	}

	@Override
	public List<Book> findAllByPagination(Paging page) {
		Integer bookCount=countBook();
		page.setTotalCount(bookCount);
		return myBookRepository.findAllByPagination(page);
	}

	@Override
	public int countBook() {
		return myBookRepository.countBook();
	}

}
