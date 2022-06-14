package classroom;

import java.util.Arrays;

public class Loops {
    public static void main(String[] args) {


        String[] countries = new String[]{"LV", "UK", "CZ", "PL", "ES", "RO"};

//////// break
        for (String country : countries) {
            System.out.println(country);
            if (country.equals("PL")) {
                System.out.println("I found PL!");
                break;
            }
        }

////// continue
        for (int i = 1; i <= 10; i++) {
            if (i > 4 && i < 9) {
                continue;
            }
            System.out.printf(i + ", ");
        }




    }
}
