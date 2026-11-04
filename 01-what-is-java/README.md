# Lesson 1: What is Java?

## What is Java?

**Java** is a programming language you use to give instructions to a computer. It was created in 1995 and is still one of the most used languages in the world. It runs:

- Android apps
- Bank and mobile-money systems
- University and company back-end servers
- Desktop programs and games (for example, Minecraft)

Java's motto is **"Write once, run anywhere."** You write your code once, and it runs on Windows, Mac or Linux without changes.

## How Java works

```
 HelloWorld.java   ──javac──►   HelloWorld.class   ──java──►   Output on screen
 (your code)       (compiler)   (bytecode)          (JVM)
```

1. You write code in a file ending in **`.java`**.
2. The **compiler** (`javac`) checks the code for mistakes and turns it into **bytecode** (a `.class` file).
3. The **JVM** (Java Virtual Machine) runs the bytecode on any computer.

| Word | Meaning |
|---|---|
| **JDK** | Java Development Kit: the tools to *write* Java (includes `javac`) |
| **JRE / JVM** | What *runs* Java programs |
| **Compile** | Turn `.java` code into `.class` bytecode |
| **Bytecode** | The in-between code the JVM understands |

## Your first program

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

What each part means:

| Code | Meaning |
|---|---|
| `public class HelloWorld` | Every Java program lives inside a **class**. The name must match the file name (`HelloWorld.java`). |
| `public static void main(String[] args)` | The **main method**, where the program starts. Write it exactly like this for now. |
| `System.out.println("...")` | Prints text and moves to a new line. |
| `{ }` | Curly braces open and close a block of code. |
| `;` | Every statement ends with a semicolon. |

## `println` vs `print`

```java
System.out.print("Hello ");     // stays on the same line
System.out.println("World");    // prints, then goes to a new line
```

## Comments

Comments are notes for humans. Java ignores them.

```java
// This is a one-line comment

/* This is a
   multi-line comment */
```

## How to run

Open a terminal in this folder:

```
javac HelloWorld.java
java HelloWorld
```

## Common beginner mistakes

| Mistake | Error you will see |
|---|---|
| File name doesn't match the class name | `class HelloWorld is public, should be declared in a file named HelloWorld.java` |
| Forgot `;` | `';' expected` |
| Wrote `system.out.println` (small s) | `package system does not exist`, because Java is **case-sensitive** |
| Missing `}` | `reached end of file while parsing` |

## Files in this lesson

- [`HelloWorld.java`](HelloWorld.java): the classic first program
- [`AboutMe.java`](AboutMe.java): prints a few lines about yourself

## Practice

1. Change `AboutMe.java` to print your name, university and favorite food.
2. Use `print` twice and `println` once, and see how the lines join.
3. Remove a `;` on purpose, compile, and read the error message.
