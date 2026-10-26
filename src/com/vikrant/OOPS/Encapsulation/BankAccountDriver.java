package com.vikrant.OOPS.Encapsulation;

public class BankAccountDriver {

    public static void main(String[] args) {

        // Create an object of the BankAccount class.
        BankAccount account = new BankAccount();

        // Deposit 2000: balance changes from 10000 to 12000.
        account.deposit(2000);

        // Withdraw 3000: balance changes from 12000 to 9000.
        account.withdraw(3000);

        // Access the private balance through the public getter.
        System.out.println("Balance: " + account.getBalance());
    }
}