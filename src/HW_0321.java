public class HW_0321 {
    public static void main(String[] args) {
        String[][]x = new String[7][8];
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j <x[i].length ; j++) {
                if(i==0 || i==6){
                    x[i][j] = "L";
                }else if(j==0||j==7){
                    x[i][j] = "L";
                }else if(j!=0 || j!=7){
                    x[i][j] = "o";
                }
            }
        }
        for (int i = 0; i <x.length ; i++) {
            for (int j = 0; j <x[i].length ; j++) {
                System.out.print(x[i][j]);
                if(j==7){
                    System.out.println();
                }
            }
        }
    }
}
