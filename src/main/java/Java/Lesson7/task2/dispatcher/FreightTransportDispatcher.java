package Java.Lesson7.task2.dispatcher;

import Java.Lesson7.task2.entity.FreightTransport;

public class FreightTransportDispatcher implements Dispatcher<FreightTransport> {

    @Override
    public boolean validateRoute(FreightTransport transport, Route route, double fuelAmount) {
        if (route.getCapacity() < transport.getCarryingCapacity()) {
            return false;
        }
        double requiredFuel = calculateFuel(transport, route);
        return fuelAmount > requiredFuel;
    }

    @Override
    public double calculateFuel(FreightTransport transport, Route route) {
        double duration = route.getDuration();
        return transport.calculateConsumptedFuel(duration);
    }
}