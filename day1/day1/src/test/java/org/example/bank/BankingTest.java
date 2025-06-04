package org.example.bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankingTest {

    @Test
    void depositWithValidAmount() {
        Account somkiat = new Account(1, 100);
        Banking banking = new Banking();
        banking.deposit(somkiat, 500);
        assertEquals(600, somkiat.getBalance());
    }

    @Test
    void depositWithNegativeAmount() {
        Account somkiat = new Account(1, 100);
        Banking banking = new Banking();
        banking.deposit(somkiat, -500);
        assertEquals(100, somkiat.getBalance());
    }

    @Test
    void depositWithInvalidMinimum10Amount() {
        Account somkiat = new Account(1, 100);
        Banking banking = new Banking();
        banking.deposit(somkiat, 5);
        assertEquals(100, somkiat.getBalance());
    }
}