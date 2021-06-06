import java.util.ArrayList;

public class Practice_1101 {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle(50, 100, 70);
        Bus b1 = new Bus(45, 200, 30, 200);
        Lorry l1 = new Lorry(60, 400, 100, 300);

        ArrayList<Vehicle> list = new ArrayList<Vehicle>();
        list.add(v1);
        list.add(b1);
        list.add(l1);


        for (int i = 0; i < list.size(); i++) {
             Vehicle v = list.get(i);
             if(v instanceof Bus){
                 Bus b = (Bus) v ;//casting
                 b.pickup(2);
             }
             if(v instanceof Lorry){
                 Lorry l = (Lorry) v;
                 l.load(3);
             }

             v.move();
             v.showInfo();
        }


    }


    public static void main1(String[] args) {
        Vehicle v1 = new Vehicle(50, 100, 70);
        Bus b1 = new Bus(45, 200, 30, 200);
        Lorry l1 = new Lorry(60, 400, 100, 300);

//        Vehicle[] x = new Vehicle[2];
//        x[0] = v1;
//        x[1] = b1;
//
//        for (int i = 0; i < x.length; i++) {
//            x[i].showInfo();
//        }

        ArrayList<Vehicle> list = new ArrayList<Vehicle>();
        list.add(v1);
        list.add(b1);
        list.add(l1);
        for (int i = 0; i < list.size(); i++) {
            list.get(i).showInfo();
        }

        Vehicle vv1 = v1;
        Vehicle vv2 = b1;
        Vehicle vv3 = l1;

    }
}

class Vehicle {
    int speed;
    int fuel;
    int price;

    public void move() {
        fuel = fuel - fuel / 10;
    }

    public Vehicle(int s, int f, int p) {
        speed = s;
        fuel = f;
        price = p;
    }

    public void showInfo() {
        System.out.println(getClass().getName() + " speed:" + speed + " km/hr");
        System.out.println(getClass().getName() + " fuel:" + fuel + " L");
        System.out.println(getClass().getName() + " price:" + price + '$');
    }
}

class Bus extends Vehicle {
    int passenger;
    int pricePerMile;

    public Bus(int s, int f, int passenger, int p) {
        super(s, f, p);
        this.passenger = passenger;
    }

    public Bus(int s, int f, int p) {
        super(s, f, p);
        this.passenger = 0;
    }

    public void showInfo() {
        super.showInfo();
        System.out.println(getClass().getName() + " passenger:" + passenger);
    }

    public void pickup(int x) {
        passenger = passenger + x;
    }
}

class Lorry extends Vehicle {
    int cargo;

    public Lorry(int s, int f, int cargo, int p) {
        super(s, f, p);
        this.cargo = cargo;
    }

    public void load(int x) {
        cargo = cargo + x;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println(getClass().getName() + " cargo:" + cargo);
    }
}