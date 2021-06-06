import java.util.ArrayList;

public class HW_0117 {
    public static void main(String[] args) {

    }


    public static void main1(String[] args) {
        int x = (int)(Math.random()*10); // random between 0-9
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        int[][] Arr = {
                {4,5},
                {6,7}
        };

        for (int i = 0; i < Arr.length; i++) {
            for (int j = 0; j <Arr[i].length ; j++) {
                System.out.print(Arr[i][j]);
            }
            System.out.println();
        }
        ArrayList <Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(8);
        arrayList.add(9);
        arrayList.add(10);
        System.out.println(arrayList);
        }
    }


