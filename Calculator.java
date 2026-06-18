import java.util.Scanner;

public class Calculator {

    // Addition
    static double add(double a, double b) {
        return a + b;
    }

    // Subtraction
    static double subtract(double a, double b) {
        return a - b;
    }

    // Multiplication
    static double multiply(double a, double b) {
        return a * b;
    }

    // Division
    static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("❌ Error: Division by zero not allowed!");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== SIMPLE CALCULATOR =====");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("👋 Calculator Closed");
                break;
            }

            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            double result = 0;

            switch (choice) {

                case 1:
                    result = add(num1, num2);
                    System.out.println("Result = " + result);
                    break;

                case 2:
                    result = subtract(num1, num2);
                    System.out.println("Result = " + result);
                    break;

                case 3:
                    result = multiply(num1, num2);
                    System.out.println("Result = " + result);
                    break;

                case 4:
                    result = divide(num1, num2);
                    System.out.println("Result = " + result);
                    break;

                default:
                    System.out.println("❌ Invalid choice!");
            }
        }

        sc.close();
    }
}