package homework;

public class FirstClass {
    public static void main(String[] args) {

        String countryName = "Latvia";
        System.out.println("Name: " + countryName);

        int countryPopulation = 1907675;
        System.out.println("Population: " + countryPopulation);

        float countryArea = 64.589f;
        System.out.println("Area: " + countryArea);

        String countryCapital = "Riga";
        System.out.println("Capital: " + countryCapital);

        String countryOfficialLanguage = "Latvian";
        System.out.println("Official language: " + countryOfficialLanguage);

        boolean isEuMember = true;
        System.out.println("Member of EU: " + isEuMember);

        char countryCurrency = '\u20AC';
        System.out.println("Currency: " + countryCurrency);

        System.out.printf(countryName + " has a total area of " + countryArea + " square kilometers. The total length of Latvia's boundary is " + 1866 + " km. The longest river flowing through " + countryName + "n territory is the Daugava.");
        System.out.printf(" The sole official language of %s is Latvian.", countryName);
        System.out.printf(" Total estimated population in year 2020 was %d persons living in Latvia.", countryPopulation);
        System.out.println();
        System.out.println();


        // Arithmetic Operators
        int a = 23;
        int b = 9;
        float c = 5.8f;
        double d = 113.0432d;

        int sumOne = a + b;
        float sumTwo = c + 27.3f;
        double sumThree = 98.1123d + d;
        System.out.println(sumOne + " / " + sumTwo + " / " + sumThree);

        int minusOne = a - b;
        float minusTwo = 27.3f - b;
        double minusThree = d - a;
        System.out.println(minusOne + " / " + minusTwo + " / " + minusThree);

        int multiplyOne = a * b;
        float multiplyTwo = 27.3f * b;
        double multiplyThree = d * a;
        System.out.println(multiplyOne + " / " + multiplyTwo + " / " + multiplyThree);

        int divideOne = a / b;
        float divideTwo = 45.9f / c;
        double divideThree = d / 12;
        System.out.println(divideOne + " / " + divideTwo + " / " + divideThree);

        int modoloOne = a % b;
        float modoloTwo = 45.9f % c;
        double modoloThree = d % 12;
        System.out.println(modoloOne + " / " + modoloTwo + " / " + modoloThree);

    }
}
