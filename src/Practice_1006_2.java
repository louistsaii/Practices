public class Practice_1006_2 {

    public static void main(String[] args) {
        Num n1 = new Num(10);
        Num n2 = new Num(20);
        Num n3 = new Num(30);

        n1.f1();
        n2.f1();
        n3.f1();

        Num.show();
        n1.show();
    }
}

class Num {

    static int x = 100;
    int y;

    public Num(int p) {
        y = p;
    }

    public void f1() {
        x = x + y;
    }

    public static void show() {
        System.out.println("x -> " + x);
    }

}

