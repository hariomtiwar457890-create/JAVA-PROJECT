import java.util.Scanner;

public class ATMSystem {

    static double balance = 10000; // starting balance
    static int pin = 1234;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== WELCOME TO JAVA ATM =====");

        System.out.print("Enter your PIN: ");
        int enteredPin = sc.nextInt();

        if (enteredPin != pin) {
            System.out.println("❌ Wrong PIN! Access Denied");
            sc.close();
            return;
        }

        while (true) {

            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("💰 Current Balance: ₹" + balance);
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ");
                    double deposit = sc.nextDouble();
                    balance += deposit;
                    System.out.println("✅ Money Deposited Successfully!");
                    break;

                case 3:
                    System.out.print("Enter withdraw amount: ");
                    double withdraw = sc.nextDouble();

                    if (withdraw > balance) {
                        System.out.println("❌ Insufficient Balance!");
                    } else {
                        balance -= withdraw;
                        System.out.println("✅ Please collect your cash!");
                    }
                    break;

                case 4:
                    System.out.println("👋 Thank you for using ATM");
                    sc.close();
                    return;

                default:
                    System.out.println("❌ Invalid Option!");
            }
        }
    }
}