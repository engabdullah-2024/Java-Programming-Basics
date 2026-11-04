# CLAUDE.md

Java practice folder for a beginner Software Engineering student (Abdalla). The student already knows some JavaScript and is learning Java step by step.

## Teaching level (important)

- The student has learned: **variables, data types, conditions (if/else, switch), loops (for, while)**.
- The Java programs must only use those basics. Everything goes inside `main`, with `Scanner` for input.
- **Do not use** classes or objects (other than `main`), methods, arrays, `List`, `Map`, records, streams or lambdas, unless the student asks for them.
- Comment each section (`// ===== VARIABLES =====`, `// ===== LOOP =====`) so the student can see which concept is being used.
- Explain things simply and briefly. The student writes informal English, and Somali is fine too.

## Repo layout

GitHub: https://github.com/engabdullah-2024/Java-Programming-Basics (branch `main`). This is a public beginner course.

```
01-what-is-java/         HelloWorld.java, AboutMe.java
02-variables/            Variables.java, Product.java, Varibles.java (notes only; keep the misspelled name)
03-data-types/           DataTypes.java, StringsAndCasting.java
04-operators-and-input/  Operators.java, UserInput.java
05-conditions/           Conditions.java, SwitchMenu.java, Grades.java, Order.java
06-loops/                Loops.java, MultiplicationTable.java, PinAttempts.java, GuessNumber.java
projects/evcplus/        EvcPlus.java, EvcPlus.html
```

- Every lesson folder has a `README.md` with: what it is, an explanation with code, a "Files in this lesson" list, and "Practice" exercises.
- New lessons continue the numbering (`07-...`), and the table in the root `README.md` must be updated.
- A lesson may only use concepts from earlier lessons.
- No emoji in Java console output, because the Windows console prints them as `?`. Emoji are fine in README files.
- `.class` files are git-ignored.

## Run

```
cd <lesson-folder>
javac FileName.java
java FileName
```

Java 27 is installed. Test with piped input, for example:
`cd projects/evcplus && printf '*770#\n1234\n1\n0\n' | java EvcPlus`

## EvcPlus.java: how it must behave

- Dial `*770#`, then enter the PIN (`1234`). Wrong PIN 3 times locks the account (`for` loop).
- Starting balance **$1000.00**. Maximum per transfer **$1000**.
- Main menu (Somali): 1. Itus Haraagaaga, 2. Kaarka Hadalka, 3. Bixi Biil, 4. U wareeji EVCPlus, 5. Warbixin Kooban, 6. Salaam Bank, 7. Maareynta, 8. Bill Payment, 0. Ka bax.
- **4. U wareeji EVCPlus** flow, in this exact order:
  1. Geli lambarka (any number: 9 digits, starts with `61` or `77`, not your own)
  2. Geli lacagta
  3. Confirm, showing the number and amount: `Ma hubtaa inaad lacag u wareejiso lambarkan? 1. Haa 2. Maya`
  4. Geli PIN-kaaga
  5. Success message, then **the program stops** (`choice = 0`)
- There is no stored receiver list and no "Lacag Qaado" (receive money) option. The student removed both on purpose.
- Messages use the `[-EVCPlus-]` prefix, a `Tix:` transaction number and `Haraagaagu waa $X`.

## projects/evcplus/EvcPlus.html (browser phone)

- A single self-contained HTML file: an iPhone-style lock screen, home screen, apps (Phone, Messages, Photos, Camera, Calculator, Clock, Notes, Weather, Calendar, Contacts, Settings), Control Center and iOS-style USSD alerts.
- Keep its EVC logic in sync with `EvcPlus.java` when the Java flow changes.
- Icons are hand-drawn SVG in the iOS style. Never copy Apple's real icon artwork.
- Open locally by double-clicking it. To test with the Chrome extension, serve the folder (`python -m http.server 8765 --bind 127.0.0.1`), because `file://` URLs can't be automated.
- Do not publish it as a claude.ai Artifact while it uses the real Hormuud/EVCPlus names and a PIN prompt. It would need a made-up brand first, and only if the student asks.

## Conventions

- Somali text in program output, with English in brackets where it helps.
- Money format: `printf("%.2f")` / `$` prefix.
- IDE hints like "Convert to switch" or "try-with-resources" are style suggestions. Ignore them, because the student hasn't learned those yet.

## Git

- Never add `Co-Authored-By: Claude` or `Claude-Session` lines (or any Claude attribution) to commits or PRs. Commits are authored only by engabdullah-2024.
