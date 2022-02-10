package ZMyOwnClass;

public class ArithmeticConversion {
    public static void main(String[] args) {

        short shortValue = 1;
        int intValue = 1;
        long longValue = 2;
        float floatValue = 3.1F;
        double doubleValue = 4.1;

        System.out.println(intValue + doubleValue); // konwersja int do double
        System.out.println(intValue + floatValue);  // konwersja int do float
        System.out.println(intValue + longValue);   // konwersja int do float
        System.out.println(shortValue + shortValue);
    }
}