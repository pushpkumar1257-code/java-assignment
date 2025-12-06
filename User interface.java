// UserInterface.java
// Handles user input and controls the Calculator operations
// Author: [Your Name]
// Date: 25th September 2025

import java.util.Scanner;

public class UserInterface {

    private Scanner sc = new Scanner(System.in);
    private Calculator calc = new Calculator();

    // Method for performing addition
    public void performAddition() {
        System.out.println("\nSelect addition type:");
        System.out.println("1. Add two integers");
        System.out.println("2. Add two doubles");
        System.out.println("3. Add three integers");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1 -> {
                System.out.print("Enter first integer: ");
                int a = sc.nextInt();
                System.out.print("Enter second integer: ");
                int b = sc.nextInt();
                System.out.println("Result: " + calc.add(a, b));
            }
            case 2 -> {
                System.out.print("Enter first double: ");
                double x = sc.nextDouble();
                System.out.print("Enter second double: ");
                double y = sc.nextDouble();
                System.out.println("Result: " + calc.add(x, y));
            }
            case 3 -> {
                System.out.print("Enter three integers: ");
                int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
                System.out.println("Result: " + calc.add(a, b, c));
            }
            default -> System.out.println("Invalid choice!");
        }
    }

    // Method for subtraction
    public void performSubtraction() {
        System.out.print("Enter first integer: ");
        int a = sc.nextInt();
        System.out.print("Enter second integer: ");
        int b = sc.nextInt();
        System.out.println("Result: " + calc.subtract(a, b));
    }

    // Method for multiplication
    public void performMultiplication() {
        System.out.print("Enter first double: ");
        double a = sc.nextDouble();
        System.out.print("Enter second double: ");
        double b = sc.nextDouble();
        System.out.println("Result: " + calc.multiply(a, b));
    }

    // Method for division
    public void performDivision() {
        System.out.print("Enter dividend (integer): ");
        int a = sc.nextInt();
        System.out.print("Enter divisor (integer): ");
        int b = sc.nextInt();
        System.out.println("Result: " + calc.divide(a, b));
    }

    // Menu to navigate options
    public void mainMenu() {
        int choice;
        do {
            System.out.println("\n=== Calculator Application ===");
            System.out.println("1. Add Numbers");
            System.out.println("2. Subtract Numbers");
            System.out.println("3. Multiply Numbers");
            System.out.println("4. Divide Numbers");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> performAddition();
                case 2 -> performSubtraction();
                case 3 -> performMultiplication();
                case 4 -> performDivision();
                case 5 -> System.out.println("Exiting Calculator... Thank you!");
                default -> System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 5);
    }

    // Main method
    public static void main(String[] args) {
        UserInterface ui = new UserInterface();
        ui.mainMenu();
    }
}
