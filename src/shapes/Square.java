package shapes;

public class Square extends Rectangle {
//    private double side;

    public Square(double side) {
        super (side, side);
//        this.side = side;
    }

    public double getArea() {
        return Math.pow(this.length,2);
    }

    public double getPerimeter() {
        return Math.pow(this.length,4);
    }
}
