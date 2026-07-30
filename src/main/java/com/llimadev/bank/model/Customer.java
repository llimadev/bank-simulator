package com.llimadev.bank.model;

public class Customer {
    private final String name;
    private final String email;
    private final String password;

    public Customer(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public boolean checkPassword(String enteredPassword) {
        return password.equals(enteredPassword);
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Customer name: " + name + "\n" +
                "Email: " + email;
    }
}
