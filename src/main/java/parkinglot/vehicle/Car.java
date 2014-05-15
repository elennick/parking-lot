package parkinglot.vehicle;


import parkinglot.HandicappedVehicleSpot;
import parkinglot.MotorcycleSpot;
import parkinglot.ParkingSpot;

public class Car extends Vehicle {
    @Override
    public boolean canPark(ParkingSpot spot) {
        return super.canPark(spot) && !(spot instanceof HandicappedVehicleSpot) &&
                !(spot instanceof MotorcycleSpot);
    }
}
