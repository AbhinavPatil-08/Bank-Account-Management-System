public class Main {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount(101, "Rahul Sharma", 5000.0);
        BankAccount account2 = new BankAccount(102, "Priya Singh", 10000.0);

        System.out.println("--- Operations on Account 1 ---");
        account1.deposit(2000);
        account1.withdraw(1500);
        account1.withdraw(10000);   

        System.out.println("\n--- Operations on Account 2 ---");
        account2.deposit(3000);
        account2.withdraw(4000);

        System.out.println("\n=== Final Details of Account 1 ===");
        account1.displayDetails();

        System.out.println("\n=== Final Details of Account 2 ===");
        account2.displayDetails();

        System.out.println("\n--- Final Balances ---");
        System.out.print("Account 1 -> ");
        account1.checkBalance();
        System.out.print("Account 2 -> ");
        account2.checkBalance();
    }
}