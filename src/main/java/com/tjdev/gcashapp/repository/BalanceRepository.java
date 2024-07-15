package com.tjdev.gcashapp.repository;

import com.tjdev.gcashapp.entity.Balance;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface BalanceRepository extends JpaRepository<Balance, Long> {
    List<Balance> findByUserId(Long userId);
}
