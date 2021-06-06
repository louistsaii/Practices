public class Practice_0610 {
    public static void main(String[] args) {
        String[] ids = new String[11];
        for (int i = 0; i <ids.length; i++) {
            ids[i] = "A"+i;

        }
        for (int i = 0; i < ids.length; i++) {
            System.out.println("arr" + "[" + i + "] -> " + ids[i]);
        }
    }

    public static void main1(String[] args) {
        int[] scores = new int[10];
        int value = 2;
        for (int i = 0; i < scores.length; i = i + 1) {
            scores[i] = value;
            value = value * 2;
        }
        System.out.println("----------");
        for (int i = 0; i < scores.length; i = i + 1) {
            System.out.println("arr" + "[" + i + "] -> " + scores[i]);
        }
        System.out.println("-----------");
        int total = 0;
        for (int i = 0; i < scores.length; i = i + 1) {
            total = total + scores[i];
        }
        System.out.println("total: " + total);


    }

}


