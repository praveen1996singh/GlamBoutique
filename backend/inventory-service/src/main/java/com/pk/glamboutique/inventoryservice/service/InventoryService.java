package com.pk.glamboutique.inventoryservice.service;

import java.util.Optional;

import com.pk.glamboutique.inventoryservice.model.InventoryItem;

public interface InventoryService {
    Optional<InventoryItem> findByProductId(String productId);
    InventoryItem save(InventoryItem inventoryItem);
}
