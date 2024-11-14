//package com.curdrest.api.service;
//
//
//import org.springframework.stereotype.Service;
//
//import java.util.Date;
//import java.util.function.Function;
//
//
//import java.util.Collection;
//
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//@Service
//public interface JwtService {
//    String extractUserName(String token);
//
//    String generateToken(UserDetails userDetails);
//
//    boolean isTokenValid(String token, UserDetails userDetails);
//
//	boolean validateToken(String token);
//
//	String extractUsername(String token);
//
//	Collection<? extends GrantedAuthority> extractAuthorities(String token);
//}