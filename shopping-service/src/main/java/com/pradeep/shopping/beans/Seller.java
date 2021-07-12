package com.pradeep.shopping.beans;

import java.util.List;

public class Seller {

	private String sellerId;
	private String name;
	private String phoneNo;

	private List<Item> items;

	public Seller(String sellerId, String name, String phoneNo) {
		this.sellerId = sellerId;
		this.name = name;
		this.phoneNo = phoneNo;
	}

	public Seller() {

	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public String getSellerId() {
		return sellerId;
	}

	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

}
