package com.llimadev.bank;

import com.llimadev.bank.model.Account;
import com.llimadev.bank.model.Customer;
import com.llimadev.bank.service.BankService;

public class BankApplication {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "Pedro",
                "pedro@email.com",
                "0001"
        );
        Account account = new Account(1234, 302.35, customer);

        BankService bankService = new BankService();
        bankService.mainMenu(account);
    }
}
