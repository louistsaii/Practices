public class Practice_0530_2 {
    public static void main(String[] args) {
        int[] x = {2, 3, 2, 1, 3};
        for (int i = 0; i < x.length; i++) {
            if (x[i] == 0) {
                continue;
            }
            for (int j = i+1; j < x.length; j++) {
                if (x[i] == x[j]) {
                    x[j] = 0;
                }
            }
        }
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
    }
}
