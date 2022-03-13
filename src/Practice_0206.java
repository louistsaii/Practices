import java.util.*;
import java.io.*;
import java.math.*;

class CheckerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        if (sc.hasNextLine()) {
            sc.nextLine();
        }

        String b = sc.nextLine();
        Checker a1 = new Checker();
        while (b != null) {
            String x = a1.rv(b);
            b=x;
        }
    }
}


class Checker {
    public int check(String b) {
        if (b.indexOf("##") == 0) {
            return 0;
        } else if (b.indexOf("# #") == 0) {
            return 1;
        } else {
            return -1;
        }
    }

    public void act(int x) {
        if (x == 0) {
            System.out.print("w");
        } else if (x == 1) {
            System.out.print("j");
        }
    }

    public String rv(String b) {
        int r = check(b);
        if (r == 0) {
            act(0);
            return b.substring(1);
        } else if (r == 1) {
            act(1);
            return b.substring(2);
        } else {
            return null;
        }
    }
}