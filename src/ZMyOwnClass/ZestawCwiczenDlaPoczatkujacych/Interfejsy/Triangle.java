package ZMyOwnClass.ZestawCwiczenDlaPoczatkujacych.Interfejsy;

public class Triangle implements Figure{

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = Math.sqrt(sideA * sideA + sideB * sideB);
    }

    public double getSideC(){
        return Math.sqrt(sideA * sideA + sideB * sideB);
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    @Override
    public double getPetrimeter() {
        return sideA + sideB + getSideC();
    }

    @Override
    public double getArea() {
        return ( (getSideA() + getSideB()) / 2  );
    }
}
