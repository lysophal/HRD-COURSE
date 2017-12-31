package com.kshrd.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.kshrd.model.Role;
import com.kshrd.model.User;

public class CustomUserDetail implements UserDetails {

	private static final long serialVersionUID = 1L;
	
	private String username;
	private String password;
	private List<Role> roles;

	public CustomUserDetail(User user) {
		this.username=user.getUsername();
		this.password=user.getPassword();
		this.roles=user.getRoles();
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		List<GrantedAuthority> authority = new ArrayList<>();
		for(Role role: roles){
			authority.add(new SimpleGrantedAuthority("ROLE_"+role.getRole()));
		}
		return authority;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return username;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
