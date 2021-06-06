import java.util.ArrayList;
import java.util.Arrays;

class CharArrayBuilder {

    private char[] data;

    public CharArrayBuilder(String x) {
        data = new char[x.length()];
        for (int i = 0; i < x.length(); i++) {
            char a = x.charAt(i);
            data[i] = a;
        }
    }

    public char[] getData1(){
        return data;
    }
}


class ArrayBuilder {
    //encapsulation
    private int[] data;
    private int index = 0;

    public ArrayBuilder(int size) {
        data = new int[size];
    }

    public void add(int x) {
        data[index] = x;
        index++;
    }

    //encapsulation
    public int[] getData() {
        return data;
    }
}


class A {

    public static void main(String[] args) {

        int[] arr = {1, 5, 2, 4, 3, 2, 6, 7, 3, 8, 2, 1, 7};
        int[] result = getEvenList(arr);
        System.out.println(Arrays.toString(result));
        int[] result1 = getOddList(arr);
        System.out.println(Arrays.toString(result1));
        ArrayList<Integer> result2 = getEvenList2(arr);
        System.out.println(result2);
    }

    public static int[] getEvenList(int[] data) {
        int x = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 == 0) {
                x = x + 1;
            }

        }

        int[] newArr = new int[x];
        int y = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 == 0) {
                newArr[y] = data[i];
                y = y + 1;
            }
        }
        return newArr;
    }

    public static int[] getOddList(int[] data) {
        int x = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 == 1) {
                x = x + 1;
            }

        }


        int[] newArr1 = new int[x];
        int y = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 == 1) {
                newArr1[y] = data[i];
                y = y + 1;
            }
        }
        return newArr1;
    }

    public static ArrayList<Integer> getEvenList2(int[] data) {
        ArrayList<Integer> newArr = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 == 0) {
                newArr.add(data[i]);
            }

        }
        return newArr;
    }

}


