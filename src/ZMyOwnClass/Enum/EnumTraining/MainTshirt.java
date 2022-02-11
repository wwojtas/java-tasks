package ZMyOwnClass.Enum.EnumTraining;

public class MainTshirt {
    public static void main(String[] args) {

        Tshirt tshirt = new Tshirt(TshirtSize.L, "Polex");
        System.out.println(tshirt.getSize());

        Tshirt_1 tshirt_1 = new Tshirt_1(TshirtSize_1.M, "Firma");
        System.out.println(tshirt_1.getTshirtSize_1());

        System.out.println(TshirtSize.S.ordinal());
        System.out.println(TshirtSize.M.ordinal());
        System.out.println(TshirtSize.L.ordinal());
        System.out.println(TshirtSize.XL.ordinal());

    }
}
