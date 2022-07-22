package com.itpelag.wallet.model.wallet;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SeedPhrase {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long seedId;
	private boolean active;
	private Long userId;

	public SeedPhrase() {
	}

	public SeedPhrase(boolean active, Long userId) {
		this.active = active;
		this.userId = userId;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Long getSeedId() {
		return seedId;
	}

	public void setSeedId(Long seedId) {
		this.seedId = seedId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "SeedPhrase [seedId=" + seedId + ", active=" + active + ", userId=" + userId + "]";
	}
	
	
	
	
	
	
}
