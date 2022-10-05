package WithDecorator;

import WithDecorator.decorators.AcCar;
import WithDecorator.decorators.PowerSteeringCar;

public class Test {
    public static void main(String[] args) {
        System.out.println("===== create a car with Ac=======");
        Car acCar = new AcCar(new Car());
        acCar.drive();
        System.out.println("===== create a car with Power Steering======");
        Car powerSteeringCar = new PowerSteeringCar(new Car());
        powerSteeringCar.drive();
        System.out.println("===== create a car with Ac and Power Steering========");
        Car acAndPowerSteeringCar = new PowerSteeringCar(new AcCar(new Car()));
        acAndPowerSteeringCar.drive();
    }
}
