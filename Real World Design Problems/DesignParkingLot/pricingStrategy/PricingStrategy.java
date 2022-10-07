package DesignParkingLot.pricingStrategy;

import DesignParkingLot.model.Ticket;

public interface PricingStrategy {
    int calculate(Ticket ticket);
}
