package com.shop.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="ordertracker")
public class OrderTrackingModel {
	@Id
	@GeneratedValue
	private String tracker_id;
	public String getTracker_id() {
		return tracker_id;
	}
	public void setTracker_id(String tracker_id) {
		this.tracker_id = tracker_id;
	}
	private String product_name; 
	private String  rating;
	private String rate;
	@ManyToOne
	private PlacedOrderModel order_id;
	public PlacedOrderModel getOrder_id() {
		return order_id;
	}
	public void setOrder_id(PlacedOrderModel order_id) {
		this.order_id = order_id;
	}
	
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String name) {
		product_name = name;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	
	@Override
	public String toString() {
		return "otController [id=" + tracker_id + ", Name=" + product_name + ", rating=" + rating + ", rate=" + rate + ", status="
				+ status + "]";
	}
	private String status;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	    
}