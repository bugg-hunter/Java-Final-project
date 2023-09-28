package com.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shop.model.OrderTrackingModel;

public interface OrderRepo extends JpaRepository<OrderTrackingModel,Integer>{
	
}