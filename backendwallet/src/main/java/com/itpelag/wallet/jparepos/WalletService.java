package com.itpelag.wallet.jparepos;

public interface WalletService {

	boolean findActiveSeedPhrase(Long userId);
	
	void findAllWalletsBySeed(Long seedId);

	void initializeSeedForUser(Long userId);
}
