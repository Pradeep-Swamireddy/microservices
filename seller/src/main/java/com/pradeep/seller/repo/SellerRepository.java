package com.pradeep.seller.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pradeep.seller.entity.Seller;

public interface SellerRepository extends JpaRepository<Seller, String>{

}
