# Lesson 6: Loops

## What is a loop?

A **loop** repeats code **many times** without you writing it again and again. Printing 1 to 100 takes one loop instead of 100 `println` lines.

## `for` loop: when you know how many times

```java
for (int i = 1; i <= 5; i++) {
    System.out.println("Number " + i);
}
```

```
for ( start ; condition ; update )
      int i=1   i <= 5      i++
```

1. **start**: runs once at the beginning
2. **condition**: checked before every round; the loop stops when it's `false`
3. **update**: runs after every round

## `while` loop: repeat while something is true

Use it when you **don't know** how many times the loop will run.

```java
int balance = 100;
while (balance > 0) {
    balance -= 30;
    System.out.println("Balance: " + balance);
}
```

## `do ... while`: runs at least once

The condition is checked **after** the body, so the code always runs at least one time. It's perfect for menus.

```java
int choice;
do {
    System.out.println("1. Play  0. Exit");
    choice = input.nextInt();
} while (choice != 0);
```

## `break` and `continue`

```java
for (int i = 1; i <= 10; i++) {
    if (i == 5) continue;   // skip 5, go to the next round
    if (i == 8) break;      // stop the loop completely
    System.out.println(i);
}
// prints 1 2 3 4 6 7
```

## Nested loops (a loop inside a loop)

```java
for (int row = 1; row <= 3; row++) {
    for (int col = 1; col <= 3; col++) {
        System.out.print(row * col + "\t");
    }
    System.out.println();
}
```

## Loop over a String

```java
String phone = "615000001";
for (int i = 0; i < phone.length(); i++) {
    char c = phone.charAt(i);
    System.out.println(c);
}
```

## ⚠️ Infinite loops

If the condition never becomes `false`, the loop runs forever:

```java
int i = 1;
while (i <= 5) {
    System.out.println(i);
    // forgot i++  → runs forever! Press Ctrl + C to stop.
}
```

## Which loop should I use?

| Situation | Loop |
|---|---|
| Known number of times (1 to 10, 3 PIN tries) | `for` |
| Unknown, keep going while something is true | `while` |
| Must run at least once (menus) | `do ... while` |

## Files in this lesson

- [`Loops.java`](Loops.java): for, while, do-while, break, continue, nested
- [`MultiplicationTable.java`](MultiplicationTable.java): times table for any number
- [`PinAttempts.java`](PinAttempts.java): 3 PIN tries with a `for` loop
- [`GuessNumber.java`](GuessNumber.java): number guessing game with `while`

## Practice

1. Print all even numbers from 2 to 50.
2. Ask for a number `n` and print the sum `1 + 2 + ... + n`.
3. Keep asking for numbers until the user types `0`, then print the total.
4. Print this triangle with nested loops:
   ```
   *
   **
   ***
   ****
   ```
