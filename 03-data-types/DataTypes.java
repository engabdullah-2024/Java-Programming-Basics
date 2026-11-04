// Lesson 3: Data types
// Run:  javac DataTypes.java   then   java DataTypes

public class DataTypes {
    public static void main(String[] args) {

        // ===== The 4 you will use most =====
        int age = 21;                 // whole number
        double gpa = 3.75;            // decimal number
        boolean isStudent = true;     // true / false
        char grade = 'A';             // one character, single quotes

        // ===== String (text, double quotes) =====
        String name = "Abdalla Ali";
        String phone = "615000001";   // phone numbers are text, not math

        // ===== The other primitive types =====
        long worldPopulation = 8_000_000_000L;  // big whole number, ends with L
        float temperature = 36.6f;              // smaller decimal, ends with f
        byte smallNumber = 100;                 // -128 .. 127
        short year = 2026;                      // -32,768 .. 32,767

        System.out.println("===== Student Card =====");
        System.out.println("Name:       " + name);
        System.out.println("Phone:      " + phone);
        System.out.println("Age:        " + age);
        System.out.println("GPA:        " + gpa);
        System.out.println("Grade:      " + grade);
        System.out.println("Is student: " + isStudent);

        System.out.println("\n===== Other types =====");
        System.out.println("long:  " + worldPopulation);
        System.out.println("float: " + temperature);
        System.out.println("byte:  " + smallNumber);
        System.out.println("short: " + year);

        // ===== Min and max values =====
        System.out.println("\nBiggest int:  " + Integer.MAX_VALUE);
        System.out.println("Smallest int: " + Integer.MIN_VALUE);
    }
}
