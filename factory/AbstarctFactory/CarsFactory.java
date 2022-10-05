package AbstarctFactory;

import AbstarctFactory.basic.BasicCarsFactory;
import AbstarctFactory.luxury.LuxuryCarsFactory;

public class CarsFactory {
    private static CarsFactory instance;

    private CarsFactory() {
    }

    public static CarsFactory getInstance() {
        if (instance == null)
            instance = new CarsFactory();
        return instance;
    }

    public Car createCar(CarType type) {
        return switch (type.getCarClass()) {
            case LUXURY -> LuxuryCarsFactory.getInstance().createCar(type);
            case BASIC -> BasicCarsFactory.getInstance().createCar(type);
        };
    }
}
