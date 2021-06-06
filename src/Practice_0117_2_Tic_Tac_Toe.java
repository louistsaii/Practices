import java.util.Scanner;

public class Practice_0117_2_Tic_Tac_Toe {
    public static void main(String[] args) {
        int[][] table = new int[3][3];

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = 1;
            }
        }
        for (int i = 0; i < 9; i++) {
            setData(input(), table);
            play(table);
            computer(table);
            play(table);
        }


    }

    public static void play(int[][] x) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                if (x[i][j] == 2) {
                    System.out.print("O");
                } else if (x[i][j] == 3) {
                    System.out.print("X");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }

    public static String input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pick a key to press");
        System.out.println("q,w,e,");
        System.out.println("a,s,d");
        System.out.println("z,x,c");
        String s = sc.nextLine();   // 讀一行文字

        return s;
    }

    public static void setData(String s, int[][] x) {
        if (s.equals("q")) {
            x[0][0] = 2;
        }

        if (s.equals("w")) {
            x[0][1] = 2;
        }

        if (s.equals("e")) {
            x[0][2] = 2;
        }

        if (s.equals("a")) {
            x[1][0] = 2;
        }

        if (s.equals("s")) {
            x[1][1] = 2;
        }

        if (s.equals("d")) {
            x[1][2] = 2;
        }

        if (s.equals("z")) {
            x[2][0] = 2;
        }

        if (s.equals("x")) {
            x[2][1] = 2;
        }

        if (s.equals("c")) {
            x[2][2] = 2;
        }
    }

    public static void computer(int[][] x) {
        while (true) {
            int y = (int) (Math.random() * 3);
            int z = (int) (Math.random() * 3);

            if (x[y][z] == 1) {
                x[y][z] = 3;
                break;
            }
        }
    }
}
