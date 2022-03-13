import java.util.Random;

class MyMaze1 {

    int width;
    int height;
    boolean[][] maze;
    int[][] numMaze;
    Random r = new Random();

    public MyMaze1(int w, int h) {
        this.width = w;
        this.height = h;
        maze = new boolean[this.height][this.width];
        numMaze = new int[this.height][this.width];
        for (int i = 0; i < numMaze.length; i++) {
            for (int j = 0; j < numMaze[i].length; j++) {
                numMaze[i][j] = r.nextInt(30);
            }
        }
        numMaze[0][0] = 0;
    }

    public void doSomething() {
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                if (numMaze[i][j] % 2 == 1) {
                    maze[i][j] = true;
                }
            }
        }
    }

    public void doSomething2() {
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                if (numMaze[i][j] == 0) {
                    if (i > 0) {
                        maze[i - 1][j] = true; //up
                    }
                    if (j > 0) {
                        maze[i][j - 1] = true; //left
                    }
                    if (i < maze.length) {
                        maze[i + 1][j] = true; //down
                    }
                    if (j < maze[i].length) {
                        maze[i][j + 1] = true; //right
                    }
                }
            }
        }
    }

    public void showMaze1() {

        for (int i = 0; i < maze.length; i++) {
            System.out.print(Color.WHITE);
            for (int j = 0; j < maze[i].length; j++) {
                String s = "" + numMaze[i][j];
                if (s.length() == 1) {
                    s = " " + s;
                }
                if (maze[i][j] == true) {
                    System.out.print(Color.BRIGHT_BG_CYAN + " " + s + " ");
                } else {
                    System.out.print(Color.BRIGHT_BG_BLACK + " " + s + " ");
                }

            }
            System.out.println(Color.RESET);
        }

    }

    public static void main(String[] args) {

        int n = 7 + (int) (Math.random() * 3) * 2;
        MyMaze1 m1 = new MyMaze1(n, n);
        m1.doSomething3();
        m1.showMaze1();

    }

    public void doSomething3(){
        for (int i = 0; i < maze.length; i++) {
                maze[i][maze[i].length-1] = true;
                maze[i][maze[i].length-2] = true;
        }
    }
}


