# Project: EVCPlus Simulator

A console simulation of the **EVC Plus `*770#`** mobile-money menu, written using **only** what this course has taught so far: variables, data types, conditions and loops.

> 🎓 Student practice project. It isn't connected to any real service, and every number, name and balance is made up.

## Run

```
javac EvcPlus.java
java EvcPlus
```

Dial `*770#` and use PIN **`1234`**. The starting balance is **$1000.00**.

## Menu

```
[-EVCPlus-]
1. Itus Haraagaaga      (check balance)
2. Kaarka Hadalka       (airtime / internet bundles)
3. Bixi Biil            (merchant / Hormuud postpaid)
4. U wareeji EVCPlus    (send money)
5. Warbixin Kooban      (mini statement)
6. Salaam Bank          (bank deposit / withdraw)
7. Maareynta            (change PIN, language, lost phone, reversal)
8. Bill Payment         (electricity, water, school, internet)
0. Ka bax               (exit)
```

## Send money flow (option 4)

```
Geli lambarka aad u wareejinayso: 617654321
Geli lacagta: 75

Lambarka: 617654321
Lacagta:  $75.00
Ma hubtaa inaad lacag u wareejiso lambarkan?
1. Haa
2. Maya
> 1
Geli PIN-kaaga: 1234
[-EVCPlus-] $75.00 ayaad u wareejisay 617654321, Tix: 1001, Haraagaagu waa $925.00
```

After a successful transfer, the program stops.

## Where each lesson is used

| Concept | Where in `EvcPlus.java` |
|---|---|
| **Variables & data types** | `String name`, `int pin`, `double balance`, `boolean isLoggedIn`, `char currency` |
| **Conditions** | `if / else if` for PIN, balance and number checks; `switch` for the menu |
| **for loop** | 3 PIN attempts; checking every digit of the phone number |
| **while loop** | The main menu keeps showing until you exit |

## Browser version

[`EvcPlus.html`](EvcPlus.html) is an iPhone-style phone (lock screen, home screen, apps, Control Center) that runs the same EVCPlus logic in iOS-style USSD pop-ups. Download it and open it in your browser.
