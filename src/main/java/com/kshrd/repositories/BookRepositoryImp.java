package com.kshrd.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.github.javafaker.Faker;
import com.kshrd.model.Book;
@Repository
public class BookRepositoryImp implements BookRepository{
	
	private List<Book> books=new ArrayList<Book>();
	Faker fk = new Faker();
	private String title;
	private String publishDate;
	private String author;
	private String page;
	private String coverImage;
	static int i;
	public BookRepositoryImp() {
		for(i=1;i<=7;i++){
			title=fk.book().title();
			publishDate=fk.date().birthday().toString();
			author=fk.book().author();
			page=fk.number().digits(3);
			coverImage=fk.internet().image(50, 50, false, null);
			books.add(new Book(i,title,publishDate,author,Integer.parseInt(page),coverImage));
		}
		
	}

	@Override
	public List<Book> findAll() {
		
		return books;
	}

	@Override
	public Book findById(int id) {
		for(Book b:books){
			if(b.getId()==id){
				return b;
			}
		}
		return null;
	}

	@Override
	public boolean save(Book b) {
		books.add(b);
		return true;
	}

	@Override
	public boolean remove(int id) {
		for(int i=0;i<books.size();i++){
			if(books.get(i).getId()==id){
				books.remove(i);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean update(Book b, int id) {
		for(int i=0;i<books.size();i++){
			if(books.get(i).getId()==id){
				books.set(i, b);
				return true;
			}
		}
		return false;
	}
	
	public int autoNumber(){
		return i+1;
	}
	
}
