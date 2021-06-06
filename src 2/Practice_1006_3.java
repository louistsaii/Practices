public class Practice_1006_3 {
    public static void main(String[] args) {
        Practice_1006_3.m1(4, 3);

        int w = Practice_1006_3.m2(11,11);
        int x = Practice_1006_3.m2(w,w);
    }

    public static void m1(int x, int y) {
        int z = x * y;
        System.out.println("Product: " + z);
    }

    public static int m2(int x, int y) {
        int z = x * y;
        System.out.println("Product: " + z);
        return z;
    }
}

