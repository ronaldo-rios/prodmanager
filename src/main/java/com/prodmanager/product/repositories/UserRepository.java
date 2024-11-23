package com.prodmanager.product.repositories;

import com.prodmanager.product.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
