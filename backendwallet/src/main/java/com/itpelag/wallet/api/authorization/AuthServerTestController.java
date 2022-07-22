package com.itpelag.wallet.api.authorization;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itpelag.wallet.model.authorization.AuthorizationResponse;
import com.itpelag.wallet.model.authorization.QueryToAuthServer;
import com.itpelag.wallet.service.authorization.FakeAuthService;
import com.itpelag.wallet.utility.Connections;

@RestController
public class AuthServerTestController {
	
	private FakeAuthService service;
	
	public AuthServerTestController(FakeAuthService service) {
		this.service = service;
	}

	@GetMapping
	@RequestMapping("/authorize")
	public AuthorizationResponse authorize(@RequestBody QueryToAuthServer query) {
		System.out.println("Get Request received");
		System.out.println(query);
		if (query.getAccessKeyString().equals(Connections.ACCESS_KEY_STRING)) {
			boolean response;
			if (response = service.validateToken(query.getTokenString())) {
				return new AuthorizationResponse(response, "Valid token");
			} else {
				return new AuthorizationResponse(response, "Invalid token");
			}
		} else {
			return new AuthorizationResponse(false, "Invalid Access key");
		}
	}
}
