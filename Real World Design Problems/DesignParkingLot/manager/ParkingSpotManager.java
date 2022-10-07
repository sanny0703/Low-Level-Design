package DesignParkingLot.manager;

import DesignParkingLot.model.ParkingSpot;
import DesignParkingLot.model.Ticket;
import DesignParkingLot.parkingStrategy.ParkingSpotStrategy;

import java.util.List;

public class ParkingSpotManager {
    private final List<ParkingSpot> parkingSpotList;
    private ParkingSpotStrategy strategy;

    public ParkingSpotManager(List<ParkingSpot> parkingSpotList, ParkingSpotStrategy strategy) {
        this.parkingSpotList = parkingSpotList;
        this.strategy = strategy;
    }

    public ParkingSpotStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(ParkingSpotStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean addParkingSpot(ParkingSpot parkingSpot) {
        return parkingSpotList.add(parkingSpot);
    }

    public void removeParkingSpot(ParkingSpot parkingSpot) {
        parkingSpotList.remove(parkingSpot);
    }

    public ParkingSpot findParkingSpot() {
        return strategy.find();
    }

    public Ticket parkVehicle(ParkingSpot parkingSpot) {

        return null;
    }

    public void removeVehicle(ParkingSpot parkingSpot) {

    }
}
