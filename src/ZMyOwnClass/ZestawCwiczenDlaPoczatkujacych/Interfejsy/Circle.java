package ZMyOwnClass.ZestawCwiczenDlaPoczatkujacych.Interfejsy;

public class Circle implements Figure {

    private double radiusOfCircle;

    public Circle(double radiusOfCircle) {
        this.radiusOfCircle = radiusOfCircle;
    }

    @Override
    public double getPetrimeter() {
        return 2 * Math.PI * radiusOfCircle;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radiusOfCircle, 2);
    }
}
