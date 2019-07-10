package com.banks.app.security;

import static com.banks.app.security.SecurityConstants.HEADER_STRING;
import static com.banks.app.security.SecurityConstants.SECRET;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.DatatypeConverter;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

public class JWTAuthorizationFilter extends BasicAuthenticationFilter {

	 public JWTAuthorizationFilter(AuthenticationManager authManager) {
	        super(authManager);
	    }
	    @Override
	    protected void doFilterInternal(HttpServletRequest req,
	                                    HttpServletResponse res,
	                                    FilterChain chain) throws IOException, ServletException {
	        String header = req.getHeader(HEADER_STRING);
	        if (header == null) {
	            chain.doFilter(req, res);
	            return;
	        }
	        UsernamePasswordAuthenticationToken authentication = getAuthentication(req);
	        SecurityContextHolder.getContext().setAuthentication(authentication);
	        chain.doFilter(req, res);
	    }
	    private UsernamePasswordAuthenticationToken getAuthentication(HttpServletRequest request) {
	        String token = request.getHeader(HEADER_STRING);
	        System.out.println(token+" token");
	        if (token != null) {
	            // parse the token.
	            Claims claim = Jwts.parser()
	                    .setSigningKey(DatatypeConverter.parseBase64Binary(SECRET))
	                    .parseClaimsJws(token)
	                    .getBody();
	            if (claim != null) {
	                return new UsernamePasswordAuthenticationToken("user", null, new ArrayList<>());
	            }
	            return null;
	        }
	        return null;
}
}
