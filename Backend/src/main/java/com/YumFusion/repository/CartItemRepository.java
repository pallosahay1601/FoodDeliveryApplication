package com.YumFusion.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.YumFusion.model.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {


//    CartItem findByFoodIsContaining

}
