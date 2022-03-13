import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution2 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for (int i = 0; i < N; i++) {
            String inp = in.next();
            String out = in.next();
            String number = in.next();
            int outN = 0;
            int x = 0;

            if (inp.equals("bin")) {
                x = Integer.parseInt(number, 2);
            } else if (inp.equals("hex")) {
                x = Integer.parseInt(number, 16);
            } else {
                x = Integer.parseInt(number, 10);
            }
            if (out.equals("bin")) {
                String binX2 = Integer.toBinaryString(x);
                System.out.println(binX2);
            } else if (out.equals("hex")) {
                String hexStr2 = Integer.toHexString(x);
                System.out.println(hexStr2);
            } else {
                String decX2 = Integer.toString(x);
                System.out.println(decX2);
            }
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");


    }
}

