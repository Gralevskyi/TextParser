package com.gralevskyi.resttextparser.security.jwt;

import org.springframework.security.core.AuthenticationException;

public class JwtAuthenticationException extends AuthenticationException {

	private static final long serialVersionUID = 1L;

	public JwtAuthenticationException(String msg, Throwable t) {
		super(msg, t);
	}

	public JwtAuthenticationException(String msg) {
		super(msg);
	}
}
