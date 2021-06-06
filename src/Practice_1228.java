public class Practice_1228 {
    public static void main(String[] args) {
        int[][] twoDimArray = {
                {1, 2, 3, 1}, // first array of int
                {3, 4, 1, 2}, // second array of int
                {4, 4, 1, 0}  // third array of int

        };

        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                if (j == 1) {
                    System.out.print(twoDimArray[i][j]);
                }
            }
        }

        System.out.println();

        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                if (j == 2) {
                    System.out.print(twoDimArray[i][j]);
                }
            }
        }

        System.out.println();


        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                System.out.print(twoDimArray[i][j]);

            }
            System.out.println();
        }

        for (int i = 0; i < twoDimArray.length ; i++) {
            for (int j = 0; j < twoDimArray[i].length ; j++) {
                if(i==1){
                    System.out.print(twoDimArray[i][j]);
                }

            }
        }
    }


    public static void main1(String[] args) {
        int[] test = {1, 3, 5, 0, 1, 2, 3, 4, 5, 0, 6, 7, 8, 9};
        Practice_1228 a1 = new Practice_1228();
        a1.skipZero(test);
        System.out.println("------------------");
        a1.skipZeroOnce(test);
    }


    public int[] skipZero(int[] x) {
        boolean twoStep = false;

        for (int i = 0; i < x.length; i++) {
            if (x[i] == 0) {
                twoStep = true;
            }
            if (twoStep == true) {
                System.out.println(x[i]);
                i = i + 2;
            } else {
                System.out.println(x[i]);
            }
        }

        return x;
    }

    public void skipZeroOnce(int[] x) {

        for (int i = 0; i < x.length; i++) {

            if (x[i] == 0) {
                System.out.println(x[i]);
                i = i + 1;
            } else {
                System.out.println(x[i]);
            }
        }
    }
}
