package shapes;
import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();

        boolean test;

        do {
            Circle circle = new Circle(input.getDouble());
            System.out.println("The area of the circle is " + circle.getArea());
            System.out.println("The circumference of the circle is " + circle.getCircumference());
            System.out.println("\nWould you like to make another?");
            test = input.yesNo();
            if (!test) {
                System.out.println("Total number of circles made is: " + circle.showCount());
            }
        } while (test);


    }
}

