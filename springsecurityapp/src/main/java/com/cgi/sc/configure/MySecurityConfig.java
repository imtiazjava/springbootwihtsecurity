package com.cgi.sc.configure;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
@Configuration
public class MySecurityConfig extends WebSecurityConfigurerAdapter {

	//authentication
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		 //types of authentication
		//    1. inMemeory
		  auth.inMemoryAuthentication()
		  .withUser("raju")
		  .password("{noop}123")
		  .authorities("admin");
		  auth.inMemoryAuthentication()
		  .withUser("sunil")
		  .password("{noop}123")
		  .authorities("student");
	}

	//authorization
	@Override
	protected void configure(HttpSecurity s) throws Exception {
		System.out.println(s);
		s.authorizeRequests().anyRequest().authenticated();
		s.formLogin();
		
		s.httpBasic();
		 
	}
}
