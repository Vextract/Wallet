package com.itpelag.wallet.interceptor.infrastructure;

import java.net.HttpURLConnection;

public interface AuthConnector {
	
	HttpURLConnection establishConnection();
	
}
