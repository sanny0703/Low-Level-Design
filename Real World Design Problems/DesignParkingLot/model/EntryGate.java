package DesignParkingLot.model;

import DesignParkingLot.factory.MangerFactory;
import DesignParkingLot.manager.ParkingSpotManager;

public class EntryGate {
    private int gateId;
    private ParkingSpotManager manager;

    public EntryGate(int gateId) {
        this.gateId = gateId;
    }

    public Ticket bookSpot(Vehicle vehicle) {
        manager = MangerFactory.createSpotManager(vehicle.getType());
        ParkingSpot spot = manager.findParkingSpot();
        return manager.parkVehicle(spot);
    }
}
