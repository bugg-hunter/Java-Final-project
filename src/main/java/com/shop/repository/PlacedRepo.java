package com.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shop.model.PlacedOrderModel;

public interface PlacedRepo extends JpaRepository<PlacedOrderModel,Integer>{
	
}