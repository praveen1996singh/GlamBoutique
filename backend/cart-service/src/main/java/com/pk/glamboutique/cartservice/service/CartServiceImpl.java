package com.pk.glamboutique.cartservice.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pk.glamboutique.cartservice.model.Cart;
import com.pk.glamboutique.cartservice.repository.CartRepository;

@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private CartRepository cartRepository;

    @Override
    public Optional<Cart> getCartByUserId(Long userId) {
        return cartRepository.findByUserId(userId);
    }

    @Override
    public Cart saveCart(Cart cart) {
        return cartRepository.save(cart);
    }
}
