package com.shop.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="placeorder")
public class PlacedOrderModel {
	   @Id
	@GeneratedValue
    private int order_id;
	private String  Name; 
    
    private String rate;
    private String  rating;
	private String status;
    private int quantity;

	 @ManyToOne
    private UserModel id;

    public UserModel getid() {
        return id;
    }
    public void setId(UserModel id) {
        this.id = id;
    }
	   @Override
    public String toString() {
        return "PlacedOrderModel [Name=" + Name + ", id=" + id + ", rate=" + rate + ", rating=" + rating + ", status="
                + status + ", quantity=" + quantity + "]";
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public int getId() {
	   	return order_id;
	   }
	   public void setId(int id) {
	   	this.order_id = id;
	   }
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
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
	
	
	
	    
}