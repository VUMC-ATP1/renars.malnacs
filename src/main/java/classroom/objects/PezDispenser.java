package classroom.objects;

public class PezDispenser {
    public int candyCount = 10;
    public int currentCandyAmount;
    public String name;



    public PezDispenser(String name) {
        this.name = name;
        currentCandyAmount = candyCount;
    }

    public int eatOne() {
        while(currentCandyAmount > 0) {
            currentCandyAmount = candyCount - 1;
        }

        return currentCandyAmount;
    }


}
