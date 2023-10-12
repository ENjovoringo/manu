import java.util.Scanner;

public class DigitalTeller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 0.0;

        while (true) {
            System.out.println("Bank Teller");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    if (depositAmount > 0) {
                        balance += depositAmount;
                        System.out.println("Deposited: " + depositAmount);
                        System.out.println("Current Balance: " + balance);
                    } else {
                        System.out.println("Invalid deposit amount!");
                    }
                    break;
                case 2:
                    System.out.print("Enter the amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    if (withdrawAmount > 0 && withdrawAmount <= balance) {
                        balance -= withdrawAmount;
                        System.out.println("Withdrawn: " + withdrawAmount);
                        System.out.println("Current Balance: " + balance);
                    } else {
                        System.out.println("Invalid withdraw amount or insufficient balance!");
                    }
                    break;
                case 3:
                    System.out.println("Current Balance: " + balance);
                    break;
                case 4:
                    System.out.println("Thank you for using the Bank Teller!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
            System.out.println();
        }
    }
}

