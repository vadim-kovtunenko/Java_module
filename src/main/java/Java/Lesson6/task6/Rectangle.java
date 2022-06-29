package Java.Lesson6.task6;

public class Rectangle implements Comparable<Rectangle> {

    int a;
    int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int compareTo(Rectangle secondRectangle) {
        if (secondRectangle == null) {
            return 1;
        }
        return Integer.compare(calculateArea(), secondRectangle.calculateArea());
    }

    public int calculateArea() {
        return a * b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}