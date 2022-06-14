package classroom.objects;

public class Cat {
    char gender = 'M';
    int age = 9;
    String color = "Black";
    String breed = "Miscellaneous";
    boolean isFriendly = true;


    public Cat(char gender, int age, String color, String breed, boolean isFriendly) {
        this.gender = gender;
        this.age = age;
        this.color = color;
        this.breed = breed;
        this.isFriendly = isFriendly;
    }
}
