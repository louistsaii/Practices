import javax.imageio.stream.ImageInputStreamImpl;

public class Practice_1006 {
    public static void main(String[] args){
    }

    public static void main1(String[] arg) {
        dinner a1 = new dinner();
        dinner a2 = new dinner();
        dinner a3 = new dinner();
        a1.eat();
        a1.show();
        a2.eat();
        a2.show();
        a3.eat();
        a3.show();

    }
}

class dinner {
    static int food = 10;

    void eat() {
        food = food - 1;
    }

    void show() {
        System.out.println("Food= " + food);
    }
}