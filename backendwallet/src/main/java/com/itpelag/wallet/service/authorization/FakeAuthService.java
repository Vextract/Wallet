package com.itpelag.wallet.service.authorization;

import org.springframework.stereotype.Component;

import com.itpelag.wallet.infrastructure.FakeDB;

@Component
public class FakeAuthService {

	private FakeDB db;

	public FakeAuthService(FakeDB db) {
		this.db = db;
	}
	
	public boolean validateToken(String token) {
		return db.isTokenPresent(token);
	}
}
