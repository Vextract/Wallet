package com.itpelag.wallet.interceptor.api;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.web.servlet.HandlerInterceptor;

import com.itpelag.wallet.interceptor.infrastructure.AuthConnector;
import com.itpelag.wallet.interceptor.service.ConfigurationService;

public class AuthControllerInterceptor implements HandlerInterceptor{
	
	private AuthConnector connector;
	private ConfigurationService service;
	private JSONParser parser = new JSONParser();
	
	public AuthControllerInterceptor(AuthConnector connector, ConfigurationService service) {
		this.connector = connector;
		this.service = service;
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		String token = request.getHeader("Authorization");
		System.out.println("Got token from request: " + token);
		HttpURLConnection connection = service.configureRequest(connector.establishConnection(), token);
		System.out.println("Request configured");
		JSONObject jsonResponse = (JSONObject) parser.parse(new InputStreamReader(connection.getInputStream()));
		System.out.println("Request sent");
		System.out.println(jsonResponse);
		if (jsonResponse.get("authorized").equals(true)) {
			System.out.println("Authorized");
			return true;
		} else {
			System.out.println("Not Authorized");
			return false;
		}
	}

	
}
