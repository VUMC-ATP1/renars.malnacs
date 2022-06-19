package classroom.chaining;

import lombok.Getter;
import lombok.ToString;

@Getter @ToString
public class Vehicle {

    public String brand;
    public String color;
    public String engine;
    public int productionYear;
    public double price;

    public void start() {
        System.out.println("Car is started!");
    }

    public void stop() {
        System.out.println("Car is stopped");
    }

    public void fill() {
        System.out.println("Fuel is added!");
    }

    public Vehicle setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public Vehicle setColor(String color) {
        this.color = color;
        return this;
    }

    public Vehicle setEngine(String engine) {
        this.engine = engine;
        return this;
    }

    public Vehicle setProductionYear(int productionYear) {
        this.productionYear = productionYear;
        return this;
    }

    public Vehicle setPrice(double price) {
        this.price = price;
        return this;
    }
}
