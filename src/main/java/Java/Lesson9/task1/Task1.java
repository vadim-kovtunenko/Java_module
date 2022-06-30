package Java.Lesson9.task1;

import Java.Lesson9.task1.ComparatorString;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task1 {

    public static void executeTask() {
        // можно использовать просто new ArrayList<>()
        List<String> names = new ArrayList<String>();
        names.add("Roma");
        names.add(0, "Oksana"); // [Oksana, Roma]
        names.add("Nastya"); // [Oksana, Roma, Nastya]
        names.remove("Roma"); // [Oksana, Nastya]
        int size = names.size(); // 2

        // прохождение по элементам из списка names
        for (String name : names) {
            System.out.println(name);
        }

        // прохождение по элементам из списка names используя итератор
        Iterator<String> iteratorName = names.iterator();
        while (iteratorName.hasNext()) {
            iteratorName.remove();
            System.out.println(iteratorName.next());
        }
        names.add("Test");
        // получение нового итератора после изменения списка
        iteratorName = names.iterator();
        while (iteratorName.hasNext()) {
            System.out.println(iteratorName.next());
        }

    }


    // возвращает отсортированную копию array, сам array не изменяется
    public static List<String> sortList(List<String> array) {
        List<String> copy = new ArrayList<>(array);
        copy.sort(new ComparatorString());
        return copy;
    }

    public static void main(String[] args) {
        List<String> unsortedArray = new ArrayList<>();

        unsortedArray.add("a");
        unsortedArray.add("b");
        unsortedArray.add("a2");
        unsortedArray.add("c");

        List<String> sortedArray = sortList(unsortedArray);

        System.out.println("Unsorted list:");
        for (String element : unsortedArray) {
            System.out.println(element);
        }

        System.out.println("Sorted list:");
        for (String element : sortedArray) {
            System.out.println(element);
        }


    }
}
