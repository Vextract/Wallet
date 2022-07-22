package com.itpelag.wallet.service.wallet;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.itpelag.wallet.jparepos.SeedPhraseRepo;
import com.itpelag.wallet.jparepos.UserRepo;
import com.itpelag.wallet.jparepos.WalletRepo;
import com.itpelag.wallet.jparepos.WalletService;
import com.itpelag.wallet.model.wallet.SeedPhrase;
import com.itpelag.wallet.model.wallet.User;
import com.itpelag.wallet.model.wallet.Wallet;

import lombok.RequiredArgsConstructor;

@Service @RequiredArgsConstructor @Transactional
public class WalletServiceImpl implements WalletService{

	private final UserRepo userRepo;
	private final SeedPhraseRepo seedPhraseRepo;
	private final WalletRepo walletRepo;
	
	@Override
	public boolean findActiveSeedPhrase(Long userId) {
		try {
			System.out.println(seedPhraseRepo.findByUserId(userId).stream().filter(seed -> seed.isActive()).findFirst().get());
			return true;
		} catch (Exception e) {
			System.out.println("No active seed phrase for this user.");
			return false;
		}
	}
	
	@Override
	public void initializeSeedForUser(Long userId) {
		if (!findActiveSeedPhrase(userId)) {
			SeedPhrase seedPhrase = new SeedPhrase(true, userId);
			System.out.println(seedPhraseRepo.save(seedPhrase));
		} else {
			System.out.println("There is another active seed phrase for this user.");
		}
	}

	@Override
	public void findAllWalletsBySeed(Long seedId) {
		walletRepo.findBySeedPhraseId(seedId).stream().forEach(System.out::println);
	}
}
