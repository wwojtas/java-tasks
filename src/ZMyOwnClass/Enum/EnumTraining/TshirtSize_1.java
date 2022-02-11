package ZMyOwnClass.Enum.EnumTraining;

public enum TshirtSize_1 {

    S(48, 71, 36),
    M(52, 74, 38),
    L(56, 76, 41),
    XL(61, 79, 41);

   private int chestWidth;
   private int shirtLength;
   private int sleevenLength;

    TshirtSize_1(int chestWidth, int shirtLength, int sleevenLength) {
        this.chestWidth = chestWidth;
        this.shirtLength = shirtLength;
        this.sleevenLength = sleevenLength;
    }

    public int getChestWidth() {
        return chestWidth;
    }

    public int getShirtLength() {
        return shirtLength;
    }

    public int getSleevenLength() {
        return sleevenLength;
    }
}
