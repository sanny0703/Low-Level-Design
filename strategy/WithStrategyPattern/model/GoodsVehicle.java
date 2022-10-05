package WithStrategyPattern.model;

import WithStrategyPattern.drive.DriveStrategy;
import WithStrategyPattern.drive.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle {
    public GoodsVehicle() {
        this(new NormalDriveStrategy());
    }

    public GoodsVehicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}
