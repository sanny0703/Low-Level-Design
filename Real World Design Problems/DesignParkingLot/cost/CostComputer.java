package DesignParkingLot.cost;

import DesignParkingLot.model.Ticket;
import DesignParkingLot.pricingStrategy.DefaultPricing;
import DesignParkingLot.pricingStrategy.PricingStrategy;

public class CostComputer {
    private PricingStrategy pricingStrategy;
    private Ticket ticket;

    public CostComputer(Ticket ticket) {
        this(new DefaultPricing(), ticket);
    }

    public CostComputer(PricingStrategy strategy, Ticket ticket) {
        pricingStrategy = strategy;
        this.ticket = ticket;
    }

    public int compute() {
        return pricingStrategy.calculate(ticket);
    }
}
