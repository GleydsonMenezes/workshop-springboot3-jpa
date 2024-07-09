package com.atividade.atividade.repositories;

import com.atividade.atividade.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {



}
