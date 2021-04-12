package parkingLot.parkingLot;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import parkingLot.enums.PersonType;
import parkingLot.enums.VehicleType;
import parkingLot.parkingFloor.IParkVehicle;
import parkingLot.parkingFloor.ParkingFloor;
import parkingLot.parkingSlot.IParkingSlot;
import parkingLot.parkingSummary.ParkingSummary;
import parkingLot.vehicle.Vehicle;

public class ParkingLot implements IParkingLot {

  List<IParkVehicle> parkingFloors;
  Map<String, IParkingSlot> parkingMap = new HashMap<>();
  Map<String, Vehicle> vehicleMap = new HashMap<>();

  public ParkingLot(int numberOfFloor) {
    parkingFloors = new ArrayList<>();
    for (int i = 0; i < numberOfFloor; i++) {
      parkingFloors.add((IParkVehicle) new ParkingFloor(i));
    }
  }

  /**
   * Check if the particular vehicle is still parked.
   *
   * @param vehicleType VehicleType.
   * @param personType  PersonType.
   * @param vehicleId   String.
   * @return boolean value.
   */
  @Override
  public boolean parkVehicle(VehicleType vehicleType, PersonType personType, String vehicleId) {
    if (vehicleMap.get(vehicleId) == null) {
      Optional<IParkingSlot> parkingLocation = parkingFloors.stream()
          .map(parkingFloor -> parkingFloor.getParkingLocation(vehicleType, personType))
          .filter(parkingLoc -> Objects.nonNull(parkingLoc))
          .findFirst();
      if (parkingLocation.isPresent()) {
        int[] pos = parkingLocation.get().getPosition();
        parkingMap.put(vehicleId, parkingLocation.get());
        Vehicle vehicle = new Vehicle(vehicleId, vehicleType, personType);
        vehicleMap.put(vehicleId, vehicle);
        parkingFloors.get(pos[2]).parkVehicle(parkingLocation.get(), vehicle);
        return true;
      }

    }
    return false;
  }

    /**
     * Check if the particular vehicle is unparked.
     *
     * @param vehicleId String.
     * @return boolean value.
     */
  @Override
  public boolean unParkVehicle(String vehicleId) {
    if (parkingMap.get(vehicleId) != null && vehicleMap.get(vehicleId) != null) {
      int[] parkingLocation = parkingMap.get(vehicleId).getPosition();
      parkingMap.remove(vehicleId);
      parkingFloors.get(parkingLocation[2])
          .unParkVehicle(parkingLocation[0], parkingLocation[1], vehicleMap.get(vehicleId));
      vehicleMap.remove(vehicleId);
      return true;
    }
    return false;
  }

  @Override
  public List<ParkingSummary> getParkingSummary() {
    return parkingFloors.stream()
        .map(parkingFloor -> parkingFloor.getParkingSummary())
        .collect(Collectors.toList());
  }
}
