package DesignParkingLot.pricingStrategy;

import DesignParkingLot.model.Ticket;

import java.util.concurrent.TimeUnit;

public class MinutesPricingStrategy implements PricingStrategy {
    @Override
    public int calculate(Ticket ticket) {
        long entryTime = ticket.getEntryTimeMillis();
        long currentTime = System.currentTimeMillis();
        return (int) TimeUnit.MILLISECONDS.toMinutes(entryTime - currentTime);
    }
}
