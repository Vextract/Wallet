package com.itpelag.wallet.jparepos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itpelag.wallet.model.wallet.User;

public interface UserRepo extends JpaRepository<User, Long>{

}
