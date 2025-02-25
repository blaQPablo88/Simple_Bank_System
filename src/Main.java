
// JAVA BANKING PROGRAM FOR BEGINNERS
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double balance = 0;
        boolean isRunning = true;
        int choice;

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

        switch (choice) {
            case 1:
                System.out.println("SHOWING BALANCE");
                System.out.println("You balance is R" + showBalance(balance) + "\n");
            case 2:
                System.out.println("DEPOSITING");
            case 3:
                System.out.println("WITHDRAWING");
            case 4:
                System.out.println("ENJOY LIFE");
                isRunning = false;
            default:
                System.out.println("!!!INVALID CHOICE!!!");
                break;
        }


        // DECLARE VARIABLES

        // DISPLAY MENU

        // GET AND PROCESS USERS CHOICE

        // showBalance()

        // deposit()

        // withdraw()

        // EXIT MESSAGE
        scanner.close();

    }

    // Balance method
    public static double showBalance(double balance) {
        return balance;
    }

}