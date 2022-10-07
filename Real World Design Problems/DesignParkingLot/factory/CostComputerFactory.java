package DesignParkingLot.factory;

import DesignParkingLot.cost.CostComputer;
import DesignParkingLot.cost.FourWheelerComputer;
import DesignParkingLot.cost.TwoWheelerComputer;
import DesignParkingLot.model.Ticket;

public class CostComputerFactory {
    public static CostComputer createCostComputer(Ticket ticket) {
        return switch (ticket.getParkingSpot().getVehicle().getType()) {
            case TWO_WHEELER -> new TwoWheelerComputer(ticket);
            case FOUR_WHEELER -> new FourWheelerComputer(ticket);
        };
    }
}
