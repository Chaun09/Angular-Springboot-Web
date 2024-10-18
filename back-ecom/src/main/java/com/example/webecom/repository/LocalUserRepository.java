package com.example.webecom.repository;

import com.example.webecom.entity.LocalUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocalUserRepository extends JpaRepository<LocalUser, Long> { }
