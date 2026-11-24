# Bank Account Management System

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
| `BankAccount(int, String, double)` | Parameterized constructor to initialize account details |
| `deposit(double amount)` | Adds money to the account |
| `withdraw(double amount)` | Deducts money; shows a message if balance is insufficient |
| `checkBalance()` | Displays the current balance |
| `displayDetails()` | Displays account number, holder name, and balance |

### Main

Creates two `BankAccount` objects (Abhinav and Shahib), performs deposit and withdrawal operations on both, and displays their final details.

## OOP Concepts Used

- **Class and Object**: `BankAccount` is the blueprint, and `account1` and `account2` are objects
- **Encapsulation**: data members are `private` and accessed through public methods
- **Constructor**: a parameterized constructor initializes each object

## How to Run

1. Make sure Java (JDK 8 or above) is installed:
   ```bash
   java -version
   ```
2. Clone the repository:
   ```bash
   git clone https://github.com/<your-username>/BankAccountManagementSystem.git
   cd BankAccountManagementSystem
   ```
3. Compile the code:
   ```bash
   javac BankAccount.java Main.java
   ```
4. Run the program:
   ```bash
   java Main
   ```

## Sample Output

```
--- Operations on Account 1 ---
Deposited: 2000.0 | Account: 101
Withdrawn: 1500.0 | Account: 101
Insufficient balance! Cannot withdraw 10000.0 | Account: 101

--- Operations on Account 2 ---
Deposited: 3000.0 | Account: 102
Withdrawn: 4000.0 | Account: 102

=== Final Details of Account 1 ===
Account Number      : 101
Account Holder Name : Abhinav
Current Balance     : 5500.0

=== Final Details of Account 2 ===
Account Number      : 102
Account Holder Name : Shahib
Current Balance     : 9000.0

--- Final Balances ---
Account 1 -> Current Balance: 5500.0
Account 2 -> Current Balance: 9000.0
```

## Author

**Abhinav**
GitHub: [@AbhinavPatil-08](https://github.com/AbhinavPatil-08)
