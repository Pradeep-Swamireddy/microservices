package com.pradeep.shopping.beans;

public class Item {

	public int itemId;
	public Seller seller;
	public String name;
	public int quantity;
	public double price;
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
		return this.sellerId;
	}

	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}
	
	
}
