package com.llimadev.bank.service;

import com.llimadev.bank.model.Account;

import java.util.Scanner;

public class BankService {
    private static final int MAX_LOGIN_ATTEMPTS = 3;

    public void mainMenu(Account account) {
        Scanner input = new Scanner(System.in);
        int option;

        do {
            printMenu();
            option = readInteger(input, "Choose an option: ");

            switch (option) {
                case 1:
                    login(input, account);
                    break;
                case 2:
                    System.out.println("Register Account");
                    break;
                case 0:
                    System.out.println("Program terminated");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (option != 0);
    }

    private void printMenu() {
        System.out.println("""
                ====== Main Menu ======

                1. Login
                2. Register Account
                0. Cancel
                """);
    }

    private void login(Scanner input, Account account) {
        for (int attempt = 1; attempt <= MAX_LOGIN_ATTEMPTS; attempt++) {
            int enteredAccountNumber =
                    readInteger(input, "Please enter your account number: ");

            System.out.print("Please enter your password: ");
            String enteredPassword = input.nextLine();

            boolean correctAccountNumber =
                    enteredAccountNumber == account.getAccountNumber();
            boolean correctPassword =
                    account.getCustomer().checkPassword(enteredPassword);

            if (correctAccountNumber && correctPassword) {
                System.out.println("\nLogin successful!");
                System.out.println(account.getCustomer());
                System.out.println(account);
                return;
            }

            int remainingAttempts = MAX_LOGIN_ATTEMPTS - attempt;
1
            if (remainingAttempts > 0) {
                System.out.printf(
                        "Incorrect account number or password. %d attempt(s) remaining.%n%n",
                        remainingAttempts
                );
            }
        }

        System.out.println("Login blocked after 3 unsuccessful attempts.");
    }

    private int readInteger(Scanner input, String message) {
        while (true) {
            System.out.print(message);
            String value = input.nextLine();

            try {
                return Integer.parseInt(value);
            } catch (NumberFormatException exception) {
                System.out.println("Please enter a valid number.");
            }
        }
    }
}
