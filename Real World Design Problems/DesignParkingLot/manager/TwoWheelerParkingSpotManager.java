package DesignParkingLot.manager;

import DesignParkingLot.model.ParkingSpot;
import DesignParkingLot.parkingStrategy.NearToEntranceParkingStrategy;

import java.util.List;

public class TwoWheelerParkingSpotManager extends ParkingSpotManager {
    private static final List<ParkingSpot> twoWheelerParkingSpotList = List.of(new ParkingSpot(1));

    public TwoWheelerParkingSpotManager() {
        this(twoWheelerParkingSpotList);
    }

    public TwoWheelerParkingSpotManager(List<ParkingSpot> parkingSpotList) {
        super(parkingSpotList, new NearToEntranceParkingStrategy());
    }
}
