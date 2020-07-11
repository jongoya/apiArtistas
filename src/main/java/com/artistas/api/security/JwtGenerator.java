package com.artistas.api.security;

import org.springframework.stereotype.Component;

import com.artistas.api.commons.Constants;
import com.artistas.api.models.JwtUser;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JwtGenerator {

	public String generate(JwtUser user) {
		Claims claims = Jwts.claims().setSubject(user.getUsername());
		claims.put(Constants.USER_ID, String.valueOf(user.getId()));
		claims.put(Constants.ROLE, user.getRole());
		
		return Jwts.builder().setClaims(claims).signWith(SignatureAlgorithm.HS256, Constants.YOUR_SECRET).compact();
	}
}
