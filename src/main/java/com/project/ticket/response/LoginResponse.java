package com.project.ticket.response;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;

public class LoginResponse {

	public LoginResponse(Long id2, String username2, String jwtToken,
			Collection<? extends GrantedAuthority> authorities2) {
		// TODO Auto-generated constructor stub
	}
	private Long id;
    private String username;
    private String token;
    private Collection<? extends GrantedAuthority> authorities;
}
