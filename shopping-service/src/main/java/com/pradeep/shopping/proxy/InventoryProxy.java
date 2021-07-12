package com.pradeep.shopping.proxy;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.pradeep.shopping.beans.Item;

@FeignClient(name="seller")
public interface InventoryProxy {

	@GetMapping("/api/items")
	public List<Item> getItems();
	

	@GetMapping("/api/what-items")
	public List<Item> getItemsWhichDontExist();

}
