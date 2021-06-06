public class Practice_0110 {
    public static void main(String[] args) {
        int[][] x = {
                {5, 4, 6},
                {2, 1, 8},
                {7, 0, 2}
        };

        for (int j = 0; j < x[0].length; j++) {
            for (int i = 0; i < x.length; i++) {
                System.out.print(x[i][j]);
            }
            System.out.println();
        }

        System.out.println("-------------");

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print(x[i][j]);
            }
            System.out.println();
        }

        System.out.println("-------------");

        int j = 1;
        for (int i = x.length - 1; i >= 0; i--) {
            System.out.print(x[i][j]);
        }

        for (int i = 0; i <x.length; i++) {
            for (int k = 0; k < x[i].length; k++) {
                if(i==k){
                    System.out.println(x[i][k]);
                }
            }
        }

        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i][i]);
        }
    }


    public static void main1(String[] args) {
        int[][] table1 = {
                {1, 4, 3, 4, 5},
                {2, 3, 1, 5, 9},
                {1, 7, 3, 4, 5}
        };
        int total = 0;
        for (int i = 0; i < table1.length; i++) {
            for (int j = 0; j < table1[i].length; j++) {
                if (table1[i][j] % 2 == 0) {
                    total = total + 1;
                }
            }
        }
        System.out.println(total);

        Practice_0110 a1 = new Practice_0110();

        int[] x = a1.getEvenNumber(table1);
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
    }

    public int[] getEvenNumber(int[][] x) {
        int[] newArr = new int[x[0].length];
        for (int j = 0; j < x[0].length; j++) {
            for (int i = 0; i < x.length; i++) {
                if (x[i][j] % 2 == 0) {
                    newArr[j] = newArr[j] + 1;

                }
            }
        }
        return newArr;
    }
}
