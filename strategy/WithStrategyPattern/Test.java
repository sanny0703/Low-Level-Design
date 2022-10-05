package WithStrategyPattern;

import WithStrategyPattern.model.GoodsVehicle;
import WithStrategyPattern.model.OffRoadVehicle;
import WithStrategyPattern.model.SportsVehicle;
import WithStrategyPattern.model.Vehicle;

public class Test {
    public static void main(String[] args) {
        Vehicle goodVehicle = new GoodsVehicle();
        goodVehicle.drive();
        Vehicle sportsVehicle = new SportsVehicle();
        sportsVehicle.drive();
        Vehicle offRoadVehicle = new OffRoadVehicle();
        offRoadVehicle.drive();
    }
}
