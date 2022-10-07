package DesignParkingLot.model;

public class Ticket {
    private int ticketId;
    private long entryTimeMillis;
    private ParkingSpot parkingSpot;

    public Ticket(int ticketId, ParkingSpot parkingSpot) {
        this.ticketId = ticketId;
        this.entryTimeMillis = System.currentTimeMillis();
        this.parkingSpot = parkingSpot;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public long getEntryTimeMillis() {
        return entryTimeMillis;
    }

    public void setEntryTimeMillis(long entryTimeMillis) {
        this.entryTimeMillis = entryTimeMillis;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }
}
