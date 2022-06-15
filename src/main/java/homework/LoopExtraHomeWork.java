package homework;

import java.util.Random;
import java.util.Scanner;

public class LoopExtraHomeWork {
    public static void main(String[] args) {

    Random random = new Random();
    int x = random.nextInt(50);
    int attempts = 0;
    System.out.println("x=" + x + " (For testing)");
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number from 0 - 50:");

    while (attempts < 10) {
        int userInput = scanner.nextInt();
        if (userInput < 0 || userInput > 50) {
            System.out.println("Invalid number, enter from 0 - 50!");
        }
        else {
            attempts++;
            if (userInput != x) {
                if (attempts == 10) {
                    System.out.println("Max tryouts reached, You lost!");
                    break;
                }
                if (userInput > x) {
                    System.out.println("Your number was larger than secret number, try again!");
                } else {
                    System.out.println("Your number was smaller than secret number, try again!");
                }
            }
            else {
                System.out.println("Congrats! You guessed secret number " + x + " in " + attempts + " attempts.");
                break;
            }
        }
    }
    }
}
