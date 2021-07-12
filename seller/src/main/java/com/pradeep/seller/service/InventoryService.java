package com.pradeep.seller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pradeep.seller.entity.Item;
import com.pradeep.seller.repo.InventoryRepository;
import com.pradeep.seller.repo.SellerRepository;

@Service
public class InventoryService {

	@Autowired
	private InventoryRepository inventoryRepo;

	@Autowired
	private SellerRepository sellerRepo;
	
	public Iterable<Item> getItems() {		
		return inventoryRepo.findAll();
				//inventoryRepo.findAllBySeller(sellerRepo.findById("pradeep50"));
	}

}
