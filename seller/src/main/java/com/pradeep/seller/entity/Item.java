package com.pradeep.seller.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int itemId;
	@JsonIgnore
	@ManyToOne
	public Seller seller;
	public String name;
	public int quantity;
	public double price;
	@Transient
	public String sellerId;

	public Item(Seller seller, String name, int quantity, double price) {
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.seller=seller;
	}

	public Item() {
	}

	public String getSellerId() {
		return seller.getSellerId();
	}

	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}
	
	
}
