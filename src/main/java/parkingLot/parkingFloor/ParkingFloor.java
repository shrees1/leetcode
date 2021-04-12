package parkingLot.parkingFloor;


import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import parkingLot.enums.ParkingType;
import parkingLot.enums.PersonType;
import parkingLot.enums.VehicleType;
import parkingLot.parkingSlot.IParkingSlot;
import parkingLot.parkingSlot.ParkingSlot;
import parkingLot.parkingSummary.ParkingSummary;
import parkingLot.vehicle.Vehicle;

public class ParkingFloor implements IParkVehicle {

  int floorNumber;
  int[][] dir = new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
  IParkingSlot[][] parkingLayOut = new ParkingSlot[4][5];
  Set<IParkingSlot> partiallyFilledBikeSlots = new HashSet<>();
  Set<IParkingSlot> partiallyFilledCarSlot = new HashSet<>();

  public ParkingFloor(int floorNumber) {
    this.floorNumber = floorNumber;
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 5; j++) {
        parkingLayOut[i][j] = new ParkingSlot(i, j, floorNumber);
      }
    }
  }

  /**
   * Method returns parkingLocation based on vehicle and person type.
   *
   * @param vehicleType VehicleType.
   * @param personType  PersonType.
   * @return IParkingSlot.
   */
  @Override
  public IParkingSlot getParkingLocation(VehicleType vehicleType, PersonType personType) {
    if (PersonType.SENIOR == personType) {
      Optional<IParkingSlot> seniorSlot = Optional.empty();
      if (vehicleType == VehicleType.BIKE) {
        seniorSlot = partiallyFilledBikeSlots.stream()
            .filter(slot -> slot.isLowerLevelAvailable())
            .findFirst();
      }
      if (vehicleType == VehicleType.CAR) {
        seniorSlot = partiallyFilledCarSlot.stream()
            .filter(slot -> slot.isLowerLevelAvailable())
            .findFirst();
      }
      if (seniorSlot.isPresent()) {
        return seniorSlot.get();
      }
    } else if (personType == PersonType.ROYAL) {
      for (int j = 0; j < 5; j++) {
        for (int i = 0; i < 4; i++) {
          if (parkingLayOut[i][j].isEmpty()) {
            boolean isAdjacentEmpty = true;
            for (int k = 0; k < 4; k++) {
              int nX = i + dir[k][0];
              int nY = j + dir[k][1];
              isAdjacentEmpty =
                  isAdjacentEmpty && (isInBoundary(nX, nY) ? parkingLayOut[nX][nY].isEmpty()
                      : true);
            }
            if (isAdjacentEmpty) {
              return parkingLayOut[i][j];
            }
          }
        }
      }
    } else {
      Optional<IParkingSlot> commonSlot = Optional.empty();
      if (vehicleType == VehicleType.BIKE) {
        commonSlot = partiallyFilledBikeSlots.stream()
            .filter(slot -> !slot.isFull())
            .findFirst();
      }
      if (vehicleType == VehicleType.CAR) {
        commonSlot = partiallyFilledCarSlot.stream()
            .filter(slot -> !slot.isFull())
            .findFirst();
      }
      if (commonSlot.isPresent()) {
        return commonSlot.get();
      }

    }
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 5; j++) {
        if (parkingLayOut[i][j].isEmpty()) {
          return parkingLayOut[i][j];
        }
      }
    }
    return null;
  }
//Boundary condition.
  private boolean isInBoundary(int x, int y) {
    return x >= 0 && y >= 0 && x < 4 && y < 5 ? true : false;
  }

  /**
   * Method to park the vehicle.
   *
   * @param parkingSlot IParkingSlot.
   * @param vehicle     Vehicle.
   */
  @Override
  public void parkVehicle(IParkingSlot parkingSlot, Vehicle vehicle) {
    if (vehicle.getOwnerType() == PersonType.ROYAL) {
      for (int k = 0; k < 4; k++) {
        int nX = parkingSlot.getPosition()[0] + dir[k][0];
        int nY = parkingSlot.getPosition()[1] + dir[k][1];
        if (isInBoundary(nX, nY)) {
          parkingLayOut[nX][nY].reserve();
        }
      }
    }
    parkingSlot.parkVehicle(vehicle);
    if (parkingSlot.isFull()) {
      if (vehicle.getVehicleType() == VehicleType.CAR) {
        partiallyFilledCarSlot.remove(parkingSlot);
      } else {
        partiallyFilledBikeSlots.remove(parkingSlot);
      }
    } else {

      if (vehicle.getVehicleType() == VehicleType.CAR) {
        partiallyFilledCarSlot.add(parkingSlot);
      } else {
        partiallyFilledBikeSlots.add(parkingSlot);
      }
    }
  }

  /**
   * Method to unpark the Vehicle.
   *
   * @param x       int.
   * @param y       int.
   * @param vehicle Vehicle.
   */
  @Override
  public void unParkVehicle(int x, int y, Vehicle vehicle) {
    IParkingSlot parkingSlot = parkingLayOut[x][y];
    if (vehicle.getOwnerType() == PersonType.ROYAL) {
      for (int k = 0; k < 4; k++) {
        int nX = x + dir[k][0];
        int nY = y + dir[k][1];
        if (isInBoundary(nX, nY)) {
          parkingLayOut[nX][nY].unReserved();
        }
      }
    }
    parkingSlot.unParkVehicle(vehicle);
    if (parkingSlot.isFull()) {
      if (vehicle.getVehicleType() == VehicleType.CAR) {
        partiallyFilledCarSlot.remove(parkingSlot);
      } else {
        partiallyFilledBikeSlots.remove(parkingSlot);
      }
    } else {

      if (vehicle.getVehicleType() == VehicleType.CAR) {
        partiallyFilledCarSlot.add(parkingSlot);
      } else {
        partiallyFilledBikeSlots.add(parkingSlot);
      }
    }
  }

  /**
   * Method to get the ParkingSummary of number of cars and bikes parked.
   *
   * @return ParkingSummary.
   */
  @Override
  public ParkingSummary getParkingSummary() {
    int emptyParkingSlot = 0;
    int numberOfParkedCar = 0;
    int numberOfParkedBike = 0;
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 5; j++) {
        IParkingSlot parkingSlot = parkingLayOut[i][j];
        if (parkingSlot.isEmpty()) {
          emptyParkingSlot += 1;
        }
        if (parkingSlot.getParkingType() == ParkingType.BIKE) {
          numberOfParkedBike += parkingSlot.getParkedVehicleCount();
        } else {
          numberOfParkedCar += parkingSlot.getParkedVehicleCount();
        }
      }
    }
    return new ParkingSummary(emptyParkingSlot, numberOfParkedBike, numberOfParkedCar, floorNumber);
  }

}
