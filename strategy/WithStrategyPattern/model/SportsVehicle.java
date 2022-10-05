package WithStrategyPattern.model;

import WithStrategyPattern.drive.DriveStrategy;
import WithStrategyPattern.drive.SportsDriveStrategy;

public class SportsVehicle extends Vehicle {
    public SportsVehicle() {
        this(new SportsDriveStrategy());
    }

    public SportsVehicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}
