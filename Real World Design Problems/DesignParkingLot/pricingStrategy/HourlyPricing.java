package DesignParkingLot.pricingStrategy;

import DesignParkingLot.model.Ticket;

import java.util.concurrent.TimeUnit;

public class HourlyPricing implements PricingStrategy {
    @Override
    public int calculate(Ticket ticket) {
        long entryTime = ticket.getEntryTimeMillis();
        long current = System.currentTimeMillis();
        return (int) TimeUnit.MILLISECONDS.toHours(entryTime - current) * ticket.getParkingSpot().getPrice();
    }
}
