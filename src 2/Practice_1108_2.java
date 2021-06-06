import java.util.ArrayList;

public class Practice_1108_2 {
    public static void main(String[] args) {
        Floor f1 = new Floor(0.45,3,5);
        FloorConstructor f2 = new FloorConstructor(0.45,3,5,1200);
        FloorConstructor f3 = new FloorConstructor(0.5,7,2,1000);
        Floor f4 = new Floor(1.25,4,4);
        FloorConstructor f5 = new FloorConstructor(1.25,4,4,700);

        System.out.println(f1.getFloorArea());
        System.out.println(f2.getTotalPrice());

        ArrayList<Floor> x = new ArrayList<Floor>();
        x.add(f1);
        x.add(f2);
        x.add(f3);
        x.add(f4);
        x.add(f5);

        System.out.println("-----------------");
        for (int i = 0; i <x.size(); i++) {
            Floor temp = x.get(i);
            System.out.println(temp.getFloorArea());
            System.out.println();
            if (temp instanceof FloorConstructor){
                FloorConstructor fc = (FloorConstructor)temp;
                System.out.println("Total Price:" + fc.getTotalPrice());
            }
        }
    }
}

class Tile {
    double tileEdge;

    public Tile(double tileEdge) {
        this.tileEdge = tileEdge;
    }

    public double getTileArea() {
        double x = tileEdge * tileEdge;
        return x;
    }
}

class Floor extends Tile {
    int numOfRows;
    int numbOfColumns;


    public Floor(double tileEdge, int numOfRows, int numbOfColumns) {
        super(tileEdge);
        this.numOfRows = numOfRows;
        this.numbOfColumns = numbOfColumns;
    }

    public double getFloorArea() {
        double y = numOfRows * numbOfColumns * getTileArea();
        return y;
    }
}

class FloorConstructor extends Floor{

    public FloorConstructor(double tileEdge, int numOfRows, int numbOfColumns,int tilePrice) {
        super(tileEdge, numOfRows, numbOfColumns);

        this.tilePrice = tilePrice;
    }

    int tilePrice;

    public int getTotalPrice(){
        int x = numOfRows*numbOfColumns*tilePrice;
        return x;
    }
}