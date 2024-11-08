package com.pablomonteserin.login.persistence.repository;

import com.pablomonteserin.login.persistence.entities.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Integer> {
}
