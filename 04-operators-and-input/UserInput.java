// Lesson 4: Reading user input with Scanner
// Run:  javac UserInput.java   then   java UserInput

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Magacaaga? (Your name): ");
        String name = input.nextLine();

        System.out.print("Da'daada? (Your age): ");
        int age = input.nextInt();

        System.out.print("Lacagta USD? (Amount in USD): ");
        double usd = input.nextDouble();

        // ===== Use the input =====
        final double RATE = 26000;      // 1 USD = 26,000 SOS (example rate)
        double shillings = usd * RATE;
        int birthYear = 2026 - age;

        System.out.println("\nSalaan, " + name + "!");
        System.out.println("You were born around " + birthYear + ".");
        System.out.printf("$%.2f = %,.0f Somali Shillings%n", usd, shillings);

        input.close();
    }
}
