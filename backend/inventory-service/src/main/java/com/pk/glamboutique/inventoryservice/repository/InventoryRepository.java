package com.pk.glamboutique.inventoryservice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pk.glamboutique.inventoryservice.model.InventoryItem;

public interface InventoryRepository extends JpaRepository<InventoryItem, Long> {

	Optional<InventoryItem> findByProductId(String productId);
}
