
// JAVA BANKING PROGRAM FOR BEGINNERS
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // DECLARE VARIABLES
        double balance = 2680.09;
        boolean isRunning = true;
        int choice;

        // DISPLAY MENU
        System.out.println("***************");
        System.out.println("Banking Program");
        System.out.println("***************");
        System.out.println("1. Show Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. exit");
        System.out.println("***************");
        System.out.println("\nchoose an options: ");
        choice = scanner.nextInt();

        // GET AND PROCESS USERS CHOICE
        switch (choice) {
            case 1:
                System.out.println("SHOWING BALANCE");
                showBalance(balance);
                break;
            case 2:
                System.out.println("DEPOSITING");
                deposit(balance);
                break;
            case 3:
                System.out.println("WITHDRAWING");
                withdraw(balance);
                break;
            case 4:
                System.out.println("ENJOY LIFE");
                isRunning = false;
                break;
            default:
                System.out.println("!!!INVALID CHOICE!!!");
                break;
        }

        // showBalance()

        // deposit()

        // withdraw()

        // EXIT MESSAGE
        scanner.close();

    }

    // Balance method
    public static double showBalance(double balance) {
        System.out.println("You balance is R" + balance + "\n");
        return balance;
    }

    public static double deposit(double balance) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter amount you want to deposit: R");
            double deposit_amount = scanner.nextDouble();

            if (deposit_amount < 1) {
                System.out.println("Be serious guy.");
            } else {
                balance += deposit_amount;
                System.out.println("You new balance is R" + balance + "\n");
                break;
            }
        }
        scanner.close();
        return balance;
    }

    public static double withdraw(double balance) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("Enter amount you want to withdraw: R");
            double withdrawn_amount = scanner.nextDouble();

            if (withdrawn_amount > balance) {
                System.out.println("Lol lower bruh, remember your balance is R" + balance);
            } else {
                balance -= withdrawn_amount;
                System.out.println("New balance is R" + balance);
                break;
            }
        }
        scanner.close();
        return balance;

    }

}