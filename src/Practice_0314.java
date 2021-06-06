public class Practice_0314 {
    public static void main(String[] args) {
        int[][] x = new int[3][4];
        for (int i = 0; i <x.length ; i++) {
            for (int j = 0; j <x[i].length ; j++) {
                int y = (int)(10+Math.random()*10);
                x[i][j] = y;
                System.out.print(x[i][j]);
                if(j!=3){
                    System.out.print(",");
                }else if(j==3 && i!=2){
                    System.out.println();
                    System.out.println("-----------");
                }
            }
        }
    }
}
