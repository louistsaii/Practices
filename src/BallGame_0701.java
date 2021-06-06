public class BallGame_0701 {
    public static void main(String[] args) {

    }
}

class Ball {
    int x;
    int y;
    int size;

    void resetLocation(int index) {
        //x[index] = int(random-300, -100));
        //y[index] = int(random(5, 750));
    }



    void isHit(Ball targetBall) {

    }

    void moveByMouse(int mX, int mY) {
        x = mX;
        y = mY;
    }

    void moveLeftToRight(int speed) {
        x = x + speed;
    }
}