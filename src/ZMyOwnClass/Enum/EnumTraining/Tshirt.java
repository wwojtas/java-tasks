package ZMyOwnClass.Enum.EnumTraining;

public class Tshirt {


    private TshirtSize size;
    private String manufacturer;

    public Tshirt(TshirtSize size, String manufacturer) {
        this.size = size;
        this.manufacturer = manufacturer;
    }

    public TshirtSize getSize() {
        return size;
    }


}