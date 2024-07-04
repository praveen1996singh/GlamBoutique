package com.pk.glamboutique.cartservice.service;

import java.util.Optional;

import com.pk.glamboutique.cartservice.model.Cart;

public interface CartService {
    Optional<Cart> getCartByUserId(Long userId);
    Cart saveCart(Cart cart);

}
