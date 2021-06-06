public class Practice_0228 {
    public static void main(String[] args) {
        int[][] x = new int[3][4];
        int a = 1;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                x[i][j] = a;
                a = a + 1;
                System.out.print(x[i][j]);

                if (j == 3) {
                    System.out.println();
                } else {
                    System.out.print(",");
                }
            }
        }
    }


    public static void main1(String[] args) {
        String[][] x = new String[3][2];
        x[0][0] = "A";
        x[0][1] = "B";
        x[1][0] = "C";
        x[1][1] = "D";
        x[2][0] = "E";
        x[2][1] = "F";
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print(x[i][j]);
                if (j % 2 == 0) {

                } else {
                    System.out.println();
                }
            }
        }
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print(x[i][j]);
                if (j % 2 == 0) {
                    System.out.print(",");
                } else {
                    System.out.println();
                }
            }
        }


    }
}
