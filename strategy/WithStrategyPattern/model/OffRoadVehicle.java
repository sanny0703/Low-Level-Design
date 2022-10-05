package WithStrategyPattern.model;

import WithStrategyPattern.drive.DriveStrategy;
import WithStrategyPattern.drive.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle {
    public OffRoadVehicle() {
        this(new SportsDriveStrategy());
    }

    public OffRoadVehicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}
