public class Practice_0624_3 {
    public static void main(String[] args) {
        Sprite a1 = new Sprite();
        a1.name = "Monster";
        a1.hp = 500;
        a1.ap = 70;

        Sprite a2 = new Sprite();
        a2.name = "Knight";
        a2.hp = 100;
        a2.ap = 50;

        Food a3 = new Food();
        a3.amount = 1000;

        World w1 = new World();
        w1.food = a3;
        w1.sprite1 = a1;
        w1.sprite2 = a2;

        for (int i = 0; i < 50; i++) {
            a1.eat(a3);
            a1.show();
            a3.show();
        }
    }
}

class Sprite {
    String name;
    int hp;
    int ap;

    void eat(Food f) {
        int z = f.get();
        hp = hp+z;
    }

    void attack() {

    }

    void show() {
        System.out.println(name + " HP >>> " + hp);
    }
}

class Food {

    int amount;

    int get() {
        int x = (int) (Math.random() * 40 + 10);
        if (x <= amount) {
            amount = amount - x;
            return x;
        } else {
            int r = amount;
            amount = 0;
            return r;
        }
    }

    void show() {
        System.out.println("Total Food: " + amount);
    }
}

class World {

    Food food;

    Sprite sprite1;
    Sprite sprite2;

    void show() {

    }
}



