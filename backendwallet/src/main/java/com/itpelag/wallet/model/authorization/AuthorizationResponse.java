package com.itpelag.wallet.model.authorization;

public class AuthorizationResponse {

	private boolean isAuthorized;
	private String message;
	
	public AuthorizationResponse(boolean isAuthorized, String message) {
		this.isAuthorized = isAuthorized;
		this.message = message;
	}

	public boolean isAuthorized() {
		return isAuthorized;
	}

	public void setAuthorized(boolean isAuthorized) {
		this.isAuthorized = isAuthorized;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	
}
