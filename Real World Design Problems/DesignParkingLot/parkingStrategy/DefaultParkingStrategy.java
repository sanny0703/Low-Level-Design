package DesignParkingLot.parkingStrategy;

import DesignParkingLot.model.ParkingSpot;

public class DefaultParkingStrategy implements ParkingSpotStrategy {
    @Override
    public ParkingSpot find() {
        // returns any vacant parking spot
        return null;
    }
}
