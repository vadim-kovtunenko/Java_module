package Java.Lesson9.task1;

import java.util.Comparator;

public class ComparatorString implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
}
