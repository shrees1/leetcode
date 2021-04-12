package parkingLot.parkingLot;


import java.util.List;
import parkingLot.parkingSummary.ParkingSummary;
import parkingLot.enums.PersonType;
import parkingLot.enums.VehicleType;

public interface IParkingLot {
    boolean parkVehicle(VehicleType vehicleType, PersonType personType, String vehicleId);
    boolean unParkVehicle(String vehicleId);
    List<ParkingSummary> getParkingSummary();
}
