package ZMyOwnClass;

public class Konwersja {
    public static void main(String[] args) {

        Konwersja konwersja = new Konwersja();
        int zmiennaInt = Integer.MAX_VALUE;
        long zmiennaLong = Long.MAX_VALUE;

        konwersja.methodLongArgument(zmiennaInt);
        konwersja.methodLongArgument( zmiennaLong);

        System.out.println((int) 125.56f );
        System.out.println((int) 125.56d );

    }

    public void methodLongArgument(long argument) {
        System.out.println(argument);
    }
}
