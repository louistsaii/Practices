import java.util.Arrays;

public class Practice_1219_2 {

}

class ArrayTester {

    public static int[] getColumn(int[][] arr2D, int c) {
        int[] newArray = new int[arr2D.length];
        for (int i = 0; i < arr2D.length; i++) {
            newArray[i] = arr2D[i][c];
        }
        return newArray;
    }

    public static boolean isLatin(int[][] square) {
        if (containsDuplicates(square[0]) == true) {
            return false;
        }
        for (int i = 0; i < square.length - 1; i++) {
            if (hasAllValues(square[i], square[i + 1]) == false) {
                return false;
            }
        }
        for (int i = 0; i < square[0].length; i++) {
            if (hasAllValues(getColumn(square, i), square[0]) == false) {
                return false;
            }
        }
        return true;
    }

    public static boolean hasAllValues(int[] arr1, int[] arr2) {
        return false;
    }

    public static boolean containsDuplicates(int[] arr) {
        return false;
    }

    public static void main(String[] args) {
        int[][] arr2D = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };
        int[] result = getColumn(arr2D, 9);
        System.out.println(Arrays.toString(result));


        arr2D = new int[][]{
                {1, 2},
                {1, 2}
        };

        arr2D = new int[][]{
                {1, 2, 3},
                {2, 3, 1},
                {3, 1, 2}
        };

        arr2D = new int[][]{
                {1, 2, 3},
                {3, 2, 1},
                {3, 1, 2}
        };
        arr2D = new int[][]{
                {1, 2, 3},
                {3, 1, 2},
                {7, 8, 9}
        };
        arr2D = new int[][]{
                {10, 30, 20, 0},
                {0, 20, 30, 10},
                {30, 0, 10, 20},
                {20, 10, 0, 30}
        };

        boolean isL = isLatin(arr2D);
        System.out.println(isL);


    }
}
