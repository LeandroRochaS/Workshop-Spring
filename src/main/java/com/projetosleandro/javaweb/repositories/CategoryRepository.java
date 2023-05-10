package com.projetosleandro.javaweb.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.projetosleandro.javaweb.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
