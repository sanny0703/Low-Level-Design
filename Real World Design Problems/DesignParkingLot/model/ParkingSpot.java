package DesignParkingLot.model;

public class ParkingSpot {
    private int id;
    private Vehicle vehicle;
    private boolean isEmpty;

    public ParkingSpot(int id) {
        this.id = id;
    }

    public int getPrice() {
        return 10;
    }

    public int getId() {
        return id;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public boolean parkVehicle(Vehicle vehicle) {
        if (!isEmpty)
            return false;
        this.vehicle = vehicle;
        isEmpty = false;
        return true;
    }

    public void removeVehicle() {
        vehicle = null;
        isEmpty = true;
    }
}
