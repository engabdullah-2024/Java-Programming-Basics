// Lesson 6: Number guessing game (Qiyaas lambarka)
// Run:  javac GuessNumber.java   then   java GuessNumber

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int secret = (int) (Math.random() * 100) + 1;   // random 1..100
        int guess = 0;
        int tries = 0;

        System.out.println("I'm thinking of a number from 1 to 100. Guess it!");

        while (guess != secret) {
            System.out.print("Your guess: ");
            guess = input.nextInt();
            tries++;

            if (guess < secret) {
                System.out.println("Higher!");
            } else if (guess > secret) {
                System.out.println("Lower!");
            } else {
                System.out.println("Correct! You got it in " + tries + " tries.");
            }
        }

        input.close();
    }
}
