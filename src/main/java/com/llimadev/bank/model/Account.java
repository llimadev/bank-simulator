package com.llimadev.bank.model;

public class Account {
    private final int accountNumber;
    private double balance;
    private final Customer customer;

    public Account(int accountNumber, double balance,  Customer customer) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customer = customer;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    @Override
    public String toString() {
        return "\nAccount number: " + accountNumber +
                "\nBalance: " + balance;
    }
}
