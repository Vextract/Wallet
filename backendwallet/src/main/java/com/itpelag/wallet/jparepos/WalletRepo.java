package com.itpelag.wallet.jparepos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itpelag.wallet.model.wallet.Wallet;

public interface WalletRepo extends JpaRepository<Wallet, Long>{
	
	List<Wallet> findBySeedPhraseId(Long seedPhraseId);

}
