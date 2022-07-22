package com.itpelag.wallet.utility;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.itpelag.wallet.interceptor.api.AuthControllerInterceptor;
import com.itpelag.wallet.interceptor.infrastructure.FakeAuthConnector;
import com.itpelag.wallet.interceptor.service.ConfigurationService;

@Configuration
public class WebConfiguration implements WebMvcConfigurer {

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new AuthControllerInterceptor(new FakeAuthConnector(), new ConfigurationService())).addPathPatterns("/login/**");
	}
}
