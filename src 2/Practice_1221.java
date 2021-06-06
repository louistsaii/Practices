import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse the standard input
 * according to the problem statement.
 **/
class Solution1 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] temp = new int[n];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int t = in.nextInt();
            temp[i] = t;
            if (temp[i] > 0) {
                if (temp[i] < min) {
                    min = temp[i];
                }
            }
            if (temp[i] < 0) {
                if (temp[i] > max) {
                    max = temp[i];
                }
            }

        }

        if(min==Integer.MAX_VALUE){
            System.out.println(max);
            return;
        }

        if(max==Integer.MIN_VALUE){
            System.out.println(min);
            return;
        }


        max=max*-1;
        if(max>min){
            System.out.println(min);
        }else if(min<max){
            System.out.println(max*-1);
        }else if(max==min){
            System.out.println(min);
        }

    }
}