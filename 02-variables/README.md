# Lesson 2: Variables

## What is a variable?

A **variable** is a named box that stores a value in memory. You give it a **type**, a **name** and a **value**:

```
type   name   =  value;
int    age    =  21;
```

```java
String name = "Abdalla";
int age = 21;
double balance = 150.50;
```

## Declare, assign, change

```java
int score;          // 1. declare (create the box)
score = 80;         // 2. assign (put a value in)
score = 95;         // 3. change (replace the value)

int level = 1;      // declare + assign in one line
```

When you change a variable, **don't** write the type again. The variable already exists.

## Java vs JavaScript

```js
let x = 5;
x = "hello";   // JS: fine
```

```java
int x = 5;
x = "hello";   // Java: compile error, incompatible types
```

Java is **statically typed**: once a variable is `int`, it can only hold whole numbers.

## Naming rules

| Rule | ✅ Good | ❌ Bad |
|---|---|---|
| Start with a letter, `_` or `$` | `age`, `_count` | `2name` |
| No spaces | `firstName` | `first name` |
| No Java keywords | `myClass` | `class`, `int` |
| Case-sensitive | `age` ≠ `Age` | |

**Convention:** use **camelCase**, like `firstName`, `totalPrice` and `isLoggedIn`.

## Constants: `final`

A constant is a variable that can **never** change. Use `final` and UPPER_CASE names:

```java
final double PI = 3.14159;
final int MAX_ATTEMPTS = 3;

PI = 3;   // error: cannot assign a value to final variable PI
```

## Joining text with `+`

```java
String name = "Hodan";
int age = 20;
System.out.println("Name: " + name + ", Age: " + age);
// Name: Hodan, Age: 20
```

## Rule: give a value before using it

```java
int score;
System.out.println(score);   // error: variable score might not have been initialized
```

## Updating with shortcuts

```java
int count = 10;
count = count + 5;   // 15
count += 5;          // 20 (same idea, shorter)
count++;             // 21 (add 1)
count--;             // 20 (subtract 1)
```

## Files in this lesson

- [`Variables.java`](Variables.java): declare, assign, change, constants
- [`Product.java`](Product.java): a shop item stored in variables
- [`Varibles.java`](Varibles.java): lesson notes (comments only)

## Practice

1. Make variables for a student: `name`, `age`, `gpa`, `city`, and print them all.
2. Make a `final` variable `TAX_RATE = 0.05` and calculate the tax on a $20 item.
3. Make a `balance` variable of `100`, add `50`, subtract `30`, and print it after each step.
