public class Practice_0622_2 {
    public static void main(String[] args) {
        Computer a1 = new Computer();
        int v = a1.add(12, 34);

        int w = a1.add(56, 78);

        int z = a1.multiply(v, w);
        System.out.println("Total>>>" + z);
    }
}

class Computer {
    int add(int x, int y) {
        int c = x + y;
        return c;
    }

    int multiply(int x, int y) {
        int d = x * y;
        return d;
    }
}