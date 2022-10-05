package AbstarctFactory.luxury;

import AbstarctFactory.Car;

public class Bmw implements Car {
    @Override
    public void drive() {
        System.out.println("This is BMW");
    }
}
