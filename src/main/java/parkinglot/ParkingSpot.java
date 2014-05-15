package parkinglot;

import parkinglot.vehicle.Vehicle;

public class ParkingSpot {
    private final Vehicle vehicle;

    public ParkingSpot(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
