public class Practice_0906 {
    public static void main(String[] args) {

        Runner[] runners = new Runner[3];
        runners[0] = new Runner("R001", 7.2, 0);
        runners[1] = new Runner("R002", 8, 0);
        runners[2] = new Runner("R003", 7.5, 0);

        for (Runner x : runners) {
            x.show();
        }

        for (int i = 0; i < 7; i++) {
            runners[0].move(5);
            runners[1].move(4);
            runners[2].move(5);
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < runners.length; j++) {
                runners[j].moveByTopSpeed();
            }
        }
        for (int i = 0; i < runners.length; i++) {
            runners[i].show();
        }

        double max = 0;
        int winner = -1;
        for (int i = 0; i < runners.length; i++) {
            if (runners[i].getPosition() > max) {
                max = runners[i].getPosition();
                winner = i;
            }
        }
        System.out.println("Max: " + max);
        System.out.println(runners[winner].getId());
    }


    public static void main1(String[] args) {
        Runner r1 = new Runner("R001", 7.2, 0);
        r1.show();
        Runner r2 = new Runner("R002", 8, 3);
        r2.show();
        Runner r3 = new Runner("R003", 7.5, 2);
        r3.show();

        boolean x = r2.isAheadOf(r3);
        System.out.println(x);

        r2.moveByTopSpeed();
        r3.moveByTopSpeed();
        x = r2.isAheadOf(r3);
        System.out.println(x);


    }
}

class Runner {
    private String id;
    private double topSpeed;
    private double position;

    public Runner(String id, double topSpeed, double position) {
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

    public boolean isAheadOf(Runner r) {
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

    public String getId(){
        return id;
    }

    public void setId(String x){
        id = x;
    }
}