package ZMyOwnClass;

public class TestClass {
    public static void main(String[] args) {

        System.out.println("0.3 == 0.1 + 0.2: " + (0.3 == 0.1 + 0.2)); // !!!
        System.out.println("0.1 + 0.2: " + ( 0.1 + 0.2 )); // !!!
        System.out.println("0.3 == 0.1 + 0.2: " + (Math.abs(0.3 - (0.1 + 0.2)) < 0.000001));

        System.out.println( "porownanie test --------------");
        System.out.println("test == test: " + (new String("test") == new String("test")));
        System.out.println("test equals test: " + new String("test").equals(new String("test")));

        System.out.println( "porownanie something --------------");
        String reference1 = new String("something");
        String reference2 = reference1;
        System.out.println("reference1 == reference2: " + (reference1 == reference2));
    }
}
