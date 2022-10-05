package WithoutDecorator;

public class PowerSteeringCar extends Car {

    @Override
    public void drive() {
        System.out.println("Car with power steering");
    }
}
