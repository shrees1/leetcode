package parkingLot.parkingSlot;


import parkingLot.enums.ParkingType;
import parkingLot.enums.PersonType;
import parkingLot.enums.VehicleType;
import parkingLot.vehicle.Vehicle;

public class ParkingSlot implements IParkingSlot {

  ParkingType parkingType;
  int lowerLevelCount = 0;
  int upperLevelCount = 0;
  boolean isReserved = false;
  int x, y, z;

  public ParkingSlot(int i, int j, int floorNumber) {
    x = i;
    y = j;
    z = floorNumber;
  }


  @Override
  public boolean isEmpty() {
      if (isReserved) {
          return false;
      } else {
          return upperLevelCount == 0 && lowerLevelCount == 0;
      }

  }

  @Override
  public void parkVehicle(Vehicle vehicle) {
    parkingType = vehicle.getVehicleType() == VehicleType.BIKE ? ParkingType.BIKE : ParkingType.CAR;
    if (vehicle.getOwnerType() == PersonType.ROYAL) {
      isReserved = true;
      lowerLevelCount += 1;
    } else if (vehicle.getOwnerType() == PersonType.SENIOR) {
      lowerLevelCount += 1;
    } else {
      if (vehicle.getVehicleType() == VehicleType.BIKE) {
          if (upperLevelCount < 2) {
              upperLevelCount += 1;
          } else {
              lowerLevelCount += 1;
          }
      } else {
          if (upperLevelCount < 1) {
              upperLevelCount += 1;
          } else {
              lowerLevelCount += 1;
          }
      }
    }
  }

  @Override
  public void unParkVehicle(Vehicle vehicle) {
    if (vehicle.getOwnerType() == PersonType.ROYAL) {
      isReserved = false;
      lowerLevelCount -= 1;
    } else if (vehicle.getOwnerType() == PersonType.SENIOR) {
      lowerLevelCount -= 1;
    } else {
        if (lowerLevelCount > 0) {
            lowerLevelCount -= 1;
        } else {
            upperLevelCount -= 1;
        }
    }
  }

  @Override
  public void reserve() {
    isReserved = true;
  }

  @Override
  public void unReserved() {
    isReserved = false;
  }

  @Override
  public boolean isFull() {
      if (isReserved) {
          return true;
      }
      if (parkingType == ParkingType.BIKE) {
          return lowerLevelCount == 3 && upperLevelCount == 2;
      } else if (parkingType == ParkingType.CAR) {
          return lowerLevelCount == 1 && upperLevelCount == 1;
      }
    return false;
  }

  @Override
  public boolean isLowerLevelAvailable() {
      if (isReserved) {
          return false;
      } else if (parkingType == ParkingType.BIKE) {
          return lowerLevelCount < 3;
      } else if (parkingType == ParkingType.CAR) {
          return lowerLevelCount < 1;
      } else {
          return true;
      }
  }

  @Override
  public int[] getPosition() {
    return new int[]{x, y, z};
  }

  @Override
  public ParkingType getParkingType() {
    return parkingType;
  }

  @Override
  public boolean isReserved() {
    return isReserved;
  }

  @Override
  public int getParkedVehicleCount() {
    return lowerLevelCount + upperLevelCount;
  }
}
