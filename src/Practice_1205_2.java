public class Practice_1205_2 {
    static int getRowSum(boolean[][] lights, int row ){
        int total = 0;
        for (int i = 0; i < lights[row].length; i++) {
            if(lights[row][i]==true){
                total = total + 1;
            }
        }
        return total;
    }

    static int getColumnSum( boolean[][] lights,int col ){
        int total = 0;
        for (int i = 0; i <lights.length ; i++) {
            if(lights[i][col]==true){
                total = total + 1;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        boolean[][] lights = new boolean[3][5];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <5 ; j++) {
                if(Math.random()<0.2){
                    lights[i][j] = true;
                }else{
                    lights[i][j] = false;
                }
            }
        }

        for (int i = 0; i < lights.length ; i++) {
            System.out.println();
            for (int j = 0; j <lights[i].length ; j++) {
                if(lights[i][j]==true){
                    System.out.print("V");
                }else
                    System.out.print("_");
            }
        }
        System.out.println();
        for (int i = 0; i < lights[0].length; i++) {
            int x = getColumnSum(lights,i);
            System.out.print(x);
        }


    }
}


