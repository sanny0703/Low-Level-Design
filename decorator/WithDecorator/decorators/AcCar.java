package WithDecorator.decorators;

import WithDecorator.Car;

public class AcCar extends Car {
    private final Car car;

    public AcCar(Car car) {
        this.car = car;
    }

    @Override
    public void drive() {
        car.drive();
        System.out.println("add Ac");
    }

}
