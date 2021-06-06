public class Practice_0629 {
    public static void main(String[] args) {
        RaceGame r1 = new RaceGame();
        r1.startlocation = 120;
        r1.endlocation = 500;
        r1.title = "Extreme";

        Car a1 = new Car();
        a1.name = "Spider";
        a1.fuel = 500;
        a1.speed = 15;
        a1.location = r1.startlocation;
        a1.show();

        Car a2 = new Car();
        a2.name = "Eagle";
        a2.fuel = 500;
        a2.speed = 12;
        a2.location = 50;
        a2.show();

        for (int i = 0; i < 501; i++) {
            a1.go(1);
            a2.go(1);
            if (a1.location > r1.endlocation) {
                System.out.println("Spider Wins");
                break;
            } else if (a2.location > r1.endlocation) {
                System.out.println("Eagle Wins");
                break;
            }
        }
    }


    public static void main1(String[] args) {
        GasStation g1 = new GasStation();
        g1.fuel = 100;

        Car a1 = new Car();
        a1.name = "Spider";
        a1.fuel = 100;
        a1.speed = 15;
        a1.location = 0;
        a1.show();
        a1.go(3);
        a1.show();
        int z = g1.getFuel();
        a1.refuel(z);
        a1.show();
        int a = g1.getFuel();
        a1.refuel(a);
        a1.show();


        Car a2 = new Car();
        a2.name = "Eagle";
        a2.fuel = 150;
        a2.speed = 10;
        a2.location = 0;
        a2.go(7);
        a2.show();
        int b = g1.getFuel();
        a2.refuel(b);
        a2.show();
        int c = g1.getFuel();
        a2.refuel(c);
        a2.show();
        System.out.println("Remaining Fuel= " + g1.fuel);
    }
}

class Car {
    int fuel;
    int speed;
    int location;
    String name;

    void refuel(int y) {
        fuel = fuel + y;
    }

    void show() {
        System.out.println("Name: " + name);
        System.out.println("Location=" + location + " Speed=" + speed + " Fuel=" + fuel);
        System.out.println("-------------------");
    }

    void go(int steps) {
        System.out.println(name + " go:steps= " + steps);
        for (int i = 1; i <= steps; i++) {
            location = location + speed;
            fuel = fuel - speed;
            System.out.println(" >> L=" + location + ", F=" + fuel);

        }
    }
}

class GasStation {
    int fuel;
    int location;

    int getFuel() {
        if (fuel >= 30) {
            fuel = fuel - 30;
            return 30;
        } else {
            int x = fuel;
            fuel = 0;
            return x;
        }
    }
}

class RaceGame {
    int startlocation;
    int endlocation;
    String title;
    Car[] x = new Car[3];
    GasStation[] y = new GasStation[2];
}
