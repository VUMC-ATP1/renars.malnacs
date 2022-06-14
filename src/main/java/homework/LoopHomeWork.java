package homework;

import java.util.Scanner;

public class LoopHomeWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("********** 1. uzdevums **********");
        int totalSum = 0;
        while (totalSum <= 100) {
            System.out.println("Ievadi veselu skaitli:");
            int userInput = scanner.nextInt();
            totalSum = totalSum + userInput;
        }
        System.out.println("Gatavs!");


        System.out.println("\n********** 2. uzdevums **********");
        System.out.println("Ievadi veselu skaitli:");
        int userInput = scanner.nextInt();
        boolean isPrimeNum = true;

        if (userInput <= 1) {
            isPrimeNum = false;
        }
        else {
            for (int i = 2; i <= userInput / 2; ++i) {
                if (userInput % i == 0) {
                    isPrimeNum = false;
                    break;
                }
            }
        }

        if (isPrimeNum)
            System.out.println(userInput + " ir pirmskaitlis.");
        else
            System.out.println(userInput + " nav pirmskaitlis.");


        System.out.println("\n********** 3. uzdevums **********");
        int[] someNumbers = new int[]{12,5,51,109,481,6};
        String[] someCars = new String[]{"Audi", "BMW", "Volkswagen", "Toyota", "Honda", "Ford"};
        char[] someLetters = new char[]{'A','B','C','D','E','F'};

        System.out.print("While:\n");
        int i = 0;
        while (i < someNumbers.length) {
            System.out.printf(someNumbers[i] + ",");
            i++;
        }
        System.out.print("\n");
        i = 0;
        while (i < someCars.length) {
            System.out.printf(someCars[i] + ",");
            i++;
        }
        System.out.print("\n");
        i = 0;
        while (i < someLetters.length) {
            System.out.printf(someLetters[i] + ",");
            i++;
        }

        System.out.print("\nDo while:\n");
        i = 0;
        do {
            System.out.printf(someNumbers[i] + ",");
            i++;
            } while (i < someNumbers.length);
        System.out.print("\n");
        i = 0;
        do {
            System.out.printf(someCars[i] + ",");
            i++;
        } while (i < someCars.length);
        System.out.print("\n");
        i = 0;
        do {
            System.out.printf(someLetters[i] + ",");
            i++;
        } while (i < someLetters.length);

        System.out.print("\nFor:\n");
        for (int j = 0; j < someNumbers.length; j++) {
            System.out.printf(someNumbers[j] + ",");
        }
        System.out.print("\n");
        for (int j = 0; j < someCars.length; j++) {
            System.out.printf(someCars[j] + ",");
        }
        System.out.print("\n");
        for (int j = 0; j < someLetters.length; j++) {
            System.out.printf(someLetters[j] + ",");
        }

        System.out.print("\nFor each:\n");
        for (int num : someNumbers)
        {
            System.out.printf(num + ",");
        }
        System.out.print("\n");
        for (String car : someCars)
        {
            System.out.printf(car + ",");
        }
        System.out.print("\n");
        for (char letter : someLetters)
        {
            System.out.printf(letter + ",");
        }

        System.out.println("\n\n********** 4. uzdevums **********");
        int[] evenNumbers = new int[100];
        int x = 0;
        for (int h = 0; h < evenNumbers.length; h++) {
            if (x % 2 == 0) {
                evenNumbers[h] = x;
                h--;
            }
            x++;
        }
        for (int num : evenNumbers) {
            System.out.printf(num + ", ");
        }

        System.out.println("\n\n********** 5. uzdevums **********");
        System.out.println("Ievadi veselu skaitli:");
        int userNum = scanner.nextInt();
        long factorial = 1;

        for (int j = 1; j <= userNum; ++j) {
            factorial = factorial * j;
        }
        System.out.printf("Skaitļa %d faktoriāls = %d", userNum, factorial);


        System.out.println("\n\n********** 6. uzdevums **********");
        final int pinNumber = 1020;

        for (int k = 0; k < 3; k++) {
            System.out.println("Ievadiet PIN kodu:");
            int enteredPin = scanner.nextInt();
            if (enteredPin == pinNumber) {
                System.out.println("PIN ir pieņemts, laipni lūdzam atpakaļ!");
                break;
            } else if (k == 2) {
                System.out.println("Atvainojiet, bet jūs esat bloķēts!");
            } else {
                System.out.println("Nepareizs PIN, mēģiniet vēlreiz!");
            }
        }

    }
}
