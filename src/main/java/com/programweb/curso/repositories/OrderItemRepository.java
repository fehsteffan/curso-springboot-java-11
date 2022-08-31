package com.programweb.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.programweb.curso.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository <OrderItem, Long> {
	
	

}
