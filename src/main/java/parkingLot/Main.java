package parkingLot;


import parkingLot.enums.PersonType;
import parkingLot.enums.VehicleType;
import parkingLot.parkingLot.ParkingLot;
import parkingLot.parkingSummary.ParkingSummary;

public class Main {

  public static void main(String[] args) {

    ParkingLot parkingLot = new ParkingLot(2);
    parkingLot.parkVehicle(VehicleType.BIKE, PersonType.COMMON, "1");
    parkingLot.getParkingSummary().stream().forEach(ParkingSummary::printSummary);
    parkingLot.parkVehicle(VehicleType.CAR, PersonType.ROYAL, "2");
    parkingLot.getParkingSummary().stream().forEach(ParkingSummary::printSummary);
    parkingLot.parkVehicle(VehicleType.CAR, PersonType.ROYAL, "3");
    parkingLot.parkVehicle(VehicleType.CAR, PersonType.COMMON, "5");
    parkingLot.parkVehicle(VehicleType.CAR, PersonType.SENIOR, "4");
    parkingLot.parkVehicle(VehicleType.BIKE, PersonType.COMMON, "7");
    parkingLot.parkVehicle(VehicleType.BIKE, PersonType.COMMON, "6");
    parkingLot.parkVehicle(VehicleType.BIKE, PersonType.COMMON, "8");
    parkingLot.parkVehicle(VehicleType.BIKE, PersonType.COMMON, "9");
    parkingLot.parkVehicle(VehicleType.BIKE, PersonType.COMMON, "10");

    parkingLot.getParkingSummary().stream().forEach(ParkingSummary::printSummary);
    parkingLot.unParkVehicle("2");
    parkingLot.unParkVehicle("3");

    parkingLot.getParkingSummary().stream().forEach(ParkingSummary::printSummary);

  }
}
