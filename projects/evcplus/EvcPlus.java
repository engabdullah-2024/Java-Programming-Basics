import java.util.Scanner;

/**
 * EVC Plus (Hormuud) - *770# simulation.
 * Uses only: variables, data types, conditions, and loops.
 *
 * Compile:  javac EvcPlus.java
 * Run:      java EvcPlus
 *
 * Dial: *770#     PIN: 1234
 * Send money to any Hormuud number (9 digits, starts with 61 or 77)
 * Merchant numbers: 400100, 400200, 400300
 */
public class EvcPlus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // ================= VARIABLES & DATA TYPES =================
        String name = "Abdalla Ali";        // account owner
        String myNumber = "615000001";      // my phone number
        int pin = 1234;                     // secret PIN
        double balance = 1000.00;           // EVCPlus balance
        double bankBalance = 500.00;        // Salaam Bank balance
        String bankAccount = "SB-20231234"; // Salaam Bank account
        double hormuudBill = 12.50;         // postpaid bill owed to Hormuud
        boolean isLoggedIn = false;
        boolean isLocked = false;
        String language = "Somali";
        char currency = '$';
        int maxAttempts = 3;
        double maxTransfer = 1000.00;
        int txId = 1000;                    // transaction number (Tix)

        // recent activity (newest = last1)
        String last1 = "";
        String last2 = "";
        String last3 = "";
        String lastTransfer = "";
        double lastTransferAmount = 0;
        String lastTransferNumber = "";

        // ================= DIAL USSD =================
        System.out.print("Dial: ");
        String code = input.next();

        if (!code.equals("*770#")) {
            System.out.println("USSD code khaldan. Isku day *770#");
            return;
        }

        // ================= PIN (FOR LOOP, 3 TRIES) =================
        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            System.out.println("\n[-EVCPlus-]");
            System.out.print("Fadlan geli PIN-kaaga: ");
            int enteredPin = input.nextInt();

            if (enteredPin == pin) {
                isLoggedIn = true;
                break;
            } else if (attempt < maxAttempts) {
                System.out.println("PIN-ka aad gelisay waa khalad. Isku dayo haray: " + (maxAttempts - attempt));
            } else {
                System.out.println("PIN-ka waxaad khaldday 3 jeer. Akoonkaaga waa la xiray. Wac 300.");
            }
        }

        if (!isLoggedIn) {
            return;
        }

        // ================= MAIN MENU (WHILE LOOP) =================
        int choice = -1;
        while (choice != 0 && !isLocked) {

            System.out.println("\n[-EVCPlus-]");
            if (language.equals("Somali")) {
                System.out.println("1. Itus Haraagaaga");
                System.out.println("2. Kaarka Hadalka");
                System.out.println("3. Bixi Biil");
                System.out.println("4. U wareeji EVCPlus");
                System.out.println("5. Warbixin Kooban");
                System.out.println("6. Salaam Bank");
                System.out.println("7. Maareynta");
                System.out.println("8. Bill Payment");
                System.out.println("0. Ka bax");
            } else {
                System.out.println("1. Check Balance");
                System.out.println("2. Airtime");
                System.out.println("3. Pay Bill");
                System.out.println("4. Transfer EVCPlus");
                System.out.println("5. Mini Statement");
                System.out.println("6. Salaam Bank");
                System.out.println("7. Management");
                System.out.println("8. Bill Payment");
                System.out.println("0. Exit");
            }
            System.out.print("> ");
            choice = input.nextInt();

            switch (choice) {

                // ======================================================
                // 1. ITUS HARAAGAAGA
                // ======================================================
                case 1:
                    System.out.printf("[-EVCPlus-] Haraagaagu waa %c%.2f%n", currency, balance);
                    break;

                // ======================================================
                // 2. KAARKA HADALKA
                // ======================================================
                case 2: {
                    System.out.println("\nKaarka Hadalka");
                    System.out.println("1. Ugu shub naftaada");
                    System.out.println("2. Ugu shub qof kale");
                    System.out.println("3. Xirmooyinka Internetka");
                    System.out.println("0. Dib u noqo");
                    System.out.print("> ");
                    int sub = input.nextInt();

                    String target = myNumber;
                    double amount = 0;
                    String item = "Airtime";
                    boolean valid = true;

                    if (sub == 0) {
                        break;
                    } else if (sub == 1) {
                        System.out.print("Geli lacagta: ");
                        amount = input.nextDouble();
                    } else if (sub == 2) {
                        System.out.print("Geli lambarka: ");
                        target = input.next();
                        if (target.length() != 9 || !(target.startsWith("61") || target.startsWith("77"))) {
                            System.out.println("Lambarka aad gelisay waa khalad.");
                            valid = false;
                        } else {
                            System.out.print("Geli lacagta: ");
                            amount = input.nextDouble();
                        }
                    } else if (sub == 3) {
                        System.out.println("\nXirmooyinka Internetka");
                        System.out.println("1. 1GB   - $1  (1 maalin)");
                        System.out.println("2. 5GB   - $5  (7 maalmood)");
                        System.out.println("3. 20GB  - $15 (30 maalmood)");
                        System.out.println("4. Unlimited - $30 (30 maalmood)");
                        System.out.print("> ");
                        int pack = input.nextInt();

                        if (pack == 1) {
                            amount = 1; item = "Internet 1GB";
                        } else if (pack == 2) {
                            amount = 5; item = "Internet 5GB";
                        } else if (pack == 3) {
                            amount = 15; item = "Internet 20GB";
                        } else if (pack == 4) {
                            amount = 30; item = "Internet Unlimited";
                        } else {
                            System.out.println("Doorasho khaldan.");
                            valid = false;
                        }
                    } else {
                        System.out.println("Doorasho khaldan.");
                        valid = false;
                    }

                    if (valid && amount <= 0) {
                        System.out.println("Lacagta aad gelisay waa khalad.");
                        valid = false;
                    }
                    if (valid && amount > balance) {
                        System.out.println("[-EVCPlus-] Haraagaagu kuma filna.");
                        valid = false;
                    }

                    if (valid) {
                        System.out.printf("Ma hubtaa inaad %c%.2f %s ugu shubto %s?%n", currency, amount, item, target);
                        System.out.println("1. Haa");
                        System.out.println("2. Maya");
                        System.out.print("> ");
                        if (input.nextInt() == 1) {
                            balance -= amount;
                            txId++;
                            System.out.printf("[-EVCPlus-] %c%.2f %s ayaad ugu shubtay %s, Tix: %d, Haraagaagu waa %c%.2f%n",
                                    currency, amount, item, target, txId, currency, balance);
                            last3 = last2;
                            last2 = last1;
                            last1 = String.format("Tix:%d  %s  -%c%.2f  %s", txId, item, currency, amount, target);
                        } else {
                            System.out.println("Waa la joojiyay.");
                        }
                    }
                    break;
                }

                // ======================================================
                // 3. BIXI BIIL
                // ======================================================
                case 3: {
                    System.out.println("\nBixi Biil");
                    System.out.println("1. Ka iibso (Merchant)");
                    System.out.println("2. Bixi biilka Hormuud (Postpaid)");
                    System.out.println("0. Dib u noqo");
                    System.out.print("> ");
                    int sub = input.nextInt();

                    if (sub == 1) {
                        System.out.print("Geli Merchant Number-ka: ");
                        int merchantId = input.nextInt();
                        String merchant = "";

                        if (merchantId == 400100) {
                            merchant = "HAYAT MARKET";
                        } else if (merchantId == 400200) {
                            merchant = "BAKAARO SHOP";
                        } else if (merchantId == 400300) {
                            merchant = "JUBA HOTEL";
                        }

                        if (merchant.isEmpty()) {
                            System.out.println("Merchant-kan lama helin.");
                            break;
                        }

                        System.out.print("Geli lacagta: ");
                        double amount = input.nextDouble();

                        if (amount <= 0) {
                            System.out.println("Lacagta aad gelisay waa khalad.");
                        } else if (amount > balance) {
                            System.out.println("[-EVCPlus-] Haraagaagu kuma filna.");
                        } else {
                            System.out.printf("Ma hubtaa inaad %c%.2f u bixiso %s (%d)?%n", currency, amount, merchant, merchantId);
                            System.out.println("1. Haa");
                            System.out.println("2. Maya");
                            System.out.print("> ");
                            if (input.nextInt() == 1) {
                                System.out.print("Geli PIN-kaaga: ");
                                if (input.nextInt() == pin) {
                                    balance -= amount;
                                    txId++;
                                    System.out.printf("[-EVCPlus-] %c%.2f ayaad u bixisay %s, Tix: %d, Haraagaagu waa %c%.2f%n",
                                            currency, amount, merchant, txId, currency, balance);
                                    last3 = last2;
                                    last2 = last1;
                                    last1 = String.format("Tix:%d  Merchant  -%c%.2f  %s", txId, currency, amount, merchant);
                                } else {
                                    System.out.println("PIN khaldan. Waa la joojiyay.");
                                }
                            } else {
                                System.out.println("Waa la joojiyay.");
                            }
                        }
                    } else if (sub == 2) {
                        if (hormuudBill == 0) {
                            System.out.println("[-EVCPlus-] Biil lagaa rabo ma jiro.");
                        } else if (hormuudBill > balance) {
                            System.out.printf("Biilkaagu waa %c%.2f. Haraagaagu kuma filna.%n", currency, hormuudBill);
                        } else {
                            System.out.printf("Biilka Hormuud ee lagaa rabo waa %c%.2f%n", currency, hormuudBill);
                            System.out.println("1. Bixi");
                            System.out.println("2. Maya");
                            System.out.print("> ");
                            if (input.nextInt() == 1) {
                                System.out.print("Geli PIN-kaaga: ");
                                if (input.nextInt() == pin) {
                                    double paid = hormuudBill;
                                    balance -= paid;
                                    hormuudBill = 0;
                                    txId++;
                                    System.out.printf("[-EVCPlus-] %c%.2f ayaad ku bixisay biilka Hormuud, Tix: %d, Haraagaagu waa %c%.2f%n",
                                            currency, paid, txId, currency, balance);
                                    last3 = last2;
                                    last2 = last1;
                                    last1 = String.format("Tix:%d  Hormuud Bill  -%c%.2f", txId, currency, paid);
                                } else {
                                    System.out.println("PIN khaldan. Waa la joojiyay.");
                                }
                            } else {
                                System.out.println("Waa la joojiyay.");
                            }
                        }
                    } else if (sub != 0) {
                        System.out.println("Doorasho khaldan.");
                    }
                    break;
                }

                // ======================================================
                // 4. U WAREEJI EVCPLUS
                // ======================================================
                case 4: {
                    System.out.print("Geli lambarka aad u wareejinayso: ");
                    String receiver = input.next();

                    // check every character is a digit (loop + condition)
                    boolean allDigits = true;
                    for (int i = 0; i < receiver.length(); i++) {
                        char c = receiver.charAt(i);
                        if (c < '0' || c > '9') {
                            allDigits = false;
                        }
                    }

                    if (receiver.equals(myNumber)) {
                        System.out.println("Naftaada lacag uma wareejin kartid.");
                    } else if (!allDigits || receiver.length() != 9
                            || !(receiver.startsWith("61") || receiver.startsWith("77"))) {
                        System.out.println("Lambarka aad gelisay waa khalad. (9 lambar, ku bilaabma 61 ama 77)");
                    } else {
                        System.out.print("Geli lacagta: ");
                        double amount = input.nextDouble();

                        if (amount <= 0) {
                            System.out.println("Lacagta aad gelisay waa khalad.");
                        } else if (amount > maxTransfer) {
                            System.out.printf("Xadka ugu badan ee hal mar waa %c%.2f%n", currency, maxTransfer);
                        } else if (amount > balance) {
                            System.out.println("[-EVCPlus-] Haraagaagu kuma filna.");
                        } else {
                            // step 3: confirmation (shows number and amount)
                            System.out.println("\nLambarka: " + receiver);
                            System.out.printf("Lacagta:  %c%.2f%n", currency, amount);
                            System.out.println("Ma hubtaa inaad lacag u wareejiso lambarkan?");
                            System.out.println("1. Haa");
                            System.out.println("2. Maya");
                            System.out.print("> ");
                            if (input.nextInt() != 1) {
                                System.out.println("Waa la joojiyay.");
                            } else {
                                // step 4: enter PIN
                                System.out.print("Geli PIN-kaaga: ");
                                if (input.nextInt() == pin) {
                                    // step 5: success
                                    balance -= amount;
                                    txId++;
                                    System.out.printf("[-EVCPlus-] %c%.2f ayaad u wareejisay %s, Tix: %d, Haraagaagu waa %c%.2f%n",
                                            currency, amount, receiver, txId, currency, balance);
                                    lastTransfer = String.format("Tix:%d  -%c%.2f  -> %s", txId, currency, amount, receiver);
                                    lastTransferAmount = amount;
                                    lastTransferNumber = receiver;
                                    last3 = last2;
                                    last2 = last1;
                                    last1 = String.format("Tix:%d  Wareejin  -%c%.2f  %s", txId, currency, amount, receiver);
                                    choice = 0;   // stop the program after a successful transfer
                                } else {
                                    System.out.println("PIN khaldan. Waa la joojiyay.");
                                }
                            }
                        }
                    }
                    break;
                }

                // ======================================================
                // 5. WARBIXIN KOOBAN
                // ======================================================
                case 5: {
                    System.out.println("\nWarbixin Kooban");
                    System.out.println("1. Dhaqdhaqaaqii u dambeeyay");
                    System.out.println("2. Wareejintii u dambeysay");
                    System.out.println("3. Saddexdii dhaqdhaqaaq ee u dambeeyay");
                    System.out.println("0. Dib u noqo");
                    System.out.print("> ");
                    int sub = input.nextInt();

                    if (sub == 1) {
                        if (last1.isEmpty()) {
                            System.out.println("Wax dhaqdhaqaaq ah ma jiraan.");
                        } else {
                            System.out.println("[-EVCPlus-] " + last1);
                        }
                    } else if (sub == 2) {
                        if (lastTransfer.isEmpty()) {
                            System.out.println("Wax wareejin ah ma jiraan.");
                        } else {
                            System.out.println("[-EVCPlus-] " + lastTransfer);
                        }
                    } else if (sub == 3) {
                        if (last1.isEmpty()) {
                            System.out.println("Wax dhaqdhaqaaq ah ma jiraan.");
                        } else {
                            // loop through the three saved activities
                            for (int i = 1; i <= 3; i++) {
                                String line = "";
                                if (i == 1) line = last1;
                                if (i == 2) line = last2;
                                if (i == 3) line = last3;
                                if (!line.isEmpty()) {
                                    System.out.println(i + ". " + line);
                                }
                            }
                        }
                        System.out.printf("Haraaga: %c%.2f%n", currency, balance);
                    } else if (sub != 0) {
                        System.out.println("Doorasho khaldan.");
                    }
                    break;
                }

                // ======================================================
                // 6. SALAAM BANK
                // ======================================================
                case 6: {
                    System.out.println("\nSalaam Bank");
                    System.out.println("1. Itus haraaga bangiga");
                    System.out.println("2. Lacag dhigasho (EVCPlus -> Bank)");
                    System.out.println("3. Lacag la bixid (Bank -> EVCPlus)");
                    System.out.println("0. Dib u noqo");
                    System.out.print("> ");
                    int sub = input.nextInt();

                    if (sub == 1) {
                        System.out.printf("[Salaam Bank] Akoon: %s, Haraagaagu waa %c%.2f%n", bankAccount, currency, bankBalance);
                    } else if (sub == 2 || sub == 3) {
                        System.out.print("Geli lacagta: ");
                        double amount = input.nextDouble();
                        double available = (sub == 2) ? balance : bankBalance;

                        if (amount <= 0) {
                            System.out.println("Lacagta aad gelisay waa khalad.");
                        } else if (amount > available) {
                            System.out.println("Haraagaagu kuma filna.");
                        } else {
                            System.out.print("Geli PIN-kaaga: ");
                            if (input.nextInt() == pin) {
                                txId++;
                                if (sub == 2) {
                                    balance -= amount;
                                    bankBalance += amount;
                                    System.out.printf("[Salaam Bank] %c%.2f ayaad dhigatay akoonka %s, Tix: %d%n",
                                            currency, amount, bankAccount, txId);
                                    last3 = last2;
                                    last2 = last1;
                                    last1 = String.format("Tix:%d  To Bank  -%c%.2f", txId, currency, amount);
                                } else {
                                    bankBalance -= amount;
                                    balance += amount;
                                    System.out.printf("[Salaam Bank] %c%.2f ayaad ka soo bixisay akoonka %s, Tix: %d%n",
                                            currency, amount, bankAccount, txId);
                                    last3 = last2;
                                    last2 = last1;
                                    last1 = String.format("Tix:%d  From Bank  +%c%.2f", txId, currency, amount);
                                }
                                System.out.printf("EVCPlus: %c%.2f   Bank: %c%.2f%n", currency, balance, currency, bankBalance);
                            } else {
                                System.out.println("PIN khaldan. Waa la joojiyay.");
                            }
                        }
                    } else if (sub != 0) {
                        System.out.println("Doorasho khaldan.");
                    }
                    break;
                }

                // ======================================================
                // 7. MAAREYNTA
                // ======================================================
                case 7: {
                    System.out.println("\nMaareynta");
                    System.out.println("1. Bedel PIN-ka");
                    System.out.println("2. Bedel Luuqadda");
                    System.out.println("3. Wargeli Mobile Lumay");
                    System.out.println("4. Lacag celin (Wareejintii u dambeysay)");
                    System.out.println("0. Dib u noqo");
                    System.out.print("> ");
                    int sub = input.nextInt();

                    if (sub == 1) {
                        System.out.print("Geli PIN-ka hadda: ");
                        int oldPin = input.nextInt();
                        if (oldPin != pin) {
                            System.out.println("PIN khaldan.");
                        } else {
                            System.out.print("Geli PIN cusub (4 lambar): ");
                            int newPin = input.nextInt();
                            System.out.print("Mar kale geli PIN cusub: ");
                            int confirmPin = input.nextInt();

                            if (newPin < 1000 || newPin > 9999) {
                                System.out.println("PIN-ku waa inuu noqdaa 4 lambar.");
                            } else if (newPin != confirmPin) {
                                System.out.println("PIN-yadu isma laha.");
                            } else if (newPin == pin) {
                                System.out.println("PIN cusub waa inuu ka duwanaadaa kii hore.");
                            } else {
                                pin = newPin;
                                System.out.println("[-EVCPlus-] PIN-kaaga si guul ah ayaa loo bedelay.");
                            }
                        }
                    } else if (sub == 2) {
                        System.out.println("1. Somali");
                        System.out.println("2. English");
                        System.out.print("> ");
                        int lang = input.nextInt();
                        if (lang == 1) {
                            language = "Somali";
                            System.out.println("Luuqadda waa Somali.");
                        } else if (lang == 2) {
                            language = "English";
                            System.out.println("Language changed to English.");
                        } else {
                            System.out.println("Doorasho khaldan.");
                        }
                    } else if (sub == 3) {
                        System.out.println("Ma hubtaa in mobile-kaagu lumay? Akoonka waa la xiri doonaa.");
                        System.out.println("1. Haa");
                        System.out.println("2. Maya");
                        System.out.print("> ");
                        if (input.nextInt() == 1) {
                            isLocked = true;  // ends the main loop
                            System.out.println("[-EVCPlus-] Akoonkaaga waa la xiray. Wac 300 si laguu furo.");
                        }
                    } else if (sub == 4) {
                        if (lastTransferAmount == 0) {
                            System.out.println("Ma jirto wareejin la celin karo.");
                        } else {
                            System.out.printf("Ma rabtaa inaad dib u celiso %c%.2f oo aad u dirtay %s?%n",
                                    currency, lastTransferAmount, lastTransferNumber);
                            System.out.println("1. Haa");
                            System.out.println("2. Maya");
                            System.out.print("> ");
                            if (input.nextInt() == 1) {
                                System.out.print("Geli PIN-kaaga: ");
                                if (input.nextInt() == pin) {
                                    balance += lastTransferAmount;
                                    txId++;
                                    System.out.printf("[-EVCPlus-] %c%.2f waa lagugu soo celiyay, Tix: %d, Haraagaagu waa %c%.2f%n",
                                            currency, lastTransferAmount, txId, currency, balance);
                                    last3 = last2;
                                    last2 = last1;
                                    last1 = String.format("Tix:%d  Reversal  +%c%.2f  %s", txId, currency, lastTransferAmount, lastTransferNumber);
                                    lastTransferAmount = 0;
                                } else {
                                    System.out.println("PIN khaldan. Waa la joojiyay.");
                                }
                            }
                        }
                    } else if (sub != 0) {
                        System.out.println("Doorasho khaldan.");
                    }
                    break;
                }

                // ======================================================
                // 8. BILL PAYMENT
                // ======================================================
                case 8: {
                    System.out.println("\nBill Payment");
                    System.out.println("1. Koronto (Electricity)");
                    System.out.println("2. Biyo (Water)");
                    System.out.println("3. Waxbarasho (School fees)");
                    System.out.println("4. Internet & TV");
                    System.out.println("0. Dib u noqo");
                    System.out.print("> ");
                    int sub = input.nextInt();
                    String company = "";

                    if (sub == 1) {
                        company = "BECO ELECTRICITY";
                    } else if (sub == 2) {
                        company = "MOGADISHU WATER";
                    } else if (sub == 3) {
                        company = "SCHOOL FEES";
                    } else if (sub == 4) {
                        company = "HORMUUD FIBER";
                    } else if (sub != 0) {
                        System.out.println("Doorasho khaldan.");
                    }

                    if (company.isEmpty()) {
                        break;
                    }

                    System.out.print("Geli lambarka akoonka / mitirka: ");
                    String accountNo = input.next();
                    System.out.print("Geli lacagta: ");
                    double amount = input.nextDouble();

                    if (accountNo.length() < 4) {
                        System.out.println("Lambarka akoonka waa khalad.");
                    } else if (amount <= 0) {
                        System.out.println("Lacagta aad gelisay waa khalad.");
                    } else if (amount > balance) {
                        System.out.println("[-EVCPlus-] Haraagaagu kuma filna.");
                    } else {
                        System.out.printf("Ma hubtaa inaad %c%.2f u bixiso %s, Akoon: %s?%n", currency, amount, company, accountNo);
                        System.out.println("1. Haa");
                        System.out.println("2. Maya");
                        System.out.print("> ");
                        if (input.nextInt() == 1) {
                            System.out.print("Geli PIN-kaaga: ");
                            if (input.nextInt() == pin) {
                                balance -= amount;
                                txId++;
                                System.out.printf("[-EVCPlus-] %c%.2f ayaad u bixisay %s (%s), Tix: %d, Haraagaagu waa %c%.2f%n",
                                        currency, amount, company, accountNo, txId, currency, balance);
                                last3 = last2;
                                last2 = last1;
                                last1 = String.format("Tix:%d  %s  -%c%.2f", txId, company, currency, amount);
                            } else {
                                System.out.println("PIN khaldan. Waa la joojiyay.");
                            }
                        } else {
                            System.out.println("Waa la joojiyay.");
                        }
                    }
                    break;
                }

                // ======================================================
                // 0. KA BAX
                // ======================================================
                case 0:
                    System.out.println("Mahadsanid, " + name + "! EVCPlus - Hormuud Telecom.");
                    break;

                default:
                    System.out.println("Doorasho khaldan.");
            }
        }

        input.close();
    }
}
