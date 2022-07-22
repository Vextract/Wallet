package com.itpelag.wallet.model.wallet;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WalletControllerRequest {
	
	private User user;

	public WalletControllerRequest(@JsonProperty("user") User user) {
		this.user = user;
	}

	public User getUser() {
		return user;
	}

}
