package homework.classHomework;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Triangle triangleOne = new Triangle();
        System.out.println("\n********** Triangle 1 **********");
        System.out.println("Enter side A:");
        triangleOne.sideA = scanner.nextInt();
        System.out.println("Enter side B:");
        triangleOne.sideB = scanner.nextInt();
        System.out.println("Enter side C:");

        triangleOne.sideC = scanner.nextInt();
        System.out.println("Triangle sides are: " + triangleOne.sideA + ", " + triangleOne.sideB + ", " + triangleOne.sideC + "\nIs triangle equilateral? - " + triangleOne.checkAllSides() + "\nIs triangle isosceles? - " + triangleOne.checkTwoSides());


        System.out.println("\n********** Triangle 2 **********");
        System.out.println("Enter side A:");
        int a = scanner.nextInt();
        System.out.println("Enter side B:");
        int b = scanner.nextInt();
        System.out.println("Enter side C:");
        int c = scanner.nextInt();

        Triangle triangleTwo = new Triangle(a, b, c);
        System.out.println("Triangle sides are: " + triangleTwo.sideA + ", " + triangleTwo.sideB + ", " + triangleTwo.sideC + "\nTotal area is: " + Math.round(triangleTwo.triangleArea*100.0)/100.0 + "\nIs triangle equilateral? - " + triangleTwo.checkAllSides() + "\nIs triangle isosceles? - " + triangleTwo.checkTwoSides());



    }
}
