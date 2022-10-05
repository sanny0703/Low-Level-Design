package AbstarctFactory.luxury;

import AbstarctFactory.Car;
import AbstarctFactory.CarType;

public class LuxuryCarsFactory {
    private static LuxuryCarsFactory instance;

    private LuxuryCarsFactory() {

    }

    public static LuxuryCarsFactory getInstance() {
        if (instance == null)
            instance = new LuxuryCarsFactory();
        return instance;
    }

    public Car createCar(CarType type) {
        return switch (type) {
            case BMW -> new Bmw();
            case BENZ -> new Benz();
            default -> null;
        };
    }
}
