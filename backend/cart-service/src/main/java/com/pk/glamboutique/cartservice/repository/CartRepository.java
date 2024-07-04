package com.pk.glamboutique.cartservice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pk.glamboutique.cartservice.model.Cart;

public interface CartRepository extends JpaRepository<Cart, Long> {

	 Optional<Cart> findByUserId(Long userId);
}
