package com.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shop.model.ProductModel;

public interface ProductRepo extends JpaRepository<ProductModel,Integer>{
	
}