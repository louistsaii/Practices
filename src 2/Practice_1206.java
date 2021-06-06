public class Practice_1206 {
    public static void main(String[] args) {
        System.out.println(23%12);
    }

}

class ShipContainer {

    int width = 24;
    int height = 24;
    int depth = 60;

    int cargoWidth;
    int cargoHeight;
    int cargoDepth;

    public ShipContainer(int cargoWidth, int cargoHeight, int cargoDepth) {
        this.cargoWidth = cargoWidth;
        this.cargoHeight = cargoHeight;
        this.cargoDepth = cargoDepth;
    }

    public int getNumOnWidth() {
        return width / cargoWidth;
    }

    public int getNumOnHeight() {
        return height / cargoHeight;
    }

    public int getNumOnDepth() {
        return depth / cargoDepth;
    }

    public int getTotalCargo() {
        int a = getNumOnWidth() * getNumOnHeight() * getNumOnDepth();
        return a;
    }

    public int getTotalCargoPrice(int price) {
        int a = getTotalCargo() * price;
        return a;
    }
}

class MyCargo {

    public static void main(String[] args) {

        ShipContainer a1 = new ShipContainer(8, 8, 10);
        int b = a1.getTotalCargoPrice(1200);
        System.out.println(3 * b);

        ShipContainer a2 = new ShipContainer(12, 12, 12);
        int a = a2.getTotalCargoPrice(2300);
        System.out.println(2 * a);
    }


    // cargo1 :  8 , 8 , 10 , $ 1200 , 3xships
    // cargo2 :  12 , 12 , 12 , $ 2300 , 2xships
}


