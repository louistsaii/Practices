public class Practice_1229 {
    public static void main(String[] args) {
        int[] arr1 = {11, -2, 3, 4, 5, -6, 7};

        int total = 0;
        for (int i = 0; i < arr1.length; i++) {
            total = total + arr1[i];
        }
        System.out.println(total);

        int[][] table1 = {
                {15, 2, 73, 4, 5},
                {21, -22, 23, 24, 25},
                {31, 32, 33, 34, -35}
        };

        int total1 = 0;
        for (int i = 0; i < table1.length; i++) {
            for (int j = 0; j < table1[i].length; j++) {
                total1 = total1 + table1[i][j];
            }
        }

        System.out.println(total1);

        int max = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > max) {
                max = arr1[i];
            }
        }

        System.out.println(max);

        int max1 = 0;
        for (int i = 0; i < table1.length; i++) {
            for (int j = 0; j < table1[i].length; j++) {
                if (table1[i][j] > max1) {
                    max1 = table1[i][j];
                }
            }
        }

        System.out.println(max1);


        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] < min) {
                min = arr1[i];
            }
        }

        System.out.println(min);

        int min1 = Integer.MAX_VALUE;
        for (int i = 0; i < table1.length; i++) {
            for (int j = 0; j < table1[i].length; j++) {
                if (table1[i][j] < min1) {
                    min1 = table1[i][j];
                }
            }
        }

        System.out.println(min1);
    }
}
