package com.pradeep.seller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pradeep.seller.entity.Item;
import com.pradeep.seller.service.InventoryService;

@RestController
public class InventoryController {

	@Autowired
	private InventoryService inventoryService;
	
	@GetMapping("/api/items")
	public Iterable<Item> getSellerItems(){
		return inventoryService.getItems();
	}
}
