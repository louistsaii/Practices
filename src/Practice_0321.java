public class Practice_0321 {
    public static void main(String[] args) {
        String[][] x = new String[3][5];
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
//                int y = (int) (Math.random() * 2);
//                if (y == 0) {
//                    x[i][j] = "J";
//                } else if (y == 1) {
//                    x[i][j] = "L";
//                }
                if(Math.random()<0.5){
                    x[i][j] = "J";
                }else{
                    x[i][j] = "L";
                }
            }
        }
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print(x[i][j]);
                if (j!=4){
                    System.out.print(",");
                }else if(j==4){
                    System.out.println();
                }
            }
        }
    }
}
