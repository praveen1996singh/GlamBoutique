package com.pk.glamboutique.inventoryservice.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pk.glamboutique.inventoryservice.model.InventoryItem;
import com.pk.glamboutique.inventoryservice.service.InventoryService;

@RestController
@RequestMapping("/inventory")
public class InventoryController {

    @Autowired
    private InventoryService inventoryService;

    @GetMapping("/{productId}")
    public ResponseEntity<InventoryItem> getInventoryByProductId(@PathVariable String productId) {
        Optional<InventoryItem> inventoryItem = inventoryService.findByProductId(productId);
        return inventoryItem.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public InventoryItem saveInventoryItem(@RequestBody InventoryItem inventoryItem) {
        return inventoryService.save(inventoryItem);
    }
}
