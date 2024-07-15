package com.tjdev.gcashapp.controller;

import com.tjdev.gcashapp.repository.TransactionRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("transactions")
public class TransactionController {

    @Autowired
    private TransactionRepository transactionRepository;

//    @GetMapping("/hello")
//    public String sayHello() {
//        return "Hello";
//    }

}