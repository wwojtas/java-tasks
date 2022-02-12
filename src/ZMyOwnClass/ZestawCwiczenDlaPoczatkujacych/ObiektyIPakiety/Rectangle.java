package ZMyOwnClass.ZestawCwiczenDlaPoczatkujacych.ObiektyIPakiety;

public class Rectangle {

    private double length;
    private double width;

    public double field(double a, double b) {
        return a * b;
    }

    public double circuit(double a, double b) {
        return 2 * (a + b);
    }

    public double diagonalLength(double a, double b) {
        return Math.sqrt( ( Math.pow(a, 2) + Math.pow(b, 2) ) );
    }

}
