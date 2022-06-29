package Java.Lesson6.task5;

public class Circle implements Shape {

    private double radius;

    public Circle(double side) {
        this.radius = side;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String areaFormula() {
        return "Area of circle: A = π*r², where `r` - is radius of circle, `π` - math constant";
    }
}