# Bank Simulator

A simple banking simulator built with Java and Maven. The project is intended for learning and practicing object-oriented programming by modeling common banking concepts such as customers, accounts, transactions, and banking operations.

> This project is currently under development.

## Planned features

- Create and manage customers
- Create bank accounts
- Deposit and withdraw funds
- Transfer funds between accounts
- Record transaction history
- Handle insufficient-balance errors

## Technologies

- Java 25
- Maven
- IntelliJ IDEA

## Project structure

```text
src/main/java/com/llimadev/bank/
|-- BankApplication.java
|-- exception/
|   `-- InsuficientBalanceException.java
|-- model/
|   |-- Account.java
|   |-- Customer.java
|   `-- Transaction.java
`-- service/
    `-- BankService.java
```

## Requirements

Before running the project, install:

- JDK 25 or later
- Maven 3.9 or later

Confirm the installations with:

```bash
java --version
mvn --version
```

## Getting started

Clone the repository:

```bash
git clone git@github.com:llimadev/bank-simulator.git
cd bank-simulator
```

Compile the project:

```bash
mvn compile
```

Run `BankApplication.java` from your IDE. The command-line application behavior will be added as development progresses.

## Learning goals

This project provides practice with:

- Classes and objects
- Encapsulation
- Object relationships
- Service-layer organization
- Custom exceptions
- Maven project structure
- Git and GitHub workflows

## License

This project is licensed under the terms described in the [LICENSE](LICENSE) file.
