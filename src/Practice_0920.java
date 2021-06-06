public class Practice_0920 {
    public static void main(String[] args) {
        Farmer[]farmer = Farmer.callFarmers(10);
        Farmer.showAll(farmer);
        Farmer.Work(farmer);
        Farmer.Work(farmer);
        Farmer.Work(farmer);
        Farmer.showAll(farmer);

        Farmer.countFood(farmer);

    }
}

class Farmer {
    private int food;

    public void work() {
        food = food + (int) (5 * Math.random());
    }

    public void show() {
        System.out.println("Food: " + food);
    }

    public Farmer() {
        this.food = 0;
    }

    public static void showAll(Farmer[] farmers) {
        for (Farmer farmer : farmers) {
            farmer.show();
        }
    }

    public static void Work(Farmer[] farmers) {
        for (Farmer farmer : farmers) {
            farmer.work();
        }
    }

    public static void countFood(Farmer[] farmers) {
        int total = 0;
        for (Farmer farmer : farmers) {
            total = total + farmer.food;
        }
        System.out.println("Total: " + total);
    }

    public static Farmer[] callFarmers(int x) {
        Farmer[] farmer = new Farmer[x];
        for (int i = 0; i < farmer.length; i++) {
            farmer[i] = new Farmer();
        }
        return farmer;
    }
}