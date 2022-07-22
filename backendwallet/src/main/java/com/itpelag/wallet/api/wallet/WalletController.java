package com.itpelag.wallet.api.wallet;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.itpelag.wallet.jparepos.WalletService;
import com.itpelag.wallet.model.wallet.WalletControllerRequest;

@RestController
public class WalletController {
	
	private WalletService walletService;
	
	public WalletController(WalletService walletService) {
		this.walletService = walletService;
	}

	@PostMapping
	@RequestMapping("/login")
	public void verifyUser(@RequestBody WalletControllerRequest request) {
		Long id = request.getUser().getUserId();
		System.out.println(id);
	}
	
	@GetMapping
	@RequestMapping("/test")
	public void test(@RequestParam int method, long id) {
		if (method == 1) {
			walletService.findActiveSeedPhrase(id);
		} else if (method == 2) {
			walletService.findAllWalletsBySeed(id);
		} else if (method == 3) {
			walletService.initializeSeedForUser(id);
		}
	}
}
