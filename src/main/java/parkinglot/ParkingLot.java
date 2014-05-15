package parkinglot;

import parkinglot.vehicle.Vehicle;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ParkingLot {

    private final List<ParkingSpot> availableSpots = new LinkedList<ParkingSpot>();

    public ParkingLot(){
        for(int i=1; i<=80; i++){
            availableSpots.add(new VehicleSpot(null));
        }
        for(int i=1; i<=10; i++){
            availableSpots.add(new MotorcycleSpot(null));
        }
        for(int i=1; i<=10; i++){
            availableSpots.add(new HandicappedVehicleSpot(null));
        }
    }
    public void park(Vehicle vehicle){
        Iterator<ParkingSpot> i = availableSpots.iterator();
        while(i.hasNext() && !vehicle.isParked()){
            ParkingSpot spot = i.next();
            if(vehicle.canPark(spot)) {
                vehicle.park(spot);
                i.remove();
            }
        }

        if(!vehicle.isParked()){
            throw new RuntimeException("Could not park vehicle: " + vehicle);
        }
    }

    public void unPark(Vehicle vehicle){
        if(!vehicle.isParked()){
            throw new RuntimeException("Vehicle is not parked: " + vehicle);
        }
        availableSpots.add(vehicle.getSpot());
        vehicle.unPark();
    }
}
