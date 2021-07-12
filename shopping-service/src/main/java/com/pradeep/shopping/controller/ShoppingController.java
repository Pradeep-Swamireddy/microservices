package com.pradeep.shopping.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pradeep.shopping.beans.Item;
import com.pradeep.shopping.proxy.InventoryProxy;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
public class ShoppingController {

	@Autowired
	private InventoryProxy inventoryProxy;
	
	@GetMapping("/api/items")
	@CircuitBreaker(name = "default", fallbackMethod = "itemsFallback")
	public List<Item> getItems(){
		return inventoryProxy.getItemsWhichDontExist();
	}
	
	public List<Item> itemsFallback(Throwable t){
		return new ArrayList<>();
	}
}
