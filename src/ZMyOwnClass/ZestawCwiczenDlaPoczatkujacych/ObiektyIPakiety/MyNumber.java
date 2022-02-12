package ZMyOwnClass.ZestawCwiczenDlaPoczatkujacych.ObiektyIPakiety;

public class MyNumber {

    private int number;

    public MyNumber(int number) {
        this.number = number;
    }

    public boolean isOdd(int number) {
        if( number % 2 != 0 ) return true;
        return false;
    }

    public boolean isEven(int number) {
        if( number % 2 == 0 ) return true;
        return false;
    }

    public double sqrtFromNumber(int number){
        return Math.sqrt( (double) number);
    }

    public double powFromNumber(int number, int x) {
        return Math.pow(number, x);
    }

    public float addNumbers(int number, int x) {
        return number + x;
    }

    public int substractNumbers(int number, int x){
        return number - x;
    }





}
