package com.tjdev.gcashapp.controller;

import com.tjdev.gcashapp.repository.BalanceRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("balances")
public class BalanceController {

    @Autowired
    private BalanceRepository balanceRepository;

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello";
    }

}