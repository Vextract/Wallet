package com.itpelag.wallet.model.wallet;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Wallet {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long walletId;
	private Long seedPhraseId;
	private String blockchain;
	private String address;

	public Wallet() {
	}

	public Wallet(Long seedPhraseId, String blockchain, String address) {
		this.seedPhraseId = seedPhraseId;
		this.blockchain = blockchain;
		this.address = address;
	}

	public Long getWalletId() {
		return walletId;
	}

	public void setWalletId(Long walletId) {
		this.walletId = walletId;
	}

	public String getBlockchain() {
		return blockchain;
	}

	public void setBlockchain(String blockchain) {
		this.blockchain = blockchain;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getSeedPhraseId() {
		return seedPhraseId;
	}

	public void setSeedPhraseId(Long seedPhraseId) {
		this.seedPhraseId = seedPhraseId;
	}

	@Override
	public String toString() {
		return "Wallet [walletId=" + walletId + ", seedPhraseId=" + seedPhraseId + ", blockchain=" + blockchain
				+ ", address=" + address + "]";
	}
	
	
	
}
