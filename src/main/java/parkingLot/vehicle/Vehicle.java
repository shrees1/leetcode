package parkingLot.vehicle;


import lombok.Data;
import parkingLot.enums.PersonType;
import parkingLot.enums.VehicleType;

@Data
public class Vehicle {

  String vehicleID;
  VehicleType vehicleType;
  PersonType ownerType;

  public Vehicle(String vehicleId, VehicleType vehicleType, PersonType personType) {
    this.vehicleID = vehicleId;
    this.vehicleType = vehicleType;
    this.ownerType = personType;
  }
}
