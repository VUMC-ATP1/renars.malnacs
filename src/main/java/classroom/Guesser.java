package classroom;

import java.util.Random;
import java.util.Scanner;

public class Guesser {
    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber = random.nextInt(10);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number from 1 - 10:");
        int userInput = scanner.nextInt();
        boolean isCorrect = false;

        if (userInput < 0 || userInput > 10) {
            System.out.println("Entered number is not correct!");
        } else {
            while (userInput != randomNumber) {
                System.out.println("Try again!");
                userInput = scanner.nextInt();

                System.out.println("You guessed correctly!");


            }
        }
    }
}