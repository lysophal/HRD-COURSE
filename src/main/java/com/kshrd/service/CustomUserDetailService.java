package com.kshrd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.kshrd.model.User;
import com.kshrd.repositories.UserRepository;

@Service
public class CustomUserDetailService implements UserDetailsService {
	@Autowired
	UserRepository repo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user = repo.findUserByName(username);
		
		if(user==null){
			throw new UsernameNotFoundException("User not found");
		}
		System.out.println(user.toString());
		return new CustomUserDetail(user);
	}

}
