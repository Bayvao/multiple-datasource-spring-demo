package com.example.repositories.order;

import com.example.model.order.Orders;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Orders, Integer> {
}
