package com.atividade.atividade.repositories;

import com.atividade.atividade.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Order, Long> {



}
