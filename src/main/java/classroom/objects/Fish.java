package classroom.objects;

public class Fish {
    String species = "Trout";
    double weight = 1.43;
    String diet = "Snacks";
    String naturalHabitat = "River";
    boolean isSaltWaterFish = false;


    public Fish(String species, double weight, String diet, String naturalHabitat, boolean isSaltWaterFish) {
        this.species = species;
        this.weight = weight;
        this.diet = diet;
        this.naturalHabitat = naturalHabitat;
        this.isSaltWaterFish = isSaltWaterFish;
    }
}
