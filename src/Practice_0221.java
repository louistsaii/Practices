import java.util.ArrayList;

public class Practice_0221 {
    public static void main(String[] args) {
        Soldier a1 = new Soldier("A", 30, 30);
        Player1 p1 = new Player1("B", 20);
//        a1.show();
//        p1.show();

        ArrayList<Player1> x = new ArrayList<Player1>();
        x.add(a1);
        x.add(p1);
        for (int i = 0; i < x.size(); i++) {
           Player1 y = x.get(i);
            y.show();
            if(y instanceof Soldier){
                Soldier s = (Soldier) y;
                s.attack();
            }
        }

        ArrayList<Soldier> y = new ArrayList<Soldier>();
        y.add(a1);
    }

    public static void main2(String[] args) {
        Player1 p1 = new Player1("A", 30);
        Player1 p2 = new Player1("B", 10);
        Player1 p3;

        p3 = p1;
        p1 = p2;
        p2 = p3;
        p1.show();
        p2.show();

        p1.heal(p2);
        p1.show();
        p2.show();

    }


    public static void main1(String[] args) {
        String[] arr = new String[5];
        arr[0] = "C";
        arr[1] = "B";
        arr[2] = "Good";
        arr[3] = "A";
        arr[4] = "Ok";

        int x = 2 + (int) (Math.random() * 3);
        System.out.println(x);

        for (int i = 0; i < 10; i++) {
            int y = 2 + (int) (Math.random() * 3);
            System.out.println(arr[y]);
        }

        int[][] grid = new int[2][5];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                int z = (int) (Math.random() * 11);
                grid[i][j] = z;
            }
        }
        int even = 0;
        int odd = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (j > 0) {
                    System.out.print("," + grid[i][j]);
                } else {
                    System.out.print(grid[i][j]);
                }
                if (j == grid[i].length - 1) {
                    System.out.println();
                }

                if (grid[i][j] % 2 == 0) {
                    even = even + 1;
                } else {
                    odd = odd + 1;
                }
            }
        }
        System.out.print("Even:" + even + " Odd:" + odd);
    }
}

class Player1 {
    String name;
    int hp;

    public Player1(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public void show() {
        System.out.print("Name: " + name + " Hp: " + hp);
    }

    public void heal(int x) {
        hp = hp + x;
    }

    public void heal(Player1 x) {
        int y = x.hp / 2;
        x.hp = x.hp - y;
        this.hp = this.hp + y;
    }
}

class Soldier extends Player1 {
    int ap;

    public Soldier(String name, int hp, int ap) {
        super(name, hp);
        this.ap = ap;
    }

    public void show() {
        super.show();
        System.out.println(" Ap: " + ap);
    }

    public void attack(){
        System.out.println("Attack");
    }
}

