public class Practice_0603 {

    public static void main2(String[] args) {
        int total = 0;
        for (int i = 1; i <= 1000; i = i + 1) {
            total = total + i;
        }
        System.out.println(total);
    }

    public static void main(String[] args) {
        String t = "";
        for (int i = 1; i <= 10; i = i + 1) {
            if (i <= 9) {
                t = t + i + ",";
            } else {
                t = t + i;
            }

        }
        System.out.println(t);
    }
}
