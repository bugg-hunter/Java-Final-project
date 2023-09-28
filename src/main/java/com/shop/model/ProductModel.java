package com.shop.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="productdata")
public class ProductModel {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int product_id;
	private String description;
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	private String name;
	private double price ;
	@Override
	public String toString() {
		return "ProductModel [product_id=" + product_id + ", description=" + description + ", name=" + name + ", price="
				+ price + ", rating=" + rating + "]";
	}
	private int rating;
	
	
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getRating() {
		return rating;
	}
	
	

}
