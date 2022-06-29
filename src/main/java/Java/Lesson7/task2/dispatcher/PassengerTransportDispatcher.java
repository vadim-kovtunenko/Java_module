package Java.Lesson7.task2.dispatcher;

import Java.Lesson7.task2.entity.PassengerTransport;

public class PassengerTransportDispatcher implements Dispatcher<PassengerTransport> {

    @Override
    public boolean validateRoute(PassengerTransport transport, Route route, double fuelAmount) {
        boolean passengerCountIsValid = transport.validatePassengerCount(route.getPassengerCount());
        if (!passengerCountIsValid) {
            return false;
        }
        double requiredFuel = calculateFuel(transport, route);
        return fuelAmount > requiredFuel;
    }

    @Override
    public double calculateFuel(PassengerTransport transport, Route route) {
        double duration = route.getDuration();
        return transport.calculateConsumptedFuel(duration);
    }
}