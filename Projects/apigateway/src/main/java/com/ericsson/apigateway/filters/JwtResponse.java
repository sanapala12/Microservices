package com.ericsson.apigateway.filters;
//DTO
public class JwtResponse {

	private String token;

	public JwtResponse(String token) {
		this.token = token;
	}

	public String getToken() {
		return token;
	}

}