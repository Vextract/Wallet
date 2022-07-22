package com.itpelag.wallet.interceptor.service;

import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;

import org.json.simple.JSONObject;
import org.springframework.stereotype.Component;

@Component
public class ConfigurationService {

	public HttpURLConnection configureRequest(HttpURLConnection conToConfigure, String token) {
		HttpURLConnection con = conToConfigure;
		try {
			con.setDoOutput(true);
			con.setDoInput(true);
			con.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
			con.setRequestProperty("Accept", "application/json");
			con.setRequestMethod("GET");
			JSONObject tokenObject = new JSONObject();
			tokenObject.put("token", token);
			OutputStream os = con.getOutputStream();
			os.write(tokenObject.toString().getBytes("UTF-8"));
			os.close();
			return con;
		} catch (ProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
}
