package AbstarctFactory.luxury;

import AbstarctFactory.Car;

public class Benz implements Car {
    @Override
    public void drive() {
        System.out.println("This is Benz");
    }
}
