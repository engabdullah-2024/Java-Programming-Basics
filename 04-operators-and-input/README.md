# Lesson 4: Operators and User Input

## Arithmetic operators

| Operator | Meaning | Example | Result |
|---|---|---|---|
| `+` | add | `10 + 3` | `13` |
| `-` | subtract | `10 - 3` | `7` |
| `*` | multiply | `10 * 3` | `30` |
| `/` | divide | `10 / 3` | `3` (int division!) |
| `%` | remainder (modulo) | `10 % 3` | `1` |

`%` is useful for checking even/odd: `n % 2 == 0` means `n` is even.

## Assignment operators

```java
x += 5;   // x = x + 5
x -= 5;   // x = x - 5
x *= 2;   // x = x * 2
x /= 2;   // x = x / 2
x++;      // x = x + 1
x--;      // x = x - 1
```

## Comparison operators (the answer is always `true` or `false`)

| Operator | Meaning |
|---|---|
| `==` | equal to |
| `!=` | not equal to |
| `>` / `<` | greater / less than |
| `>=` / `<=` | greater or equal / less or equal |

> For **Strings**, use `.equals()` instead of `==`.

## Logical operators

| Operator | Meaning | Example |
|---|---|---|
| `&&` | AND: both must be true | `age >= 18 && hasId` |
| `\|\|` | OR: at least one true | `day == 6 \|\| day == 7` |
| `!` | NOT: flips true/false | `!isLocked` |

## Getting input from the user: `Scanner`

```java
import java.util.Scanner;          // 1. import at the top

Scanner input = new Scanner(System.in);   // 2. create it

String name = input.nextLine();    // a whole line of text
int age = input.nextInt();         // a whole number
double price = input.nextDouble(); // a decimal
String word = input.next();        // one word (stops at space)

input.close();                     // 3. close when done
```

### ⚠️ The `nextInt()` + `nextLine()` trap

`nextInt()` leaves the **Enter** key in the input, so the next `nextLine()` reads an empty line. Fix it by adding an extra `input.nextLine();` after `nextInt()`.

## Files in this lesson

- [`Operators.java`](Operators.java): all the operators with results
- [`UserInput.java`](UserInput.java): ask the user questions with `Scanner`

## Practice

1. Ask for two numbers and print their sum, difference, product, quotient and remainder.
2. Ask for an amount in USD and convert it to Somali Shillings (rate: `1 USD = 26000 SOS`).
3. Ask for the user's birth year and print their age.
