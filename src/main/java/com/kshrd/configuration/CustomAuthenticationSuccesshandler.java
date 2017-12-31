package com.kshrd.configuration;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

@Component
public class CustomAuthenticationSuccesshandler implements AuthenticationSuccessHandler {

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {
		
		System.out.println("-> login success!");
		
		System.out.println(authentication.getName());
		System.out.println(authentication.getPrincipal());
		System.out.println(authentication.getAuthorities());
		
		String redirectUrl=(String) request.getSession().getAttribute("REQUEST_URL");
		if(redirectUrl==null){
			for(GrantedAuthority authority:authentication.getAuthorities()){
				if(authority.getAuthority().contains("USER")){
					redirectUrl="/Home";
				}else if(authority.getAuthority().contains("ADMIN")){
					redirectUrl="/main/index";
				}else if(authority.getAuthority().contains("DBA")){
					redirectUrl="/main/index";
				}
			}
		}
		response.sendRedirect(redirectUrl);
	}

}
