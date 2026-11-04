// Lesson 5: if / else if / else
// Run:  javac Conditions.java   then   java Conditions

public class Conditions {
    public static void main(String[] args) {

        // ===== if =====
        double balance = 25.00;
        double price = 10.00;
        if (balance >= price) {
            System.out.println("You can buy it!");
        }

        // ===== if ... else =====
        int pin = 1234;
        int enteredPin = 1111;
        if (enteredPin == pin) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Wrong PIN");
        }

        // ===== if ... else if ... else =====
        int marks = 84;
        char grade;
        if (marks >= 90) {
            grade = 'A';
        } else if (marks >= 80) {
            grade = 'B';
        } else if (marks >= 70) {
            grade = 'C';
        } else if (marks >= 50) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Marks: " + marks + " -> Grade: " + grade);

        // ===== Combining with && and || =====
        double amount = 30.00;
        if (amount > 0 && amount <= balance) {
            System.out.println("Transfer OK");
        } else {
            System.out.println("Transfer not allowed: amount must be > 0 and <= balance");
        }

        int day = 6;   // 1 = Monday ... 7 = Sunday
        if (day == 6 || day == 7) {
            System.out.println("Weekend!");
        }

        // ===== Nested if =====
        boolean isLoggedIn = true;
        if (isLoggedIn) {
            if (balance > 20) {
                System.out.println("Rich today!");
            } else {
                System.out.println("Save your money");
            }
        }

        // ===== Ternary =====
        String result = (marks >= 50) ? "Gudbay (Pass)" : "Dhacay (Fail)";
        System.out.println("Result: " + result);

        // ===== Strings: use .equals =====
        String code = "*770#";
        if (code.equals("*770#")) {
            System.out.println("Opening EVCPlus menu...");
        }
    }
}
