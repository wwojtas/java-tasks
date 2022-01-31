package OOP.inheritance.shop;

//  Product (zmienne: price, name, manufacturer, productionYear)

public class Product {

    protected float price;
    protected String name;
    protected String manufacturer;
    protected int productionYear;

    Product() {

    }

    Product(float price, String name, String manufacturer, int productionYear) {
        this.price = price;
        this.name = name;
        this.manufacturer = manufacturer;
        this.productionYear = productionYear;
    }

}
