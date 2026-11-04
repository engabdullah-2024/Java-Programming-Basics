// Lesson 5: Student grade calculator (Natiijada Ardayda)
// Run:  javac Grades.java   then   java Grades

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Student name: ");
        String name = input.nextLine();

        System.out.print("Java marks (0-100): ");
        double java = input.nextDouble();
        System.out.print("Math marks (0-100): ");
        double math = input.nextDouble();
        System.out.print("English marks (0-100): ");
        double english = input.nextDouble();

        // ===== Validate input =====
        if (java < 0 || java > 100 || math < 0 || math > 100 || english < 0 || english > 100) {
            System.out.println("Marks must be between 0 and 100.");
            input.close();
            return;
        }

        double average = (java + math + english) / 3;

        // ===== Decide the grade =====
        char grade;
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'C';
        } else if (average >= 50) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        String status = (grade == 'F') ? "Dhacay (Failed)" : "Gudbay (Passed)";

        System.out.println("\n===== Natiijada =====");
        System.out.println("Name:    " + name);
        System.out.printf("Average: %.1f%n", average);
        System.out.println("Grade:   " + grade);
        System.out.println("Status:  " + status);

        input.close();
    }
}
