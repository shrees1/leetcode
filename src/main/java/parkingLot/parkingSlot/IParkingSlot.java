package parkingLot.parkingSlot;


import parkingLot.enums.ParkingType;
import parkingLot.vehicle.Vehicle;

public interface IParkingSlot {
    boolean isEmpty();
    void parkVehicle(Vehicle vehicle);
    void unParkVehicle(Vehicle vehicle);
    void reserve();
    void unReserved();
    boolean isFull();
    boolean isLowerLevelAvailable();
    int[] getPosition();

    ParkingType getParkingType();

    boolean isReserved();

    int getParkedVehicleCount();
}
