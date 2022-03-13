public class Practice_1205 {
    public static void main(String[] args) {
        LightBoard a1 = new LightBoard(8,10);
        a1.show();
        boolean x = a1.evaluateLight(5,5);
        System.out.println(x);
    }
}

class LightBoard {

    /**
     * The lights on the board, where true represents
     * on and false represents off.
     */
    private boolean[][] lights;


    /**
     * Constructs a LightBoard object having numRows rows and numCols columns.
     * Precondition: numRows > 0, numCols > 0
     * Postcondition: each light has a 40% probability of being set to on.
     */
    public LightBoard(int numRows, int numCols) {
        lights = new boolean[numRows][numCols];
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                if (Math.random() < 0.4) {
                    lights[i][j] = true;
                } else {
                    lights[i][j] = false;
                }
            }
        }
    }

    /**
     * Evaluates a light in row index row and column index col and returns a status
     * as described in part (b).
     * Precondition: row and col are valid indexes in lights.
     */
    public boolean evaluateLight(int row, int col) {
        if (lights[row][col] == true) {
            int total = 0;
            for (int i = 0; i < row; i++) {
                if (lights[i][col] == true) {
                    total = total + 1;
                }
            }
            if (total % 2 == 0) {
                return false;
            }

        } else {
            int total = 0;
            for (int i = 0; i < row; i++) {
                if (lights[i][col] == true) {
                    total = total + 1;
                }
            }
            if (total % 3 == 0) {
                return true;
            }
        }
        return lights[row][col];
    }

    public void show(){
        for (int i = 0; i <lights.length ; i++) {
            for (int j = 0; j <lights[i].length ; j++) {
                if(lights[i][j]==true){
                    System.out.print("V");
                }else{
                    System.out.print("_");
                }
            }System.out.println();
        }

    }
}
