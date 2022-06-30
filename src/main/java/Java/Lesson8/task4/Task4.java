package Java.Lesson8.task4;

import Java.Lesson8.utils.IOUtils;

public class Task4 {

    private static final String[] brands = {"BMW", "Ford", "Toyota", "Honda", "VW"};
    private static final double[] prices = {2000, 20000, 30000, 40000, 200000};
    private static final double[] speed = {170, 190, 230, 250, 400};

    public static void executeTask() {
        for (int i = 0; i < 5; i++) {
            Car car = new Car();
            car.setBrand(brands[IOUtils.getRandomInt(0, 4)]);
            car.setPrice(prices[IOUtils.getRandomInt(0, 4)]);
            car.setSpeed(speed[IOUtils.getRandomInt(0, 4)]);

            try {
                car.start();
            } catch (CarCannotStartException e) {
                System.out.println("Error occurred while starting car: " + e.getMessage());
            }
        }
    }
}