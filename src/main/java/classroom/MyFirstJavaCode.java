package classroom;

public class MyFirstJavaCode {
    public static void main(String[] args) {

        System.out.println("Hello World!");

        System.out.println("First argument is " + args[0]);
        System.out.println("Second argument is " + args[1]);

        String[] twoWords = {"Hello", "World"};
        String[] twoWords2 = {"HelloWorld"};
        System.out.println(twoWords2[0]);

        short salariesIt[] = {1000, 2000, 3000};
        short salariesItEmpty[] = new short[4];
        System.out.println(salariesIt[2]);

        salariesItEmpty[0] = 100;
        salariesItEmpty[1] = 200;
        salariesItEmpty[2] = 300;
        salariesItEmpty[3] = 400;
        System.out.println(salariesItEmpty[3]);




        byte floorCount = 7;
        System.out.println("My house has " + floorCount + " floors.");

        System.out.printf("My house has %d floors!\n", floorCount);
        System.out.printf("My house has %d floors!\n", floorCount);

        //%s = for strings
        //%d = for numbers

        short salary = 1000;
        int chinaPop = 12345678;
        long worldPop = 1234567189;
        System.out.println(worldPop);


        float myWeight = 70.6f;
        System.out.println(myWeight);

        double gasPrice = 1.83443d;
        System.out.println(gasPrice);

        boolean isSummer = false;

        char firstNameLetter = 'N';
        System.out.println(firstNameLetter);

        String myNameAndSurname = "Renars Malnacs";
        System.out.println(myNameAndSurname);

        System.out.println("7" + 7);


        int a = 10;
        int b = 5;
        int c = a + b;
        System.out.println(c);

        boolean isAGreaterThanB = a > b;
        System.out.println(isAGreaterThanB);
    }
}
