package Java.Lesson6.task5;

public class Square implements Shape {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String areaFormula() {
        return "Area of square: A = s * s, where `s` - is one side of the square";
    }
}