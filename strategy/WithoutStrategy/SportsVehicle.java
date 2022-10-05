package WithoutStrategy;

public class SportsVehicle extends Vehicle {
    @Override
    void drive() {
        // code duplication same as @see OffRoadVehicle#drive()
        System.out.println("Sports drive capability");
    }
}
