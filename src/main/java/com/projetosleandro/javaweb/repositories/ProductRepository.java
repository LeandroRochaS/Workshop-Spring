package com.projetosleandro.javaweb.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.projetosleandro.javaweb.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
