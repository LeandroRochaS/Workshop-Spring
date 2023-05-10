package com.projetosleandro.javaweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetosleandro.javaweb.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
