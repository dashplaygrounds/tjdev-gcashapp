package com.tjdev.gcashapp.controller;

import com.tjdev.gcashapp.entity.Balance;
import com.tjdev.gcashapp.exception.ResourceNotFoundException;
import com.tjdev.gcashapp.repository.BalanceRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("balances")
public class BalanceController {

    @Autowired
    private BalanceRepository balanceRepository;

//    @GetMapping("/hello")
//    public String sayHello() {
//        return "Hello";
//    }

    @GetMapping("/{userId}")
    public Balance getBalanceByUserId(@PathVariable Long userId) {
        return balanceRepository.findBalanceByUserId(userId);
    }

    @PostMapping("/create")
    public Balance createBalance(@RequestBody Balance balance) {
        return balanceRepository.save(balance);
    }

    @PutMapping("/users")
    public Balance updateBalance(@RequestParam Long userId,
                                   @RequestBody Balance newBalanceRequest) {
        return balanceRepository.findById(userId)
                .map(balance -> {
                    balance.setAmount(newBalanceRequest.getAmount());
                    return balanceRepository.save(balance);
                }).orElseThrow(() -> new ResourceNotFoundException("Question not found with id " + userId));
    }
//
//
//    @DeleteMapping("/{questionId}")
//    public ResponseEntity<?> deleteQuestion(@PathVariable Long questionId) {
//        return questionRepository.findById(questionId)
//                .map(question -> {
//                    questionRepository.delete(question);
//                    return ResponseEntity.ok().build();
//                }).orElseThrow(() -> new ResourceNotFoundException("Question not found with id " + questionId));
//    }
}