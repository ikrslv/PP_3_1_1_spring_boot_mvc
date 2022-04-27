package com.example.pp_3_1_1_spring_boot_mvc.repository;

import com.example.pp_3_1_1_spring_boot_mvc.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
