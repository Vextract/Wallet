package com.itpelag.wallet.model.authorization;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.itpelag.wallet.utility.Connections;

public class QueryToAuthServer {

	private String tokenString;
	private String accessKeyString;
	
	
	public QueryToAuthServer(@JsonProperty("token")String tokenString) {
		this.tokenString = tokenString;
		this.accessKeyString = Connections.ACCESS_KEY_STRING;
	}


	public String getTokenString() {
		return tokenString;
	}


	public String getAccessKeyString() {
		return accessKeyString;
	}


	@Override
	public String toString() {
		return "QueryToAuthServer [tokenString=" + tokenString + ", accessKeyString=" + accessKeyString + "]";
	}
	
}
