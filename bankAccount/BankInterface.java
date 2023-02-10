package bankAccount;

import java.util.Scanner;

public class BankInterface {
    public void bankAccount() {
        Scanner sc = new Scanner(System.in);
        BankOperations bankOperations = new BankOperations();

        while (true) {
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check balance");
            System.out.println("4. Exit");
            System.out.println("Enter yor choice:");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the amount to deposit:");
                    double amount = sc.nextDouble();
                    bankOperations.deposit(amount);
                    break;
                case 2:
                    System.out.println("Enter the amount to withdraw:");
                    amount = sc.nextDouble();
                    break;
                case 3:
                    System.out.println("Your balance is:" + bankOperations.getBalance());
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Error: Invalid operation");
                    System.out.println("Try again");
            }
        }
    }
}