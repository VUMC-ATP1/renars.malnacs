package classroom;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Number 1:");
        int a = scanner.nextInt();
        System.out.println("Operator:");
        char operator = scanner.next().charAt(0);
        System.out.println("Number 2:");
        int b = scanner.nextInt();


        switch (operator) {
            case '+':
                doSum(a, b);
                break;
            case '-':
                doSubtraction(a, b);
                break;
            case '*':
                doMultiply(a, b);
                break;
            case '/':
                doDivision(a, b);
                break;
            default:
                System.out.println("Operator not recognized");
                break;
        }
    }

    public static void doSum(int a, int b) {
        System.out.println(a + b);
    }
    public static void doSubtraction(int a, int b) {
        System.out.println(a - b);
    }
    public static void doMultiply(int a, int b) {
        System.out.println(a * b);
    }
    public static void doDivision(int a, int b) {
        System.out.println(a / b);
    }
}
