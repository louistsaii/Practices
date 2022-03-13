import java.util.ArrayList;

class Practice_0725 {

    public static void main(String[] args) {

        GameMap map = new GameMap(9);

        // A Team : Castle , Knight , Witch
        Team ta = new Team(0, 0, map, 0);
        // B Team : Castle , Knight , Witch
        Team tb = new Team(8, 8, map, 1);

        System.out.println("=============== START ===============");

        // show game info
        System.out.println(ta);
        System.out.print(map);
        System.out.println(tb + "\n\n");

        int round = 0;
        for (boolean roundA = true; round < 100; round++) {
            System.out.println("round" + round);
            if (roundA) {
                ta.go();
                roundA = false;
            } else {
                tb.go();
                roundA = true;
            }
            // show game info
            System.out.println(ta);
            System.out.print(map);
            System.out.println(tb + "\n\n");


        }

        //...


    }

    public String toString() {
        String x = "Practice_0725";
        return x;
    }
}


class GameObject {

    private int HP;
    private int DP;
    private int X;
    private int Y;
    private int team = 0; // team-A : 0  , team-B : 0
    String symbol = "⚑";

    public GameObject(int HP, int DP, int X, int Y, int tid) {
        this.HP = HP;
        this.DP = DP;
        this.X = X;
        this.Y = Y;
        this.team = tid;
    }

    public void underAttack() {
        HP = HP - DP;
    }

    public void underHeal(int x) {
        HP = HP + x;
    }

    public int[] gameLocation() {
        int[] x = new int[2];
        x[0] = X;
        x[1] = Y;
        return x;
    }

    public int getHP(){
        return HP ;
    }
//
//    public void changeXandY(int range) {
//
//        int max = range * 2 + 1;
//        int rx = (int) (Math.random() * max) - range;
//        int ry = (int) (Math.random() * max) - range;
//
//        X = X + rx;
//        Y = Y + ry;
//
//    }

    public void changeXandY(int range) {

        int max = range + 1;
        int rx = (int) (Math.random() * max);
        int ry = (int) (Math.random() * max);
        if (team == 0) {
            X = X + rx;
            Y = Y + ry;
        } else {
            X = X - rx;
            Y = Y - ry;
        }

    }


    public String toString() {
        if (team == 0) {
            return "." + symbol + ".";
        } else {
            return " " + symbol + " ";
        }
    }//        System.out.print("\033[93;100m"+" A "+"\033[m");

    //        System.out.print("\033[93;104m"+" A "+"\033[m");
//        System.out.print("\033[93;100m"+" A "+"\033[m");
    public String showInfo() {
        //⚑:100
        return this.toString() + ":" + HP; // ⚑  ⚔ ❉
    }

    public int getTID() {
        return team;
    }
}

class Character extends GameObject {
    public Character(int HP, int DP, int X, int Y, int tid) {
        super(HP, DP, X, Y, tid);
    }

    public void move(GameMap map) {
        //System.out.println("Move");
        int[] oriLocation = {gameLocation()[0], gameLocation()[1]};
        while (true) {
            this.changeXandY(1);
            boolean ok = map.setObject(this);
            if (ok == true) {
                map.removeObject(oriLocation);
                return;
            }
        }
    }


}

class Knight extends Character {

    public Knight(int HP, int DP, int X, int Y, int tid) {
        super(HP, DP, X, Y, tid);
        symbol = "⚔";
    }

    public void attack(GameObject x) {
        x.underAttack();

    }


}

class Witch extends Character {
    public Witch(int HP, int DP, int X, int Y, int tid) {
        super(HP, DP, X, Y, tid);
        symbol = "❉";
    }

    public void heal(GameObject x, int y) {
        x.underHeal(y);
    }

}

class GameMap {
    /*




     */


    private GameObject[][] map;

    public GameMap(int size) {
        map = new GameObject[size][size];
    }

    public GameObject getObject(int x, int y) {
        if (x < 0 || y < 0 || x >= map.length || y >= map.length) {
            return null;
        }
        return map[x][y];
    }

    public String toString() {
//        String y = "========Map========";
        String y = "";
        //        System.out.print("\033[93;100m"+" A "+"\033[m");
//        System.out.print("\033[93;104m"+" A "+"\033[m");
//        System.out.print("\033[93;100m"+" A "+"\033[m");


        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                String sym = "   ";
                if (map[i][j] != null) {
                    sym = "" + map[i][j];
                }
                if ((i + j) % 2 == 0) {
                    System.out.print("\033[93;100m" + sym + "\033[m");
                } else {
                    System.out.print("\033[93;104m" + sym + "\033[m");
                }
            }
            System.out.println();
        }
        return y;
    }

    public void removeObject(int[] location) {
        map[location[0]][location[1]] = null;
    }

    public boolean setObject(GameObject obj) {
        int[] loc = obj.gameLocation();
        if (loc[0] < 0 || loc[1] < 0) {
            return false;
        }
        if (loc[0] >= map.length || loc[1] >= map.length) {
            return false;
        }
        if (map[loc[0]][loc[1]] != null) {
            return false;
        }
        map[loc[0]][loc[1]] = obj;

        return true;
    }

    public int getEdgeLength() {
        return map.length;
    }

    public ArrayList<GameObject> getEnemy(GameObject a1) {
        return getNeighbors(a1,false);
    }

    public ArrayList<GameObject> getFriends(GameObject a1) {
        return getNeighbors(a1,true);
    }


    public ArrayList<GameObject> getNeighbors(GameObject a1, boolean isFriend) {
        ArrayList<GameObject> a = new ArrayList<>();
        int[] x = a1.gameLocation();
        int X = x[0];
        int Y = x[1];
        for (int i = X - 1; i < X + 2; i++) {
            for (int j = Y - 1; j < Y + 2; j++) {
                if(i==X && j==Y){
                    continue;
                }
                if (i < 0 || j < 0 || i > 8 || j > 8) {
                    continue;
                }
                if (isFriend == false) {
                    if (map[i][j] != null) {
                        if (map[i][j].getTID() != a1.getTID()) {
                            a.add(map[i][j]);
                        }
                    }
                } else {
                    if (map[i][j] != null && map[i][j] instanceof Knight) {
                        if (map[i][j].getTID() == a1.getTID()) {
                            a.add(map[i][j]);
                        }
                    }
                }

            }
        }
        return a;
    }

}

class Team {
    private GameObject castle;
    private ArrayList<Character> pieces;
    private GameMap map;

    public Team(int x, int y, GameMap map, int tid) {
        this.map = map;
        // x-2 ~ x+2
        pieces = new ArrayList<>();
        // castle
        castle = new GameObject(100, 15, x, y, tid);
        while (map.setObject(castle) == false) {
            castle = new GameObject(100, 15, x, y, tid);
            castle.changeXandY(3);
        }

        // knight
        Knight a1 = new Knight(100, 10, x, y, tid);
        while (map.setObject(a1) == false) {
            a1 = new Knight(100, 10, x, y, tid);
            a1.changeXandY(4);
        }


        // witch
        Witch w1 = new Witch(100, 20, x, y, tid);
        while (map.setObject(w1) == false) {
            w1 = new Witch(100, 20, x, y, tid);
            w1.changeXandY(4);
        }

        pieces.add(a1);
        pieces.add(w1);
    }

    public void go() {

        // choose one character randomly from pieces
        double chance = Math.random();

        for (Character piece : pieces) {
            if (chance > 0.7) {
                if (piece instanceof Knight) {
                    //attack first, if no enemies, then move
                    ArrayList<GameObject> enemies = map.getEnemy(piece);
                    if (enemies.size() == 0) {
                        System.out.println("Knight move");
                        piece.move(map);
                        break;
                    } else {
                        System.out.println("Knight attack");
                        int random = (int) (Math.random() * enemies.size());
                        GameObject target = enemies.get(random);
                        ((Knight) piece).attack(target);

                    }
                }

                // piece.move();
            } else {
                if (piece instanceof Witch) {
                    ArrayList<GameObject> friends = map.getFriends(piece);
                    if (friends.size() == 0) {
                        System.out.println("Witch move");
                        piece.move(map);
                        break;
                    } else {
                        System.out.println("Witch heal");
                        int random = (int) (Math.random() * friends.size());
                        GameObject target = friends.get(random);
                        ((Witch) piece).heal(target, 20);
                    }
                }
            }
        }

        // remove died pieces from team
        for( int i=pieces.size()-1 ; i>=0 ; i--){
            if( pieces.get(i).getHP()<1){
                map.removeObject(pieces.get(i).gameLocation());
                pieces.remove(i) ;
            }
        }



    }

    public String toString() {
        String info = castle.showInfo();
        info += "\n";
        for (Character piece : pieces) {
            info += piece.showInfo() + "  ";
        }
        return info;
    }

}