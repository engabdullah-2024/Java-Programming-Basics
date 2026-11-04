// Lesson 6: All the loops
// Run:  javac Loops.java   then   java Loops

public class Loops {
    public static void main(String[] args) {

        // ===== for: count 1 to 5 =====
        System.out.println("===== for =====");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number " + i);
        }

        // ===== for: sum 1..10 =====
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum 1..10 = " + sum);

        // ===== while: spend until the money runs out =====
        System.out.println("\n===== while =====");
        double balance = 100;
        int days = 0;
        while (balance >= 30) {
            balance -= 30;
            days++;
            System.out.println("Day " + days + ": spent $30, left $" + balance);
        }

        // ===== do-while: runs at least once =====
        System.out.println("\n===== do-while =====");
        int count = 10;
        do {
            System.out.println("This runs once even though count is " + count);
            count++;
        } while (count < 5);

        // ===== break and continue =====
        System.out.println("\n===== break & continue =====");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;   // skip 5
            }
            if (i == 8) {
                break;      // stop at 8
            }
            System.out.print(i + " ");
        }
        System.out.println();

        // ===== Nested loops: star triangle =====
        System.out.println("\n===== nested =====");
        for (int row = 1; row <= 4; row++) {
            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // ===== Loop over a String =====
        System.out.println("\n===== loop over a String =====");
        String phone = "61a500001";
        boolean allDigits = true;
        for (int i = 0; i < phone.length(); i++) {
            char c = phone.charAt(i);
            if (c < '0' || c > '9') {
                allDigits = false;
                System.out.println("Not a digit at position " + i + ": " + c);
            }
        }
        System.out.println(phone + " all digits? " + allDigits);
    }
}
