public class Practice_1220 {
    public static void main(String[] args) {

    }
}

class Test {

    public static void main(String[] args) {
        String[][] tiles = new String[][]{
                {"A", "B", "C", "D", "E"},
                {"F", "G", "H", "I", "J"},
                {"K", "L", "M", "N", "O"}
        };
        Floor2 f = new Floor2(tiles);
        f.showZSequence();
    }

}

class Floor2 {

    private String[][] tiles;

    public Floor2(String[][] tiles) {
        this.tiles = tiles;
    }

    public String[] getColumn(int colIdx) {
        String[] x = new String[tiles.length];
        for (int i = 0; i < tiles.length; i++) {
            x[i] = tiles[i][colIdx];
        }
        return x;
    }

    public String[] getRevColumn(int colIdx) {
        String[] x = new String[tiles.length];
        int y = tiles.length - 1;
        for (int i = 0; i < tiles.length; i++) {
            x[i] = tiles[y][colIdx];
            y = y - 1;
        }
        return x;
    }

    //Go down, then go right by one, then go up, then go right, repeat (zigzag)
    public void showZSequence() {
        for (int i = 0; i < tiles[0].length; i++) {
            String[] x;
            if (i % 2 == 0) {
                x = getColumn(i);
            } else {
                x = getRevColumn(i);
            }
            for (int j = 0; j < x.length; j++) {
                System.out.print(x[j]);
            }
            System.out.println();
        }
    }

    public int getSameColumn() {
        for (int i = 1; i <= tiles[0].length - 1; i++) {
            String[] x = getColumn(0);
            String[] y = getColumn(i);
            boolean theSame = true;
            for (int j = 0; j < x.length; j++) {
                if (x[j].equals(y[j]) == false) {
                    theSame = false;
                }
            }
            if (theSame == true) {
                return i;
            }
        }
        return -1;
    }
}
