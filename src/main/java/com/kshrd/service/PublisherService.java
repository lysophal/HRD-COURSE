package com.kshrd.service;
import java.util.List;

import com.kshrd.model.Publisher;
public interface PublisherService {
	public List<Publisher> findAll();
	public List<Publisher> findPulisherByBookId(int id);
}
