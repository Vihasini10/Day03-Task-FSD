package task.java;
import java.util.Scanner;

public class BankAddress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 1000; 
        int choice;

        do {
            System.out.println("\n--- Bank Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Show Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter amount to deposit: ");
                double amount = scanner.nextDouble();
                balance += amount;
                System.out.println("Amount deposited.");
            } else if (choice == 2) {
                System.out.print("Enter amount to withdraw: ");
                double amount = scanner.nextDouble();
                if (amount <= balance) {
                    balance -= amount;
                    System.out.println("Amount withdrawn.");
                } else {
                    System.out.println("Not enough balance.");
                }
            } else if (choice == 3) {
                System.out.println("Current Balance: " + balance);
            } else if (choice == 4) {
                System.out.println("Thank you. Exiting...");
            } else {
                System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        scanner.close();
    }
}
