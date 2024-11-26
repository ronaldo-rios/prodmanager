package com.prodmanager.product.repositories;

import com.prodmanager.product.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
