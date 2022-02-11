package ZMyOwnClass.Chair;

public class MainChair {
    public static void main(String[] args) {

        Chair chair1 = new Chair("Adde", "IKEA", 2016);
        Chair chair2 = new Chair("Janinge", "IKEA", 2016);
        Chair chair3 = new Chair("Adde", "IKEA", 2015);
        Chair chair4 = new Chair("Adde", "IKEA", 2016);

        System.out.println("chair1.equals(chair2): " + chair1.equals(chair2) + " -- hashCode 1: " + chair1.hashCode());
        System.out.println("chair1.equals(chair3): " + chair1.equals(chair3) + " -- hashCode 2: " + chair2.hashCode());
        System.out.println("chair1.equals(chair4): " + chair1.equals(chair4) + "  -- hashCode 3: " + chair3.hashCode());
        System.out.println("chair1.equals(null): " + chair1.equals(null) + " -- hashCode 4: " + chair4.hashCode());

    }
}
