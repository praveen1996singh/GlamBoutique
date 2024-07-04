package com.pk.glamboutique.inventoryservice.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pk.glamboutique.inventoryservice.model.InventoryItem;
import com.pk.glamboutique.inventoryservice.repository.InventoryRepository;

@Service
public class InventoryServiceImpl implements InventoryService {

    @Autowired
    private InventoryRepository inventoryRepository;

    @Override
    public Optional<InventoryItem> findByProductId(String productId) {
        return inventoryRepository.findByProductId(productId);
    }

    @Override
    public InventoryItem save(InventoryItem inventoryItem) {
        return inventoryRepository.save(inventoryItem);
    }
}
