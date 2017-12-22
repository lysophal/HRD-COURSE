package com.kshrd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kshrd.model.Publisher;
import com.kshrd.repositories.PublisherRepository;
@Service
public class PublisherServiceImp implements PublisherService {
	@Autowired
	public PublisherRepository publishRepository;
	
	@Override
	public List<Publisher> findAll() {
		
		return publishRepository.findAll();
	}

	@Override
	public List<Publisher> findPulisherByBookId(int id) {
	
		return publishRepository.findPulisherByBookId(id);
	}

}
