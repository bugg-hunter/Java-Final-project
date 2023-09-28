package com.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shop.model.UserModel;

public interface UserRepo extends JpaRepository<UserModel,Integer>{
	
}