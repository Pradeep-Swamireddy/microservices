package com.pradeep.seller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pradeep.seller.entity.Seller;
import com.pradeep.seller.repo.SellerRepository;

@Service
public class SellerService {

	@Autowired
	private SellerRepository sellerRepo;
	
	public void saveSeller(Seller seller) {
		sellerRepo.save(seller);
	}
	
}
