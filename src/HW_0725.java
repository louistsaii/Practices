public class HW_0725 {
    public static void main(String[] args) {
//        Tile1 a1 = new Tile1(6,15);
//        double tileArea = a1.getTileArea();
//        Floor1 a2 = new Floor1(6,10,10,15);
//        double a1FloorArea = a2.getFloorArea();
//        double tiles = a1FloorArea/tileArea;
//        double money = tiles * a1.price;
//        System.out.println(money);
//
//        // ==============================
//
//        int tileEdge = 6 ;
//        int tilePrice=15 ;
//        int floorEdge = 60 ;
//
//        Floor1 floor = new Floor1( tileEdge , floorEdge/tileEdge,floorEdge/tileEdge , tilePrice) ;
//        System.out.println(floor.getTotalPrice());

        Floor1 a1 = new Floor1(6, 15, 60, 60);
        Floor1 a2 = new Floor1(10, 25, 30, 60);
        double a1Price = a1.getTotalPrice();
        double a2Price = a2.getTotalPrice();
        System.out.println(a1Price);
        System.out.println(a2Price);
    }
}

class Tile1 {
    double tileEdge;
    double price;

    public Tile1(double tileEdge, double price) {
        this.tileEdge = tileEdge;
        this.price = price;
    }

    public double getTileArea() {
        double x = tileEdge * tileEdge;
        return x;
    }
}

class Floor1 extends Tile1 {
    double numOfRows;
    double numOfColumns;

//    public Floor1(double tileEdge, double numOfRows, double numOfColumns, double price){
//        super(tileEdge, price);
//        this.numOfRows = numOfRows;
//        this.numOfColumns = numOfColumns;
//    }

    public Floor1(double tileEdge, double tilePrice, double floorWidth, double floorHeight) {
        super(tileEdge, tilePrice);
        numOfColumns = floorWidth / tileEdge;// numOfColumns , tileEdge , floorWidth
        numOfRows = floorHeight / tileEdge;

    }

    public double getFloorArea() {
        double x = getTileArea() * numOfRows * numOfColumns;
        return x;
    }

    public double getTotalPrice() {
        double totalPrice = price * numOfRows * numOfColumns;
        return totalPrice;
    }

}

