package WithoutStrategy;

public class OffRoadVehicle extends Vehicle {
    @Override
    void drive() {

        // code duplication {@see WithoutStrategy.SportsVehicle.class#drive()}
        System.out.println("Sports drive capability");
    }
}
