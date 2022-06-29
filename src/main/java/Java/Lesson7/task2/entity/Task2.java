package Java.Lesson7.task2.entity;

import Java.Lesson7.task2.dispatcher.Dispatcher;

import Java.Lesson7.task2.dispatcher.FreightTransportDispatcher;
import Java.Lesson7.task2.dispatcher.PassengerTransportDispatcher;

public class Task2 {

    public static void executeTask() {
        Transport transport = new Transport(12, 20);
        Dispatcher<PassengerTransport> passengerTransportDispatcher = new PassengerTransportDispatcher();
        Dispatcher<FreightTransport> freightTransportDispatcher = new FreightTransportDispatcher();
    }
}