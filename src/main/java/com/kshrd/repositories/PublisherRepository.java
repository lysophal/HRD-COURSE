package com.kshrd.repositories;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.kshrd.model.Publisher;
@Repository
public interface PublisherRepository {
	@Select("select  p.id,p.name from publisher p inner join book_publisher bp on p.id=bp.publisher_id where bp.book_id=#{id} ")
	public List<Publisher> findPulisherByBookId(int id);
	
	@Select("select * from publisher")
	public List<Publisher> findAll();
}
