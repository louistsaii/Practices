public class Practice_1017 {
    public static void main(String[] args) {
        boolean[] apple = new boolean[100];
        apple[3] = true;
        apple[6] = true;
        apple[7] = true;
        apple[10] = true;

        Runner1[] x = new Runner1[2];
        x[0] = new Runner1(2, 3);
        x[1] = new Runner1(1, 1);
        for (int i = 0; i < 10; i++) {
            System.out.println("Round " + i);
            System.out.println(x[0]);
            System.out.println(x[1]);
            x[0].move();
            x[1].move();
            x[0].checkApple(apple);
            x[1].checkApple(apple);
        }

    }
}

class Runner1 {
    private int position;
    private int speed;

    public Runner1(int position, int speed) {
        this.position = position;
        this.speed = speed;
    }

    public void move() {
        position = position + speed;
    }

    public String toString() {
        return "Position: " + position + " Speed: " + speed;
    }

    public void checkApple(boolean[] x) {
        if ( x[position] == true){
            speed = speed + 3;
            x[position] = false;
        }
    }
}