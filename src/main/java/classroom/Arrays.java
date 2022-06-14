package classroom;

import java.util.ArrayList;
import java.util.Random;

public class Arrays {
    public static void main(String[] args) {

        int[] dayOfTheWeek = {1,2,3,4,5,6,7};
        System.out.println(dayOfTheWeek.length - 1);
        System.out.println(dayOfTheWeek[0]);

        String[] nameOfTheWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        System.out.println("Today is " + nameOfTheWeek[1]);


        String[] fruits = new String[6];
        fruits[0] = "apple";
        fruits[1] = "kiwi";
        fruits[2] = "banana";
        fruits[3] = "cherry";
        fruits[4] = "pineapple";

        System.out.println(fruits[3]);

        fruits[2] = "grape";
        System.out.println("");

        char[] myNameCharacters = {'R', 'E', 'N', 'A', 'R', 'S'};
        System.out.println(myNameCharacters[4]);


        Random random = new Random();
        int[] randomNumbers = {random.nextInt(100), random.nextInt(100), random.nextInt(100)};
        System.out.println(randomNumbers.toString());


        //Collections (List, Map, Queue)
        ArrayList listOfFruits = new ArrayList<>();
        listOfFruits.add("apple");
        listOfFruits.add("kiwi");

    }

}
