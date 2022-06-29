// путь к папке в проекте, в которой находится наш класс
package Java.Lesson3.utils;

// подключение класса Scanner из стандартной библиотеки java.util

import java.util.Scanner;

// объявление класса Utils со стандартным модификатором доступа (он не указан - значит стандартный)
public class IOUtils {

    // объявление и инициализация переменной scanner с типом Scanner
    // static - переменная статическая, т.е. принадлежит самому классу
    // private - модификатор доступа, переменная доступна только внутри данного класса
    // - в методах readTriangleSide и printText
    private static final Scanner scanner = new Scanner(System.in);

    // объявление публичного статического метода для вывода текста
    // void - метод ничего не возвращает
    // message - аргумент метода с типом String
    public static void printText(String message) {
        // вывод текста на экран
        System.out.println(message);
    }

    // чтение целого числа из консоли
    public static int readInteger() {
        return scanner.nextInt();
    }

    // чтение дробного числа из консоли
    public static double readDouble() {
        return scanner.nextDouble();
    }

    /*
     * Получение случайного целого числа в диапозоне [min, max]
     */

    public static int getRandomInt(int min, int max) {
        return (int) Math.round((Math.random() * (max - min)) + min);
    }

    /*
     * Получение случайного целого числа в диапозоне [min, max]
     */

    public static double getRandomDouble(double min, double max) {
        return (Math.random() * (max - min)) + min;
    }

    /*
     * Вывод массива чисел с типом double
     */
    public static void printArray(double[] array) {
        for (double element : array) {
            System.out.print(element + " ");
        }
        System.out.print("\n");
    }

    /*
     * Вывод массива чисел с типом int
     */
    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.print("\n");
    }


    public static String readText() {
        return scanner.next();
    }
}