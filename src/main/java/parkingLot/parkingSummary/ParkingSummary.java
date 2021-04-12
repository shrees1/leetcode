package parkingLot.parkingSummary;

public class ParkingSummary {

  int emptyParkingSlot;
  int numberOfParkedCar;
  int numberOfParkedBike;
  int floorNumber;

  public ParkingSummary(int emptyParkingSlot, int numberOfParkedBike, int numberOfParkedCar,
      int floorNumber) {
    this.emptyParkingSlot = emptyParkingSlot;
    this.numberOfParkedBike = numberOfParkedBike;
    this.numberOfParkedCar = numberOfParkedCar;
    this.floorNumber = floorNumber;
  }

  public void printSummary() {
    System.out.println("floor " + floorNumber + " has emptyParkingSlot = " + emptyParkingSlot
        + " numberOfParkedCar = " + numberOfParkedCar + " numberOfParkedBike = "
        + numberOfParkedBike);
  }
}
