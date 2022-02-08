package Files.ObjectOutputStreamSerialization;

import java.io.Serializable;

public class CarObject implements Serializable {

    public String manufacturer;
    public String name;
    public int productionYear;
    public int topSpeed;
    public transient int id;  // słowo kluczowe sprawia że wartość ta nie będzie zapisywana

    public CarObject(String name, String manufacturer, int productionYear, int topSpeed, int id) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.productionYear = productionYear;
        this.topSpeed = topSpeed;
        this.id = id;
    }

    @Override
    public String toString() {
        return "CarObject{" +
                "name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", productionYear=" + productionYear +
                ", topSpeed=" + topSpeed +
                ", id=" + id +
                '}';
    }
}
