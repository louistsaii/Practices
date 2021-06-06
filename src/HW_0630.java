public class HW_0630 {
    public static void main(String[] args) {
        Device a1 = new Device();
        a1.name = "Macbook Pro";
        a1.brand = "Apple";
        a1.type = "Computer";
        a1.price = 1299;
        a1.show();

        Device a2 = new Device();
        a2.name = "PS4";
        a2.brand = "Sony";
        a2.type = "Game";
        a2.price = 299;
        a2.show();
    }
}

class Device {
    String name;
    String brand;
    String type;
    int price;


    void show() {
        System.out.println("Name: " + name);
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Price: " + price);
        System.out.println("-------------------");
    }
}
