package parkinglot.vehicle;

import parkinglot.ParkingSpot;
import parkinglot.VehicleSpot;

public abstract class Vehicle {
    private ParkingSpot spot;

    public boolean canPark(ParkingSpot spot){
        return spot instanceof VehicleSpot;
    }

    public void park(ParkingSpot spot){
        this.spot = spot;
    }

    public ParkingSpot getSpot() {
        return spot;
    }

    public boolean isParked() {
        return getSpot() != null;
    }

    public void unPark() {
        spot = null;
    }
}
