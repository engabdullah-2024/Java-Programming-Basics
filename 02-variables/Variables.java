// Lesson 2: Variables
// Run:  javac Variables.java   then   java Variables

public class Variables {
    public static void main(String[] args) {

        // ===== 1. Declare + assign =====
        String name = "Abdalla";
        int age = 21;
        double balance = 150.50;
        String city = "Muqdisho";

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Balance: $" + balance);
        System.out.println("City: " + city);

        // ===== 2. Declare first, assign later =====
        int score;
        score = 80;
        System.out.println("\nScore: " + score);

        // ===== 3. Change a value (no type the second time) =====
        score = 95;
        System.out.println("New score: " + score);

        // ===== 4. Shortcuts =====
        int count = 10;
        count = count + 5;   // 15
        count += 5;          // 20
        count++;             // 21
        count--;             // 20
        System.out.println("\nCount: " + count);

        // ===== 5. Constants =====
        final double TAX_RATE = 0.05;
        final int MAX_ATTEMPTS = 3;
        // TAX_RATE = 0.10;   // <- remove the // and compile: you get an error

        double price = 20.00;
        double tax = price * TAX_RATE;
        System.out.println("\nPrice: $" + price + "  Tax: $" + tax + "  Total: $" + (price + tax));
        System.out.println("PIN attempts allowed: " + MAX_ATTEMPTS);

        // ===== 6. Joining text =====
        String greeting = "Salaan, " + name + "! You are " + age + " years old.";
        System.out.println("\n" + greeting);
    }
}
