// Lesson 5: switch menu
// Run:  javac SwitchMenu.java   then   java SwitchMenu

import java.util.Scanner;

public class SwitchMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===== Maqaayad (Restaurant) =====");
        System.out.println("1. Bariis  - $3.00");
        System.out.println("2. Baasto  - $2.50");
        System.out.println("3. Suqaar  - $4.00");
        System.out.println("4. Shaah   - $0.50");
        System.out.print("Dooro (Choose): ");
        int choice = input.nextInt();

        String food = "";
        double price = 0;

        switch (choice) {
            case 1:
                food = "Bariis";
                price = 3.00;
                break;
            case 2:
                food = "Baasto";
                price = 2.50;
                break;
            case 3:
                food = "Suqaar";
                price = 4.00;
                break;
            case 4:
                food = "Shaah";
                price = 0.50;
                break;
            default:
                System.out.println("Doorasho khaldan (Invalid choice)");
        }

        if (price > 0) {
            System.out.print("How many? ");
            int quantity = input.nextInt();
            double total = price * quantity;
            System.out.printf("%d x %s = $%.2f%n", quantity, food, total);
        }

        input.close();
    }
}
