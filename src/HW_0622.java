public class HW_0622 {
    public static void main(String[] args) {
        MathGear a1 = new MathGear();
        int e = a1.minus(24, 12);

        int f = a1.divide(96, e);

        System.out.println("Total= " + f);

    }
}

class MathGear {
    int minus(int a, int b) {
        int c = a - b;
        return c;
    }

    int divide(int a, int b) {
        int d = a / b;
        return d;
    }
}