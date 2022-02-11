package ZMyOwnClass.CzlowiekChashCode;

public class MainCzlowiek {
    public static void main(String[] args) {

        Czlowiek man1 = new Czlowiek("Jan", "Kowalski", "123456789");
        Czlowiek man2 = new Czlowiek("Jan", "Kowalski", "123456781");
        Czlowiek man3 = new Czlowiek("Jan", "Kowalski", "123456718");

        System.out.println(man1 + " == " + man2 + " " + man1.equals(man2));
        System.out.println(man1 + " == " + man3 + " " + man1.equals(man3));
        System.out.println(man2 + " == " + man3 + " " + man2.equals(man3));

        System.out.println(man1.hashCode());
        System.out.println(man2.hashCode());
        System.out.println(man3.hashCode());


    }
}
