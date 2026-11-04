// Lesson 4: Operators
// Run:  javac Operators.java   then   java Operators

public class Operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        // ===== Arithmetic =====
        System.out.println("===== Arithmetic (a=10, b=3) =====");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b) + "   (int division)");
        System.out.println("a % b = " + (a % b) + "   (remainder)");

        // ===== Assignment =====
        System.out.println("\n===== Assignment =====");
        int x = 10;
        x += 5;  System.out.println("x += 5  -> " + x);
        x -= 3;  System.out.println("x -= 3  -> " + x);
        x *= 2;  System.out.println("x *= 2  -> " + x);
        x /= 4;  System.out.println("x /= 4  -> " + x);
        x++;     System.out.println("x++     -> " + x);
        x--;     System.out.println("x--     -> " + x);

        // ===== Comparison =====
        System.out.println("\n===== Comparison =====");
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b  : " + (a > b));
        System.out.println("a <= b : " + (a <= b));

        // ===== Logical =====
        System.out.println("\n===== Logical =====");
        int age = 20;
        boolean hasId = true;
        boolean isLocked = false;
        System.out.println("age >= 18 && hasId : " + (age >= 18 && hasId));
        System.out.println("age < 18 || hasId  : " + (age < 18 || hasId));
        System.out.println("!isLocked          : " + (!isLocked));

        // ===== Even or odd with % =====
        int number = 7;
        System.out.println("\n7 % 2 == 0 (is 7 even?) : " + (number % 2 == 0));
    }
}
