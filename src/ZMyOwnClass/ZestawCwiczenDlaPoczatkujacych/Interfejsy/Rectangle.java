package ZMyOwnClass.ZestawCwiczenDlaPoczatkujacych.Interfejsy;

public class Rectangle implements Figure{

    private double sideARectangle;
    private double sideBRectangle;

    public Rectangle(double sideARectangle, double sideBRectangle) {
        this.sideARectangle = sideARectangle;
        this.sideBRectangle = sideBRectangle;
    }

    public double getSideARectangle() {
        return sideARectangle;
    }

    public double getSideBRectangle() {
        return sideBRectangle;
    }

    @Override
    public double getPetrimeter() {
        return sideARectangle + sideBRectangle;
    }

    @Override
    public double getArea() {
        return sideARectangle * sideBRectangle;
    }
}
