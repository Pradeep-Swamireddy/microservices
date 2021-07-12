package com.pradeep.seller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pradeep.seller.entity.Item;
import com.pradeep.seller.entity.Seller;
import com.pradeep.seller.repo.InventoryRepository;
import com.pradeep.seller.repo.SellerRepository;

@SpringBootApplication
public class SellerApplication implements CommandLineRunner {

	@Autowired
	private InventoryRepository inventoryRepo;

	@Autowired
	private SellerRepository sellerRepo;

	public static void main(String[] args) {
		SpringApplication.run(SellerApplication.class, args);
	}

	public void run(String... args) throws Exception {

		/*
		 * Seller seller1 = new Seller("pradeep50", "Pradeep", "+911234567890"); Item
		 * item1 = new Item(seller1, "Mango", 1500, 50.0); Item item2 = new
		 * Item(seller1, "Oranges", 900, 20.0); List<Item> items = Arrays.asList(item1,
		 * item2); seller1.setItems(items); sellerRepo.save(seller1);
		 */

	}

}
