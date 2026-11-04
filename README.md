# Java Basics ☕

A beginner Java course, step by step, from "What is Java?" to loops, with explanations, runnable code and practice exercises in every lesson. It ends with a real-world project: an **EVC Plus mobile-money simulator**.

## Lessons

| # | Lesson | You will learn |
|---|---|---|
| 01 | [What is Java?](01-what-is-java/) | How Java works (JDK, JVM, bytecode), your first program, `println`, comments |
| 02 | [Variables](02-variables/) | Declaring, assigning and changing variables, naming rules, `final` constants |
| 03 | [Data Types](03-data-types/) | `int`, `double`, `boolean`, `char`, `String`, the 8 primitives, casting, the division trap |
| 04 | [Operators & Input](04-operators-and-input/) | Arithmetic, comparison and logical operators; reading input with `Scanner` |
| 05 | [Conditions](05-conditions/) | `if`, `else if`, `else`, nested `if`, `switch`, ternary |
| 06 | [Loops](06-loops/) | `for`, `while`, `do-while`, `break`, `continue`, nested loops |
| 🚀 | [Project: EVCPlus](projects/evcplus/) | A full `*770#` mobile-money menu using everything above |

Each lesson folder has:
- **`README.md`**: the explanation, with examples
- **`.java` files**: code you can run
- **Practice**: exercises at the end of the README

## How to run any program

You need the **JDK** installed. Check with:

```
java -version
```

Then, inside a lesson folder:

```
javac FileName.java
java FileName
```

Example:

```
cd 01-what-is-java
javac HelloWorld.java
java HelloWorld
```

## Course structure

```
Java-Basics/
├── 01-what-is-java/
├── 02-variables/
├── 03-data-types/
├── 04-operators-and-input/
├── 05-conditions/
├── 06-loops/
└── projects/
    └── evcplus/
```

## Author

**Abdalla Ali**, Software Engineering student, learning Java 🇸🇴
