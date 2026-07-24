package com.llimadev.bank.service;
import javax.crypto.NullCipher;
import java.util.Scanner;

public class BankService {
        public void mainMenu() {

            int option = 0;

            String menuText = """
                    ====== Main Menu ======
                    
                    1. Login
                    2. Register Account
                    0. Cancel
                    """;

            do {
                System.out.println(menuText);
                Scanner input = new Scanner(System.in);
                option = Integer.parseInt(input.nextLine());

                switch (option) {
                    case 1:
                        System.out.println("Login");
                    case 2:
                        System.out.println("Register Account");
                    case 0:
                        System.out.println("Exit");
                        break;
                }
            } while (option != 0);

            System.out.println("Program terminated");
        }
}
