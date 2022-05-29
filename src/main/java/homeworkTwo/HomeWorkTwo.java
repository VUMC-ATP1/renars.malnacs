package homeworkTwo;

import java.util.Scanner;

public class HomeWorkTwo {
    public static void main(String[] args) {
        System.out.println("1. uzdevums");
        int x = 9;
        System.out.println("a) " + (x > 1));
        System.out.println("b) " + (x < 1));
        System.out.println("c) " + (x > 5 && x <= 10));
        System.out.println("d) " + !(x <= 5 && x < 10));
        System.out.println("e) " + (x == 0 || x == 10));
        System.out.println("f) " + (x * x > 10));

        System.out.println("\n2. uzdevums");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter month number:");
        int monthNumber = scanner.nextInt();

        switch (monthNumber) {
            case 1:
                System.out.println("It is January");
                break;
            case 2:
                System.out.println("It is February");
                break;
            case 3:
                System.out.println("It is March");
                break;
            case 4:
                System.out.println("It is April");
                break;
            case 5:
                System.out.println("It is May");
                break;
            case 6:
                System.out.println("It is June");
                break;
            case 7:
                System.out.println("It is July");
                break;
            case 8:
                System.out.println("It is August");
                break;
            case 9:
                System.out.println("It is September");
                break;
            case 10:
                System.out.println("It is October");
                break;
            case 11:
                System.out.println("It is November");
                break;
            case 12:
                System.out.println("It is December");
                break;
            default:
                System.out.println("Invalid number");
                break;
        }

        System.out.println("\n3. uzdevums");
        System.out.println("Enter number 1:");
        int a = scanner.nextInt();
        System.out.println("Enter number 2:");
        int b = scanner.nextInt();
        System.out.println("Enter number 3:");
        int c = scanner.nextInt();

        int largestNumber = Math.max(Math.max(a, b), c);
        System.out.println("Largest number is " + largestNumber);


        System.out.println("\n4. uzdevums");
        String krasa = "Sarkana";

        if (krasa.equals("Sarkana")) {
            System.out.println("Gaidiet luksofora zaļo signālu, lai šķērsotu ielu!");
        }
        else if (krasa.equals("Dzeltena")) {
            System.out.println("Uzmanību, mainās luksofora signāls!");
        }
        else if (krasa.equals("Zaļa")) {
            System.out.println("Šķērsojiet ielu!");
        }
        else {
            System.out.println("Luksofors nedarbojas, šķērsojiet ielu tuvākajā iespējamajā drošajā vietā!");
        }


        System.out.println("\n5. uzdevums");
        printBusinessCard();
        printBusinessCard();
        printBusinessCard();


        System.out.println("\n6. uzdevums");
        printBusinessCardTwo("Oskars","Ozols", "+371 20341123", 1954);
        printBusinessCardTwo("Liene","Kārkliņa", "+371 28431111", 1994);


        System.out.println("\n7. uzdevums");
        int summa = sum(20,8);
        System.out.println(summa);


        System.out.println("\n8. uzdevums");
        System.out.println(average(11.4,7,2));
    }

    public static void printBusinessCard() {
        System.out.println("Vizītkarte");
        System.out.println("##########");
        System.out.println("Vārds: Jānis");
        System.out.println("Uzvārds: Bērziņš");
        System.out.println("Telefona numurs: +371 12345678");
        System.out.println("Dzimšanas gads: 1990");
        System.out.println("##########");
    }
    public static void printBusinessCardTwo(String name, String surname, String phone, int dateOfBirth) {
        System.out.println("Vizītkarte");
        System.out.println("##########");
        System.out.println("Vārds: " + name);
        System.out.println("Uzvārds: " + surname);
        System.out.println("Telefona numurs: " + phone);
        System.out.println("Dzimšanas gads: " + dateOfBirth);
        System.out.println("##########");
    }
    public static int sum(int a, int b) {
        return  a + b;
    }
    public static double average(double doubleA, double doubleB, double doubleC) {
        return (doubleA + doubleB + doubleC) / 3;
    }
}
