// путь к папке в проекте, в которой находится наш класс
package Java.Lesson1.tasks;

import Java.Lesson1.utils.IOUtils;

// объявление публичного класса Task6
public class Task6 {

    // у класса нет переменных, только методы triangleExistsMethod1, triangleExistsMethod2, main

    // объявление статического метода triangleExistsMethod1
    // a, b, c с типом int - аргументы метода
    // boolean - тип возвращаемой переменной
    // static - метод статический
    // public - метод публичный
    public static boolean triangleExistsMethod1(int a, int b, int c) {
        // возвращает true если выполняется все три условия:
        // a + b > c, a + c > b, b + c > a;
        // если хотя бы одно из условий не выполняется - возвращает false
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    // объявление статического метода triangleExistsMethod2
    // a, b, c с типом int - аргументы метода
    // boolean - тип возвращаемой переменной
    // static - метод статический
    // public - метод публичный
    public static boolean triangleExistsMethod2(int a, int b, int c) {
        // if - условный оператор
        if (a + b <= c
                || a + c <= b
                || b + c <= a) {
            // треугольник не существует
            return false;
        }
        // треугольник существует
        return true;
    }

    public static void executeTask() {
        // объявляем и иницилазируем первую сторону треугольника,
        // используя публичный статический метод readTriangleSide класса Utils, который находится в этой же папке
        int a = IOUtils.readTriangleSide();
        // объявляем и иницилазируем вторую сторону треугольника
        int b = IOUtils.readTriangleSide();
        // объявляем и иницилазируем третью сторону треугольника
        int c = IOUtils.readTriangleSide();
        // проверяем существует ли такой треугольник первым способом
        boolean triangleExistsMethod1 = triangleExistsMethod1(a, b, c);
        // выводим результат на экран
        IOUtils.printText("Triangle exists (method 1): " + triangleExistsMethod1);
        // проверяем существует ли такой треугольник вторым способом
        boolean triangleExistsMethod2 = triangleExistsMethod2(a, b, c);
        // выводим результат на экран
        IOUtils.printText("Triangle exists (method 2): " + triangleExistsMethod2);
    }
}