public class BankAccount {

    private int accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + " | Account: " + accountNumber);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance! Cannot withdraw " + amount
                    + " | Account: " + accountNumber);
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " | Account: " + accountNumber);
        }
    }

    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public void displayDetails() {
        System.out.println("Account Number      : " + accountNumber);
        System.out.println("Account Holder Name : " + accountHolderName);
        System.out.println("Current Balance     : " + balance);
    }
}
