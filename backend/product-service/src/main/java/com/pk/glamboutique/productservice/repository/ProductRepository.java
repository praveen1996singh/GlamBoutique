package com.pk.glamboutique.productservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pk.glamboutique.productservice.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
