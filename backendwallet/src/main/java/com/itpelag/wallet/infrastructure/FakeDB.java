package com.itpelag.wallet.infrastructure;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class FakeDB {

	private List<String> dbList;
	
	{
		dbList = List.of("Bearer dgsadhs3537ag2fdfhd", "Bearer jksg84js6ksnkgsd5", "Bearer 9karpajaahk8fd64hHH98s");
	}
	
	public boolean isTokenPresent(String token) {
		System.out.println("Validating token");
		return dbList.contains(token);
	}
}
