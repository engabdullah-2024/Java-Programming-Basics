// Lesson 6: Multiplication table (Jadwalka isku dhufashada)
// Run:  javac MultiplicationTable.java   then   java MultiplicationTable

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = input.nextInt();

        System.out.println("\n===== Table of " + n + " =====");
        for (int i = 1; i <= 12; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }

        // Full 1-5 grid with nested loops
        System.out.println("\n===== 1 to 5 grid =====");
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5; col++) {
                System.out.print(row * col + "\t");
            }
            System.out.println();
        }

        input.close();
    }
}
