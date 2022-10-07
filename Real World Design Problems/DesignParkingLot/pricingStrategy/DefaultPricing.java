package DesignParkingLot.pricingStrategy;

import DesignParkingLot.model.Ticket;

public class DefaultPricing implements PricingStrategy {
    @Override
    public int calculate(Ticket ticket) {
        return 10;
    }
}
