package com.itpelag.wallet.jparepos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itpelag.wallet.model.wallet.SeedPhrase;

public interface SeedPhraseRepo extends JpaRepository<SeedPhrase, Long> {

	List<SeedPhrase> findByUserId(Long userId);
}
