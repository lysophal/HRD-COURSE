package com.kshrd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.kshrd.repositories.MyBatisBookRepository;

@SpringBootApplication
@MapperScan("com.kshrd.repositories")
public class Homework4Application implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(Homework4Application.class, args);
	}
	
	@Autowired
	MyBatisBookRepository myBatisBookRepository;
	
	@Override
	public void run(ApplicationArguments arg0) throws Exception {
		// TODO Auto-generated method stub
		
	}
}
