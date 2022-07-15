package com.neosoft.springboot.stu.security;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

import com.neosoft.springboot.stu.service.*;

@Configuration
public class SpringSecurityconfig extends WebSecurityConfigurerAdapter{
	
	@Autowired
    MyUserDetailsService userDetailsService;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService)
		.passwordEncoder(NoOpPasswordEncoder.getInstance());
		 
	}
	
   @Override
    protected void configure(HttpSecurity http) throws Exception {
     	http.httpBasic()
		.and()
		.authorizeRequests()
		.antMatchers(HttpMethod.POST,"/**").hasAnyRole("ADMIN","USER")
		.antMatchers(HttpMethod.GET,"/**").hasAnyRole("ADMIN")
		.and()
		.csrf().disable();	
   	
    }
}