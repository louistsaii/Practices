public class HW_0920 {
    public static void showAll(Runners[] args) {
        for (Runners x : args) {
            x.show();
        }
    }

    public static void main(String[] args) {
        Runners[] players = new Runners[5];
        players[0] = new Runners("R001", 7.5, 0);
        players[1] = new Runners("R002", 6.5, 0);
        players[2] = new Runners("R003", 9, 0);
        players[3] = new Runners("R004", 8, 0);
        players[4] = new Runners("R005", 8.2, 0);

        HW_0920.showAll(players);


        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < players.length; j++) {
                players[j].moveByTopSpeed();
            }
        }
        for (int i = 6; i <= 20; i++) {
            players[0].move(6);
            players[1].move(6);
            players[2].move(5);
            players[3].move(5);
            players[4].move(5);

        }

        showAll(players);
        Runners.showWinner(players);

    }
}


class Runners {
    private String id;
    private double topSpeed;
    private double position;

    public Runners(String id, double topSpeed, double position) {
        this.id = id;
        this.topSpeed = topSpeed;
        this.position = position;
    }

    public void move(int x) {
        position = position + x;
    }

    public void show() {
        System.out.println("ID: " + id + " topSpeed: " + topSpeed + " Position: " + position);
    }

    public void moveByTopSpeed() {
        position = position + topSpeed;
    }

    public boolean isAheadOf(Runners r) {
        if (this.position > r.position) {
            return true;
        } else {
            return false;
        }
    }

    public double getPosition() {
        return position;
    }

    public void setPosition(double x) {
        position = x;
    }

    public String getId() {
        return id;
    }

    public void setId(String x) {
        id = x;
    }

    public static void showWinner(Runners[] players){
        double max = 0;
        int winner = -1;
        double min = players[0].getPosition();
        int loser = 0;
        for (int i = 0; i < players.length; i++) {
            if (players[i].getPosition() > max) {
                max = players[i].getPosition();
                winner = i;
            }
        }

        for (int i = 0; i < players.length; i++) {
            if(players[i].getPosition()<min){
                min=players[i].getPosition();
                loser=i;
            }
        }


        System.out.println("Max: " + max);
        System.out.println("Winner: " + players[winner].getId());
        System.out.println("Loser: " + players[loser].getId());
    }
}