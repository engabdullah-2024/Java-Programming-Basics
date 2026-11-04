# Lesson 5: Conditions

## What is a condition?

A **condition** lets your program **make decisions**: do one thing *if* something is true and something else if it's not. Every condition is a `boolean` expression (`true` or `false`).

## `if`

```java
if (balance >= 10) {
    System.out.println("You can buy it!");
}
```

## `if ... else`

```java
if (pin == 1234) {
    System.out.println("Welcome");
} else {
    System.out.println("Wrong PIN");
}
```

## `if ... else if ... else`

Java checks the conditions **from top to bottom** and runs only the **first** one that's true.

```java
if (marks >= 90) {
    grade = 'A';
} else if (marks >= 80) {
    grade = 'B';
} else if (marks >= 70) {
    grade = 'C';
} else {
    grade = 'F';
}
```

## Combining conditions

```java
if (amount > 0 && amount <= balance) { ... }       // AND
if (choice == 1 || choice == 2) { ... }            // OR
if (!isLocked) { ... }                              // NOT
```

## Nested `if` (an `if` inside an `if`)

```java
if (isLoggedIn) {
    if (amount <= balance) {
        System.out.println("Sent!");
    } else {
        System.out.println("Not enough money");
    }
}
```

## `switch`: many choices for one value

Great for **menus**:

```java
switch (choice) {
    case 1:
        System.out.println("Check balance");
        break;
    case 2:
        System.out.println("Send money");
        break;
    default:
        System.out.println("Invalid option");
}
```

> ⚠️ Don't forget `break;`. Without it, Java keeps running into the next `case` ("fall-through").

## Ternary operator (short `if`)

```java
String result = (marks >= 50) ? "Gudbay (Pass)" : "Dhacay (Fail)";
```

## Comparing Strings

```java
if (code.equals("*770#")) { ... }    // ✅ correct
if (code == "*770#") { ... }         // ❌ wrong for Strings
```

## Files in this lesson

- [`Conditions.java`](Conditions.java): if / else if / else / nested / ternary
- [`SwitchMenu.java`](SwitchMenu.java): a menu with `switch`
- [`Grades.java`](Grades.java): student grade calculator (with input)
- [`Order.java`](Order.java): free delivery check

## Practice

1. Ask for a number and print whether it's **positive, negative or zero**.
2. Ask for a number and print **even** or **odd**.
3. Ask for an age: under 13 is "Child", 13–17 is "Teen", 18 and over is "Adult".
4. Make a `switch` menu for a restaurant: 1. Bariis, 2. Baasto, 3. Shaah. Print the price of the choice.
