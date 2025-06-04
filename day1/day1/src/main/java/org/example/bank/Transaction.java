package org.example.bank;

public class Transaction {
    private String eventName;
    private int accountId;
    private int amount;

    public Transaction(String eventName, int accountId, int amount) {
        this.eventName = eventName;
        this.accountId = accountId;
        this.amount = amount;
    }
}
