package DesignParkingLot.model;

import DesignParkingLot.cost.CostComputer;
import DesignParkingLot.factory.CostComputerFactory;

public class Exit {
    private Ticket ticket;
    private CostComputer costComputer;

    public Exit(Ticket ticket) {
        this.ticket = ticket;
        costComputer = CostComputerFactory.createCostComputer(ticket);
    }

    public int calculateCost() {
        return costComputer.compute();
    }

}
