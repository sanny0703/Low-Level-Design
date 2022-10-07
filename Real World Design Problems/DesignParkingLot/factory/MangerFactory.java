package DesignParkingLot.factory;

import DesignParkingLot.manager.FourWheelerParkingSpotManager;
import DesignParkingLot.manager.ParkingSpotManager;
import DesignParkingLot.manager.TwoWheelerParkingSpotManager;
import DesignParkingLot.utils.VehicleType;

public class MangerFactory {
    public static ParkingSpotManager createSpotManager(VehicleType type) {
        return switch (type) {
            case TWO_WHEELER -> new TwoWheelerParkingSpotManager();
            case FOUR_WHEELER -> new FourWheelerParkingSpotManager();
        };
    }
}
