package com.YumFusion.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.YumFusion.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
