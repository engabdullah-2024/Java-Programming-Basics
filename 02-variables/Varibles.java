// Lesson 2: Variables and Data Types
// 1. The big difference from JS

// In JavaScript a variable can hold anything, and its type can change:

// js
// let x = 5;
// x = "hello";   // fine in JS

// Java is statically typed. You declare the type once, and the variable can only ever hold that type:

// java
// int x = 5;
// x = "hello";   // ❌ compile error: incompatible types

// The pattern for declaring a variable is:

// type  name  =  value;
// int   age   =  21;
// 2. The 8 primitive types

// These are Java’s built-in basic types:

// Type	Holds	Example
// int	whole numbers (the one you’ll use most)	int age = 21;
// long	very large whole numbers; needs L at the end	long population = 8_000_000_000L;
// double	decimals (the default choice)	double gpa = 3.75;
// float	smaller decimals; needs f at the end	float temp = 36.6f;
// boolean	true or false	boolean isStudent = true;
// char	one character, in single quotes	char grade = 'A';
// byte	small numbers, -128 to 127	byte b = 100;
// short	numbers from -32,768 to 32,767	short s = 3000;

// For now, focus on int, double, boolean, and char. The others are for special cases.

// You can write underscores between digits to make big numbers readable, like 1_000_000.

// 3. String, which is not a primitive

// Text uses String with a capital S and double quotes:

// java
// String name = "Abdalla";
// 'A' is a char: one character, single quotes.
// "A" is a String: text, double quotes.

// Mixing these up is a classic beginner error.

// 4. Example program

// Student.java:

// java
// public class Student {
//     public static void main(String[] args) {
//         String name = "Abdalla";
//         int age = 21;
//         double gpa = 3.75;
//         char grade = 'A';
//         boolean isEnrolled = true;

//         System.out.println("Name: " + name);
//         System.out.println("Age: " + age);
//         System.out.println("GPA: " + gpa);
//         System.out.println("Grade: " + grade);
//         System.out.println("Enrolled: " + isEnrolled);

//         age = 22;                      // changing a value
//         System.out.println("Next year: " + age);
//     }
// }

// Output:

// Name: Abdalla
// Age: 21
// GPA: 3.75
// Grade: A
// Enrolled: true
// Next year: 22

// Why: + joins text, just like in JS. age = 22; gives the variable a new value. You don’t write the type again, because the variable already exists.

// 5. Constants, Java’s const

// Use final for a value that must never change:

// java
// final double PI = 3.14159;
// PI = 3;   // ❌ error: cannot assign a value to final variable PI

// By convention, constant names are written in UPPER_CASE.

// 6. Two rules that catch beginners
// A local variable must have a value before you use it.
// java
//    int score;
//    System.out.println(score);  // ❌ error: variable score might not have been initialized

// In JS this would print undefined. Java refuses to compile.

// Integer division drops the decimal part.
// java
//    System.out.println(7 / 2);    // 3, not 3.5
//    System.out.println(7.0 / 2);  // 3.5

// When both numbers are int, the result is an int. If one of them is a double, you get the decimal.