package Generics.SimpleGeneric;

public class MainSimpleGeneric {
    public static void main(String[] args) {

        Point<Integer> pointInt = new Point<>(12,30);
        System.out.println(pointInt.toString());

        Point<String> pointStr = new Point<>("X", "Y");
        System.out.println(pointStr);

        Trio<String, Integer, String> trio = new Trio<>("Adam", 23, "Kaska");
        System.out.println(trio);
    }
}
