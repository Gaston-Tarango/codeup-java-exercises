package shapes;
import util.Input;

public class Circle {
    private double radius;
    private static int counter = 0;

    public Circle(double radius){
        this.radius = radius;
        this.counter++;
    }

    public int showCount() {
        return counter;
    }

    public double getArea() {
        return Math.PI * (radius * radius);
    }

    public double getCircumference() {
        return Math.PI * 2 * radius;
    }
}
