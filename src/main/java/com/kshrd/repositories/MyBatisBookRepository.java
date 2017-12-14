package com.kshrd.repositories;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.kshrd.model.Book;

@Repository
public interface MyBatisBookRepository {
	
	String selectSQL="select id,title,publishDate,author,page,coverImage from books order by id asc";
	@Select(selectSQL)
	public List<Book> findAll();
	
	@Select("select * from books where id=#{id}")
	public Book findById(int id);
	
	String insertSQL="insert into books(id,title,publishDate,author,page,coverImage) values(#{id},#{title},#{publishDate},#{author},#{page},#{coverImage})";
	@Insert(insertSQL)
	public boolean save(Book b);
	
	@Delete("Delete from books where id=#{id}")
	public boolean remove(int id);
	
	String updateSQL="update books set title=#{book.title},publishDate=#{book.publishDate},author=#{book.author},page=#{book.page},coverImage=#{book.coverImage} where id=#{id}";
	@Update(updateSQL)
	public boolean update(@Param("book")Book b,@Param("id")int id);
	
	String searchSQL="select * from books where title||author like '%'||#{keyword}||'%'";
	@Select(searchSQL)
	public List<Book> searchBook(String keyword);
}
