public class Train {
    // a collection of cars...

    // this way, it's crap
    Car car1;
    Car car2;
    Car car3;

    // this way is better
    // but ... array...immutable
    Car[] cars;

    // this way... VERY FLEXIBLE
    Car firstCar;
}

class Car {
    double capacity;
    int numPassengers;
    double tonnage;

    Car nextCar;
}