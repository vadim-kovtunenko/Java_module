package Java.Lesson7.task2.dispatcher;

import Java.Lesson7.task2.entity.GroundTransport;

public class GroundTransportDispatcher implements Dispatcher<GroundTransport> {
    @Override
    public boolean validateRoute(GroundTransport transport, Route route, double fuelAmount) {
        return false;
    }

    @Override
    public double calculateFuel(GroundTransport transport, Route route) {
        return 0;
    }
}