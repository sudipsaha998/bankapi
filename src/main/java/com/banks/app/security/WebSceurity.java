package com.banks.app.security;

import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@EnableWebSecurity
public class WebSceurity extends WebSecurityConfigurerAdapter {

	 private UserDetailsService userDetailsService;
	 private BCryptPasswordEncoder bCryptPasswordEncoder;
	 
	 public WebSceurity(UserDetailsService userDetailsService, BCryptPasswordEncoder bCryptPasswordEncoder) {
	       this.userDetailsService = userDetailsService;
	       this.bCryptPasswordEncoder = bCryptPasswordEncoder;
	 }
	 
	 @Override
	 protected void configure(HttpSecurity http) throws Exception {
	        http.csrf().disable().authorizeRequests()
	                .anyRequest().authenticated()
	                .and()
	                .addFilter(new JWTAuthenticationFilter(authenticationManager()))
	                .addFilter(new JWTAuthorizationFilter(authenticationManager()));
	 }
	
	 @Override
	 public void configure(AuthenticationManagerBuilder auth) throws Exception {
	       auth.userDetailsService(userDetailsService).passwordEncoder(bCryptPasswordEncoder);
	 }
}
