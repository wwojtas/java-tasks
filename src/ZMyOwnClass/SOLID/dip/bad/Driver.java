package ZMyOwnClass.SOLID.dip.bad;

public class Driver {

    Bike bike;

    public void setBike(Bike bike) {
        this.bike = bike;
    }

    public void drive(){
        bike.ride();
    }
}
