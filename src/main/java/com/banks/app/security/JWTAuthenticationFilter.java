package com.banks.app.security;

import static com.banks.app.security.SecurityConstants.EXPIRATION_TIME;
import static com.banks.app.security.SecurityConstants.HEADER_STRING;
import static com.banks.app.security.SecurityConstants.SECRET;

import java.io.IOException;
import java.security.Key;
import java.util.ArrayList;
import java.util.Date;

import javax.crypto.spec.SecretKeySpec;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.DatatypeConverter;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class JWTAuthenticationFilter extends UsernamePasswordAuthenticationFilter{

	 private AuthenticationManager authenticationManager;
	    public JWTAuthenticationFilter(AuthenticationManager authenticationManager) {
	        this.authenticationManager = authenticationManager;
	    }
	    @Override
	    public Authentication attemptAuthentication(HttpServletRequest req,
	                                                HttpServletResponse res) throws AuthenticationException {
	        return authenticationManager.authenticate(
			        new UsernamePasswordAuthenticationToken(
			                "user",
			                "password",
			                new ArrayList<>())
			);
	    }
	    @Override
	    protected void successfulAuthentication(HttpServletRequest req,
	                                            HttpServletResponse res,
	                                            FilterChain chain,
	                                            Authentication auth) throws IOException, ServletException {
	    	SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;
	    	byte[] secretByte = DatatypeConverter.parseBase64Binary(SECRET);
	    	Key signingKey = new SecretKeySpec(secretByte, signatureAlgorithm.getJcaName());
	    	
	        String token = Jwts.builder()
	                .setSubject("subject")
	                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
	                .signWith(signatureAlgorithm, signingKey)
	                .compact();
	        res.addHeader(HEADER_STRING, token);
	    }
}
