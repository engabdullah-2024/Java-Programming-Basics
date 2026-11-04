// Lesson 3: Strings, type casting and division
// Run:  javac StringsAndCasting.java   then   java StringsAndCasting

public class StringsAndCasting {
    public static void main(String[] args) {

        // ===== String tools =====
        String city = "Muqdisho";
        System.out.println("City:        " + city);
        System.out.println("Length:      " + city.length());
        System.out.println("Uppercase:   " + city.toUpperCase());
        System.out.println("Lowercase:   " + city.toLowerCase());
        System.out.println("First char:  " + city.charAt(0));
        System.out.println("Starts 'Muq': " + city.startsWith("Muq"));

        // Compare Strings with .equals(), not ==
        String input = "muqdisho";
        System.out.println("equals:            " + city.equals(input));            // false
        System.out.println("equalsIgnoreCase:  " + city.equalsIgnoreCase(input));  // true

        // ===== char vs String =====
        char letter = 'A';     // one character
        String word = "A";     // text
        System.out.println("\nchar: " + letter + "   String: " + word);

        // ===== Widening (automatic) =====
        int whole = 10;
        double asDecimal = whole;
        System.out.println("\nint 10 -> double: " + asDecimal);

        // ===== Narrowing (needs a cast) =====
        double price = 9.99;
        int cut = (int) price;
        System.out.println("double 9.99 -> int: " + cut);

        // ===== Division trap =====
        System.out.println("\n7 / 2          = " + (7 / 2));
        System.out.println("7.0 / 2        = " + (7.0 / 2));
        System.out.println("(double) 7 / 2 = " + ((double) 7 / 2));

        // ===== Formatting money =====
        double balance = 1000;
        System.out.printf("%nBalance: $%.2f%n", balance);   // $1000.00
    }
}
