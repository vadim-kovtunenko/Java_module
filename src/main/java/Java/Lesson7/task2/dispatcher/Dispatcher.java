package Java.Lesson7.task2.dispatcher;

import Java.Lesson7.task2.entity.GroundTransport;

public interface Dispatcher<T extends GroundTransport> {

    boolean validateRoute(T transport, Route route, double fuelAmount);

    double calculateFuel(T transport, Route route);
}
