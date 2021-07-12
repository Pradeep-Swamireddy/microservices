package com.pradeep.seller.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.pradeep.seller.entity.Item;
import com.pradeep.seller.entity.Seller;

public interface InventoryRepository extends PagingAndSortingRepository<Item, Integer>{

	public List<Item> findAllBySeller(Optional<Seller> optional);

}
