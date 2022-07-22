package com.itpelag.wallet.interceptor.infrastructure;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.springframework.stereotype.Component;

import com.itpelag.wallet.utility.Connections;

@Component
public class FakeAuthConnector implements AuthConnector {

	@Override
	public HttpURLConnection establishConnection() {
		try {
			URL url = new URL(Connections.MOCK_URL);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			return con;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
