package parkinglot.vehicle;


import parkinglot.MotorcycleSpot;
import parkinglot.ParkingSpot;
public class Motorcycle extends Vehicle {
    @Override
    public boolean canPark(ParkingSpot spot) {
        return super.canPark(spot) || spot instanceof MotorcycleSpot;
    }
}
