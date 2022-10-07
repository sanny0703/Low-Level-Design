package DesignParkingLot.model;

public class TwoWheelerParkingSpot extends ParkingSpot {
    public TwoWheelerParkingSpot(int id) {
        super(id);
    }

    @Override
    public int getPrice() {
        return 15;
    }
}
