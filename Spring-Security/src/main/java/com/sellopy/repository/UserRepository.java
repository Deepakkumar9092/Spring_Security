package com.sellopy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sellopy.model.UserDtls;

public interface UserRepository extends JpaRepository<UserDtls, Integer>{

	UserDtls findByUsername(String username);



}
