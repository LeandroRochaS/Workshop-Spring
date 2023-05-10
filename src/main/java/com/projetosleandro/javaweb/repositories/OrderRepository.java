package com.projetosleandro.javaweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetosleandro.javaweb.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
