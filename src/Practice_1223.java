import java.util.Random;

public class Practice_1223 {
    public static void main(String[] args) {
        Seats mySeat = new Seats(3, 5);

        Random r = new Random();
        int ri = r.nextInt(3);
        int ci = r.nextInt(5);
        System.out.println("order :" + ri + "," + ci + " ==> " + mySeat.order(ri, ci));

        mySeat.showSeats();

        int n = 0 ;
        int i = 0 ;
        while( n<4 ){
            // ri:3
            // 3,0  3,1  3,2  3,3  3,4
            if( mySeat.order(ri,i)== true){
                n++ ;
            }
            i++ ;
        }

//        for (int i = 0; i < ; i++) {
//            // order at the same row ( row:ri)
//            if(mySeat.order(ri,i) == false){
//
//            };
//
//        }
        mySeat.showSeats();
    }
}

class Seats {

    private boolean[][] seats;

    public Seats(int m, int n) {

        // create an array with size m*n
        seats = new boolean[m][n];
    }

    public boolean order(int r, int c) {

        if (seats.length > r && seats[0].length > c) {
            if (seats[r][c] == false) {
                seats[r][c] = true;
                return true;
            }
        }
        return false;
    }

    public int getRowAvaNum(int r) {
        int total = 0;
        for (int i = 0; i < seats[0].length; i++) {
            if (seats[r][i] == false) {
                total = total + 1;
            }
        }
        return total;
    }

    public int getColAvaNum(int c) {
        int total = 0;
        for (int i = 0; i < seats.length; i++) {
            if (seats[i][c] == false) {
                total = total + 1;
            }
        }
        return total;
    }

    public int[] getRowAva(int r) {
        int x = getRowAvaNum(r);
        int[] available = new int[x];
        int a = 0;
        for (int i = 0; i < seats[0].length; i++) {
            if (seats[r][i] == false) {
                // available
                available[a] = i;
                a = a + 1;

            }
        }
        return available;
    }

    public int[] getColAva(int c) {
        int x = getColAvaNum(c);
        int[] available = new int[x];
        int a = 0;
        for (int i = 0; i < seats.length; i++) {
            if (seats[i][c] == false) {
                // available
                available[a] = i;
                a = a + 1;
            }
        }
        return available;
    }

    public void showSeats() {
        System.out.println("---------------------------------");
        for (int i = 0; i < seats.length; i++) {
            System.out.print("|");
            for (int j = 0; j < seats[i].length; j++) {
                if (seats[i][j])
                    System.out.print("#|");
                else
                    System.out.print(" |");
            }
            System.out.println();
        }
    }
}