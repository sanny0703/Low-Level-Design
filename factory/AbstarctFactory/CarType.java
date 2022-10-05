package AbstarctFactory;

public enum CarType {
    SWIFT(CarClass.BASIC),
    ALTO(CarClass.BASIC),
    BENZ(CarClass.LUXURY),
    BMW(CarClass.LUXURY);

    private final CarClass carClass;

    CarType(CarClass carClass) {
        this.carClass = carClass;
    }

    public CarClass getCarClass() {
        return carClass;
    }
}
