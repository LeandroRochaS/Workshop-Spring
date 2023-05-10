package com.projetosleandro.javaweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetosleandro.javaweb.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
