package parkingLot.parkingFloor;

import parkingLot.parkingSummary.ParkingSummary;
import parkingLot.enums.PersonType;
import parkingLot.enums.VehicleType;
import parkingLot.parkingSlot.IParkingSlot;
import parkingLot.vehicle.Vehicle;

public interface IParkVehicle {

  IParkingSlot getParkingLocation(VehicleType vehicleType, PersonType personType);

  void parkVehicle(IParkingSlot parkingSlot, Vehicle vehicle);

  void unParkVehicle(int x, int y, Vehicle vehicle);

  ParkingSummary getParkingSummary();
}
