package Java.Lesson6.task6;

public class Task6 {

    public static void executeTask() {
        Rectangle firstRectangle = new Rectangle(5, 4);
        Rectangle secondRectangle = new Rectangle(6, 3);
        RectangleComparator rectangleComparator = new RectangleComparator();
        int comparisonResult = rectangleComparator.compare(firstRectangle, secondRectangle);
        System.out.println("Result of comparing rectangles (first to second): " + comparisonResult);
    }
}
