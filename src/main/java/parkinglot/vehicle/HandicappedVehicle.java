package parkinglot.vehicle;

import parkinglot.HandicappedVehicleSpot;
import parkinglot.ParkingSpot;

public class HandicappedVehicle extends Vehicle {
    @Override
    public boolean canPark(ParkingSpot spot) {
        return super.canPark(spot) || spot instanceof HandicappedVehicleSpot;
    }
}
