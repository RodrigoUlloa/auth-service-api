package com.example.userserviceapi.repositories;

import com.example.userserviceapi.common.entitites.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
