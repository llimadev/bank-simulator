package com.llimadev.bank;

import com.llimadev.bank.model.Account;
import com.llimadev.bank.model.Customer;

public class BankApplication {
    public static void main(String[] args) {
        Customer customer = new
                Customer("Leonel", "leonel@app.com", "1234");

        Account account = new
                Account(100,150.01, customer);

        System.out.println(customer + "\n\n" + account);
    }
}
