// Lesson 6: 3 PIN attempts with a for loop (like a bank / EVCPlus)
// Run:  javac PinAttempts.java   then   java PinAttempts      (PIN: 1234)

import java.util.Scanner;

public class PinAttempts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int PIN = 1234;
        final int MAX_ATTEMPTS = 3;
        boolean isLoggedIn = false;

        for (int attempt = 1; attempt <= MAX_ATTEMPTS; attempt++) {
            System.out.print("Geli PIN-kaaga (Enter PIN): ");
            int entered = input.nextInt();

            if (entered == PIN) {
                isLoggedIn = true;
                break;                       // correct: leave the loop early
            }

            int left = MAX_ATTEMPTS - attempt;
            if (left > 0) {
                System.out.println("PIN khaldan. Tries left: " + left);
            }
        }

        if (isLoggedIn) {
            System.out.println("Ku soo dhawoow! (Welcome)");
        } else {
            System.out.println("Account locked. Call 300.");
        }

        input.close();
    }
}
