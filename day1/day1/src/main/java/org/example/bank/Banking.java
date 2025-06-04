package org.example.bank;

public class Banking {

    public void deposit(Account target, int amount) {
        if(amount >= 10) {
            target.addToBalance(amount);
        }
//        TODO :: Create transaction
        createTransaction("Deposit", target.getId(), amount);
    }

    private void createTransaction(String eventName, int id, int amount) {
        Transaction transaction = new Transaction(eventName, id, amount);
        // Save transaction to DB
    }

}
