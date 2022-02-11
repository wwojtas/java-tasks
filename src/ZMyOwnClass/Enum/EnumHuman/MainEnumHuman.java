package ZMyOwnClass.Enum.EnumHuman;

public class MainEnumHuman {
    public static void main(String[] args) {

        Human human1 = new Human(KOLOR_OCZU.BLEKITNE, KOLOR_WLOSOW.RUDE, "Jan", 45);
        Human human2 = new Human(KOLOR_OCZU.ZIELONE, KOLOR_WLOSOW.BLOND, "Viola", 56);
        System.out.println(human1.getImie());
        System.out.println(human2.getImie());

    }
}
