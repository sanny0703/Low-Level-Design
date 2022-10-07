package DesignParkingLot.model;

import DesignParkingLot.utils.VehicleType;

public class Vehicle {
    private int vehicleNumber;
    private VehicleType type;

    public Vehicle(int vehicleNumber, VehicleType type) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
    }

    public int getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(int vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }
}
