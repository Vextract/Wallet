package com.itpelag.wallet;

import org.aspectj.weaver.patterns.ArgsAnnotationPointcut;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.itpelag.wallet.jparepos.WalletService;

@SpringBootApplication
public class BackendwalletApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendwalletApplication.class, args);
	}

	/*
	 * @Bean CommandLineRunner run(WalletService walletService) { return args -> {
	 * walletService.addUser("John", "dasfj84ajtta"); walletService.addUser("Mark",
	 * "sdfs89j4l4A"); walletService.addUser("Mike", "dksaf8uJ$OHIsk");
	 * 
	 * walletService.initializeSeedForUser(false,1L);
	 * walletService.initializeSeedForUser(true,1L);
	 * walletService.initializeSeedForUser(false,2L);
	 * walletService.initializeSeedForUser(false,3L);
	 * walletService.initializeSeedForUser(false,3L);
	 * walletService.initializeSeedForUser(true,3L);
	 * 
	 * walletService.addWallet(4L, "Binance", "someAddress");
	 * walletService.addWallet(4L, "Tron", "someAddress");
	 * walletService.addWallet(5L, "Tron", "someAddress");
	 * walletService.addWallet(6L, "Ethereum", "someAddress");
	 * walletService.addWallet(6L, "Binance", "someAddress");
	 * walletService.addWallet(6L, "Tron", "someAddress");
	 * 
	 * }; }
	 */
}
