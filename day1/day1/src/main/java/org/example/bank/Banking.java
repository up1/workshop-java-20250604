package org.example.bank;

public class Banking {
    public static void main(String[] args) {
        Account somkiat = new Account(1, 100);
        Banking banking = new Banking();
        banking.deposit(somkiat, 500);
        System.out.println(somkiat.getBalance());
    }

    public void deposit(Account target, int amount) {
        target.addToBalance(amount);
//        TODO :: Create transaction
    }

}
