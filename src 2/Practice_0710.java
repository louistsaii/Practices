public class Practice_0710 {
    public static void main(String[] args) {
        int[] p = new int[4];
        p[0] = 6;
        p[1] = 7;
        p[2] = 4;
        p[3] = 2;

        int total = 0;
        for (int i = 0; i < p.length; i = i + 1) {
            total = total + p[i];
        }
        System.out.println("Total = " + total);
        int max = p[0];
        for (int i = 1; i < p.length; i++) {
            if (p[i] > max) {
                max = p[i];
            }
        }
        System.out.println("Max = " + max);
        int min = p[0];
        for (int i = 1; i < p.length; i++) {
            if (p[i] < min) {
                min = p[i];
            };
        }
        System.out.println("Min = " + min);
    }
}



