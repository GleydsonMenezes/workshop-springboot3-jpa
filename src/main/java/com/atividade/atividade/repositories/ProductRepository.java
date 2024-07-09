package com.atividade.atividade.repositories;

import com.atividade.atividade.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {



}
