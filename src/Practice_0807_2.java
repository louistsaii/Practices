public class Practice_0807_2 {
    public static void main(String[] args) {
        String[][] x = new String[2][3];
        x[0][0] = "A";
        x[0][1] = "P";
        x[0][2] = "P";
        x[1][0] = "W";
        x[1][1] = "I";
        x[1][2] = "N";

        for (int i = 0; i < x.length ; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.println(x[i][j]);
            }
            System.out.println("------------------");
        }
    }
}

