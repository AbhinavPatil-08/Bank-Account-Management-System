# Bank-Account-Management-System

A simple Java program that demonstrates Object-Oriented Programming (OOP) concepts using classes and objects. It simulates basic bank account operations such as deposit, withdrawal, and balance checking.

## Features

- Create bank accounts using a parameterized constructor
- Deposit money into an account
- Withdraw money, with an insufficient balance check
- Check the current balance
- Display complete account details
- Each account maintains its own independent balance

## Project Structure

```
BankAccountManagementSystem/
├── BankAccount.java   # Class defining account data and operations
├── Main.java          # Contains main() method to run the program
└── README.md
```

## Class Description

### BankAccount

| Member | Type | Description |
|---|---|---|
| `accountNumber` | int | Unique account number |
| `accountHolderName` | String | Name of the account holder |
| `balance` | double | Current account balance |

| Method | Description |
|---|---|
| `BankAccount(int,
