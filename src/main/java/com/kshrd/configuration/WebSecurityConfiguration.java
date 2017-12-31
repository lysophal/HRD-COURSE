package com.kshrd.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {
	
	@Autowired
	AuthenticationSuccessHandler successHandler;
	
	@Autowired
	UserDetailsService userDetailsService;
	
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth)throws Exception{
//		auth.inMemoryAuthentication()
//			.withUser("admin").password("123").roles("ADMIN").and()
//			.withUser("dba").password("123").roles("DBA").and()
//			.withUser("user").password("123").roles("USER");
//	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth)throws Exception{
		auth.userDetailsService(userDetailsService);
	}
	
	@Override
	protected void configure(HttpSecurity http)throws Exception{
		http.csrf().disable();
		
		http.formLogin()
			.loginPage("/login")
			.successHandler(successHandler);
		
		http.authorizeRequests()
			.antMatchers("/main/index").hasAnyRole("ADMIN","DBA")
			.antMatchers("/Home").hasAnyRole("USER");
		
		http.logout()
			.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
			.logoutSuccessUrl("/login");
	}
}
