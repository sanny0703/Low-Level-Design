package DesignParkingLot.model;

public class FourWheelerParkingSpot extends ParkingSpot {
    public FourWheelerParkingSpot(int id) {
        super(id);
    }

    @Override
    public int getPrice() {
        return 20;
    }
}
