package com.tjdev.gcashapp.utils;

import com.tjdev.gcashapp.controller.BalanceController;
import com.tjdev.gcashapp.controller.TransactionController;
import com.tjdev.gcashapp.entity.Balance;
import com.tjdev.gcashapp.entity.Transaction;

public class CashIn {

    BalanceController balanceController;
    TransactionController transactionController;

    public boolean cashIn(Long sourceId,
                          Long userId,
                          Double amount) {
        // TODO
        // Checks on amount

        Double newBalance = CheckBalance.checkBalance(userId) + amount;
        // Update balance
        balanceController.updateBalance(userId,
                new Balance(
                        newBalance,
                        userId
                )
        );
        // Create transaction
        transactionController.createTransaction(
                new Transaction(
                        amount,
                        "Purpose 1",
                        sourceId,
                        "2024-07-16",
                        userId,
                        sourceId
                )
        );

        return false;
    }
}