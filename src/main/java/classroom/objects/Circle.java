package classroom.objects;

public class Circle {
   public double pi = 3.14;
    public double radius;

    public double calculate(double radius) {
        return pi * radius * radius;

    }


    public double Circle(double radius) {
        this.radius = pi * Math.pow(radius, 2);
        return radius;
    }
}
