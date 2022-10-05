package WithDecorator.decorators;

import WithDecorator.Car;

public class PowerSteeringCar extends Car {
    private final Car car;

    public PowerSteeringCar(Car car) {
        this.car = car;
    }

    @Override
    public void drive() {
        car.drive();
        System.out.println("add Power Steering");
    }
}
