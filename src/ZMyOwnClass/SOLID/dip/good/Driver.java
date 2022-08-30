package ZMyOwnClass.SOLID.dip.good;

public class Driver {

    Vehicle vehicle;

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void drive() {
        vehicle.ride();
    }
}
