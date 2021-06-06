import java.util.Scanner;

public class Practice_0530 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] x = new int[N];
        for (int i = 0; i < N; i++) {
            int X = in.nextInt();
            x[i] = X;
        }
        for (int i = 0; i < x.length; i++) {
            if(x[i]==-1000){
                continue;
            }
            for (int j = 0; j < x.length; j++) {

                if (i == j) {
                    continue;
                }
                if (x[i] == x[j]) {
                    x[j] = -1000;
                }
            }
            System.out.println("==");

            System.out.println(x[i]);
        }
    }
}


