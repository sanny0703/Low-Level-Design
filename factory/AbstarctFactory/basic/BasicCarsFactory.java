package AbstarctFactory.basic;

import AbstarctFactory.Car;
import AbstarctFactory.CarType;

public class BasicCarsFactory {
    private static BasicCarsFactory instance;

    private BasicCarsFactory() {

    }

    public static BasicCarsFactory getInstance() {
        if (instance == null)
            instance = new BasicCarsFactory();
        return instance;
    }

    public Car createCar(CarType type) {
        return switch (type) {
            case ALTO -> new Alto();
            case SWIFT -> new Swift();
            default -> null;
        };
    }
}
