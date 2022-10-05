package AbstarctFactory;

public class TestAbstractFactory {
    public static void main(String[] args) {
        CarsFactory factory = CarsFactory.getInstance();
        Car bmw = factory.createCar(CarType.BMW);
        bmw.drive();
        Car swift = factory.createCar(CarType.SWIFT);
        swift.drive();
    }
}
