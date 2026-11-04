# Lesson 3: Data Types

## What is a data type?

A **data type** tells Java **what kind of value** a variable holds: a whole number, a decimal, text, true/false and so on. Java needs it to know how much memory to use and what you're allowed to do with the value.

## The 8 primitive types

| Type | Holds | Example | Size |
|---|---|---|---|
| `int` | whole numbers (**most used**) | `int age = 21;` | 4 bytes |
| `double` | decimals (**most used**) | `double gpa = 3.75;` | 8 bytes |
| `boolean` | `true` or `false` | `boolean isStudent = true;` | 1 bit |
| `char` | one character, **single quotes** | `char grade = 'A';` | 2 bytes |
| `long` | very big whole numbers, add `L` | `long people = 8_000_000_000L;` | 8 bytes |
| `float` | smaller decimals, add `f` | `float temp = 36.6f;` | 4 bytes |
| `byte` | -128 to 127 | `byte b = 100;` | 1 byte |
| `short` | -32,768 to 32,767 | `short s = 3000;` | 2 bytes |

👉 For now, focus on **`int`, `double`, `boolean`, `char`** and **`String`**.

You can put `_` in big numbers to make them easier to read: `1_000_000`.

## `String` (text)

`String` is **not** a primitive. It's a class, which is why it has a capital **S**. It uses **double quotes**.

```java
String name = "Abdalla";
```

| | Type | Quotes |
|---|---|---|
| `'A'` | `char`: one character | single `' '` |
| `"A"` | `String`: text | double `" "` |

### Useful String tools

```java
String city = "Muqdisho";
city.length()          // 8
city.toUpperCase()     // "MUQDISHO"
city.charAt(0)         // 'M'
city.equals("Muqdisho")// true  ← compare Strings with .equals, NOT ==
city.startsWith("Muq") // true
```

## Type casting (changing types)

**Widening** (small → big) happens automatically:

```java
int a = 10;
double b = a;        // 10.0
```

**Narrowing** (big → small) needs a cast `(type)`, and you lose the decimals:

```java
double price = 9.99;
int whole = (int) price;   // 9
```

## Integer division trap

```java
System.out.println(7 / 2);     // 3 (both int, so the decimal is dropped)
System.out.println(7.0 / 2);   // 3.5
System.out.println((double) 7 / 2); // 3.5
```

## Default choice guide

| You want to store… | Use |
|---|---|
| Age, count, quantity | `int` |
| Money, GPA, temperature | `double` |
| Yes/no, on/off | `boolean` |
| One letter like a grade | `char` |
| Names, messages, phone numbers | `String` |

> A phone number like `615000001` is stored as a **String**, because you never do math with it and it can start with 0.

## Files in this lesson

- [`DataTypes.java`](DataTypes.java): every type in action
- [`StringsAndCasting.java`](StringsAndCasting.java): String tools, casting, division

## Practice

1. Make one variable of each of the 8 primitive types and print them.
2. Store `"Somalia"` in a String and print its length, uppercase and first letter.
3. Convert `double gpa = 3.85` to an `int` and print both.
4. Print `10 / 4` and `10.0 / 4`, and explain the difference.
