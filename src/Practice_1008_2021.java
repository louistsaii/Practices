public class Practice_1008_2021 {
    public static void main(String[] args) {
        Pirate[] x = new Pirate[5];
        x[0] = new Pirate();
        x[1] = new Pirate();
        x[2] = new Pirate();
        x[3] = new Pirate();
        x[4] = new Pirate();
        Captain y = new Captain();

        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
        System.out.println("---------------------");
        y.distributeCoins(x);
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }

    }
}

class Pirate {
    private int coins;

    public Pirate() {
        this.coins = (int) (1 + Math.random() * 100);
    }

    public int getCoins() {
        return coins;
    }

    public void setCoins(int x) {
        coins = x;
    }

    @Override
    public String toString() {
        return "Pirate{" +
                "coins=" + coins +
                '}';
    }
}

class Captain {
    public void distributeCoins(Pirate[] x) {
        int total = 0;
        for (int i = 0; i < x.length; i++) {
            total = total + x[i].getCoins();
        }
        int z = total / x.length;
        for (int i = 0; i < x.length; i++) {
            x[i].setCoins(z);
        }
    }
}