package AbstarctFactory.basic;

import AbstarctFactory.Car;

public class Alto implements Car {
    @Override
    public void drive() {
        System.out.println("This is Alto");
    }
}
