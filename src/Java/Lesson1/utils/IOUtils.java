// путь к папке в проекте, в которой находится наш класс
package Java.Lesson1.utils;

// подключение класса Scanner из стандартной библиотеки java.util

import java.util.Scanner;

// объявление класса Utils со стандартным модификатором доступа (он не указан - значит стандартный)
public class IOUtils {

    // объявление и инициализация переменной scanner с типом Scanner
    // static - переменная статическая, т.е. принадлежит самому классу
    // private - модификатор доступа, переменная доступна только внутри данного класса
    // - в методах readTriangleSide и printText
    private static final Scanner scanner = new Scanner(System.in);

    // объявление публичного статического метода для считывания стороны треугольника
    // int - тип возвращаемой переменной
    public static int readTriangleSide() {
        // вызов метода printText с аргументом - литералом "Enter side of the triangle: "
        printText("Enter side of the triangle: ");
        // вызов у переменной класса scanner (описание выше) метода nextInt
        // для считывания следующего целого числа из консоли
        return scanner.nextInt();
    }

    // объявление публичного статического метода для вывода текста
    // void - метод ничего не возвращает
    // message - аргумент метода с типом String
    public static void printText(String message) {
        // вывод текста на экран
        System.out.println(message);
    }

    public static int readInteger() {
        return scanner.nextInt();
    }

    public static String readText() {
        return scanner.nextLine();
    }

    public static double readDouble() {
        return scanner.nextDouble();
    }
}