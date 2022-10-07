package DesignParkingLot.cost;

import DesignParkingLot.model.Ticket;
import DesignParkingLot.pricingStrategy.MinutesPricingStrategy;
import DesignParkingLot.pricingStrategy.PricingStrategy;

public class TwoWheelerComputer extends CostComputer {
    public TwoWheelerComputer(Ticket ticket) {
        super(new MinutesPricingStrategy(), ticket);
    }

    public TwoWheelerComputer(Ticket ticket, PricingStrategy strategy) {
        super(strategy, ticket);
    }
}
