package ZMyOwnClass.ZestawCwiczenDlaPoczatkujacych.Metody;

import java.time.LocalDate;

public class Methods {

    private int yearOfBirth;
    private String name;

    // Metody w języku Java

    // 1.
    LocalDate localDate = LocalDate.now();
    public int getAge(int yearOfBirth){
       return localDate.getYear() - yearOfBirth ;
    }

    // 2
    public String getName() {
        return name;
    }

    // 3.
    public void performCompute(double x, double y){
        if(y == 0) throw new ArithmeticException("Dont divide by 0");
        System.out.println("Suma: " + x + y);
        System.out.println("Różnica: " + (x - y));
        System.out.println("Iloczyn: " + (x * y));
        System.out.println("Dzielenie: " + (x / y));
    }

    // 4.
    public boolean returnEvenNumber(int number){
        if( (number % 2) == 0 ) return true;
        return false;
    }

    // 5.
    public boolean returnNumberDivisible3And5(int number){
        if( (number % 3) == 0 ){
            if((number % 5) == 0) return true;
        }
        return false;
    }

    // 6.
    public static double calculatePow3(double number) {
        return Math.pow(number, 3);
    }

    // 7.
    public double calculateSqrt(double number){
        return Math.sqrt(number);
    }

    // 8. a2 + b2 = c2
    public boolean buildRectangularTriangle(double a, double b, double c){
        if(a <= 0 || b <= 0 || c <= 0 ) return false;
        double a2 = Math.pow(a, 2);
        double b2 = Math.pow(b, 2);
        double c2 = Math.pow(c, 2);
        double a2B2 = a2 + b2;
        double a2C2 = a2 + c2;
        double b2C2 = b2 + c2;
        if( a2B2 == c2 ) return true;
        if( a2C2 == b2 ) return true;
        if( b2C2 == a2 ) return true;
        return false;

    }

}
