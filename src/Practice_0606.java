public class Practice_0606 {
    public static void main(String[] args) {
        int[] x = {121, 122, 123, 124, 125, 126, 127};
        int a = 0;
        int[] y = new int[x.length];
        for (int i = 0; i < x.length; i++) {
            y[i] = a + 2;
            a = a + 1;
        }
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < y.length; j++) {
                System.out.println(x[i] + "," + y[j]);
            }
        }

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < y.length; j++)
                if (x[i] % y[j] == 0) {
                    System.out.println(x[i] + "," + y[j] + "(v)");
                } else {
                    System.out.println(x[i] + "," + y[j]);
                }
        }
    }
}
