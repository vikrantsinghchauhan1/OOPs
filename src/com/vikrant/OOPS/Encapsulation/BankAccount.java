package com.vikrant.OOPS.Encapsulation;


class BankAccount {

    // Private variable: cannot be accessed directly outside this class.
    // This is an example of data hiding in encapsulation.
    private double balance = 10000;
    // Getter method: allows other classes to read the balance.
    public double getBalance() {
        return balance;
    }
    // Deposit method: adds money to the account.
    public void deposit(double amount) {

        // Check whether the deposit amount is positive.
        if (amount > 0) {

            // Update the private balance variable.
            balance = balance + amount;

            System.out.println("Deposit successful");

        } else {

            // Reject zero or negative deposit amounts.
            System.out.println("Invalid deposit amount");
        }
    }

    // Withdraw method: subtracts money from the account.
    public void withdraw(double amount) {

        // Check that the amount is positive
        // and the account has sufficient funds.
        if (amount > 0 && amount <= balance) {

            // Deduct the withdrawal amount from the balance.
            balance = balance - amount;

            System.out.println("Withdrawal successful");

        } else {
            // Reject invalid amounts or insufficient funds.
            System.out.println("Invalid withdrawal");
        }
    }
}

