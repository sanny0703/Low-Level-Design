package DesignParkingLot.cost;

import DesignParkingLot.model.Ticket;
import DesignParkingLot.pricingStrategy.HourlyPricing;
import DesignParkingLot.pricingStrategy.PricingStrategy;

public class FourWheelerComputer extends CostComputer {
    public FourWheelerComputer(Ticket ticket) {
        super(new HourlyPricing(), ticket);
    }

    public FourWheelerComputer(PricingStrategy strategy, Ticket ticket) {
        super(strategy, ticket);
    }
}
