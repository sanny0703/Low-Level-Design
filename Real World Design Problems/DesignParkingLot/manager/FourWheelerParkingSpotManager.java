package DesignParkingLot.manager;

import DesignParkingLot.model.ParkingSpot;
import DesignParkingLot.parkingStrategy.NearToEntranceAndElevatorParkingStrategy;

import java.util.List;

public class FourWheelerParkingSpotManager extends ParkingSpotManager {
    private static final List<ParkingSpot> fourWheelerParkingSpotList = List.of(new ParkingSpot(2));

    public FourWheelerParkingSpotManager() {
        this(fourWheelerParkingSpotList);
    }

    public FourWheelerParkingSpotManager(List<ParkingSpot> parkingSpotList) {
        super(parkingSpotList, new NearToEntranceAndElevatorParkingStrategy());
    }
}
