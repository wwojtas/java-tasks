package OOP.inheritance.shop;

//   klasa
//    Shop
//  Product (zmienne: price, name, manufacturer, produtionYear)
//    Mouse extends Product( zmienne: numButtons = 3)
//    VerticalMouse extends Mouse (zmienne: - )
//    Monitor extends Product (zmienne: resolution = 1080)
//    Keybord extends Product (zmienne: numKeys = 104
//    Computer extends Product (zmienne: mouse, monitor, keybord)


public class Shop {
    public static void main(String[] args) {

        Product product = new Product();
        Keybord keybord = new Keybord();
        Monitor monitor = new Monitor();
        Mouse mouse = new Mouse();

        Computer computer = new Computer();
        System.out.println(computer.monitor.manufacturer);
        System.out.println(computer.monitor.price);
        System.out.println(computer.monitor.productionYear);
        System.out.println(computer.monitor.resolution);
        System.out.println(computer.monitor.name);




    }
}
