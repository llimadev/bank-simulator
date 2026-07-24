package com.llimadev.bank;

import com.llimadev.bank.model.Account;
import com.llimadev.bank.model.Customer;
import com.llimadev.bank.service.BankService;

public class BankApplication {
    public static void main(String[] args) {
        BankService bankService = new BankService();
        bankService.mainMenu();
    }
}
