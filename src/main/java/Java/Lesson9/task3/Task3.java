package Java.Lesson9.task3;


import Java.Lesson9.task3.Receipt;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Task3 {

    public static void executeTask() {
        // можно просто new HashMap<>();
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Text");
        map.put(2, "Text");

        map.put(2, "newText"); // перетираем значение "Text"
        map.putIfAbsent(1, "RedText"); // не перетрем, т.к. уже есть пара с ключом 1

        map.get(1); // "Text"
        Set<Map.Entry<Integer, String>> entrySet = map.entrySet(); // набор записей
        Set<Integer> keys = map.keySet(); // набор уникальных ключей [1,2]
        Collection<String> values = map.values(); // набор значений ["Text", "newText"]

        for (Map.Entry<Integer, String> entry : entrySet) {
            System.out.println("Entry: key=" + entry.getKey() + ", value=" + entry.getValue());
        }
    }

    public static void createCookBook() {
        HashMap<Integer, Receipt> cookBook = new HashMap<>();
        Receipt borsch = new Receipt("Water, meat, ..", "Unknown");
        cookBook.put(borsch.getReceiptId(), borsch);

        Receipt fries = new Receipt("Potato, oil", "Unknown");
        cookBook.put(fries.getReceiptId(), fries);

        Receipt deletedReceipt = cookBook.remove(fries.getReceiptId());
        deletedReceipt.setAuthorName("Roman");

        System.out.println(deletedReceipt.equals(fries)); // true

        for (Receipt receipt : cookBook.values()) {
            System.out.println(receipt);
        }


    }

    public static void main(String[] args) {
        createCookBook();
    }
}