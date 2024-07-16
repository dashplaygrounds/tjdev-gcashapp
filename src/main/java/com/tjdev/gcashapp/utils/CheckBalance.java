package com.tjdev.gcashapp.utils;

import com.tjdev.gcashapp.controller.BalanceController;

public class CheckBalance {

    static BalanceController balanceController;

    public static Double checkBalance(Long userId) {
        return balanceController.getBalanceByUserId(userId).getAmount();
    }
}
