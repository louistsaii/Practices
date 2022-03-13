class Color {

    public static final String RESET = "\u001B[0m";

    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";

    public static final String BRIGHT_BLACK = "\u001B[90m";
    public static final String BRIGHT_RED = "\u001B[91m";
    public static final String BRIGHT_GREEN = "\u001B[92m";
    public static final String BRIGHT_YELLOW = "\u001B[93m";
    public static final String BRIGHT_BLUE = "\u001B[94m";
    public static final String BRIGHT_PURPLE = "\u001B[95m";
    public static final String BRIGHT_CYAN = "\u001B[96m";
    public static final String BRIGHT_WHITE = "\u001B[97m";

    public static final String[] FOREGROUNDS = {
            BLACK, RED, GREEN, YELLOW,
            BLUE, PURPLE, CYAN, WHITE,
            BRIGHT_BLACK, BRIGHT_RED, BRIGHT_GREEN, BRIGHT_YELLOW,
            BRIGHT_BLUE, BRIGHT_PURPLE, BRIGHT_CYAN, BRIGHT_WHITE
    };

    public static final String BG_BLACK = "\u001B[40m";
    public static final String BG_RED = "\u001B[41m";
    public static final String BG_GREEN = "\u001B[42m";
    public static final String BG_YELLOW = "\u001B[43m";
    public static final String BG_BLUE = "\u001B[44m";
    public static final String BG_PURPLE = "\u001B[45m";
    public static final String BG_CYAN = "\u001B[46m";
    public static final String BG_WHITE = "\u001B[47m";

    public static final String BRIGHT_BG_BLACK = "\u001B[100m";
    public static final String BRIGHT_BG_RED = "\u001B[101m";
    public static final String BRIGHT_BG_GREEN = "\u001B[102m";
    public static final String BRIGHT_BG_YELLOW = "\u001B[103m";
    public static final String BRIGHT_BG_BLUE = "\u001B[104m";
    public static final String BRIGHT_BG_PURPLE = "\u001B[105m";
    public static final String BRIGHT_BG_CYAN = "\u001B[106m";
    public static final String BRIGHT_BG_WHITE = "\u001B[107m";

    public static void main(String[] args) {

//        System.out.println(RED+"TT"+GREEN+"EE"+BLUE+"SS"+PURPLE+"TT ");
//        System.out.println(RESET);
//        System.out.println("hello");

        int n = 7 + (int) (Math.random() * 3) * 2;
        n=7;
        MyMaze m1 = new MyMaze(n, n);
        m1.doSomething2();
        m1.showMaze();

    }

}

class MyMaze {

    int width;
    int height;
    boolean[][] maze;

    public MyMaze(int w, int h) {
        this.width = w;
        this.height = h;
        maze = new boolean[this.height][this.width];
    }

    public void doSomething() {
//        for (int i = 0; i < maze.length; i++) {
//            for (int j = 0; j < maze[i].length; j++) {
//                maze[width / 2][j] = true;
//                System.out.println("HI");
//                maze[i][height / 2] = true;
//            }
//        }

//        for (int i = 0; i < maze.length; i++) {
//            for (int j = 0; j < maze[i].length; j++) {
//                maze[i][i] = true;
//            }
//        }
    }

    public void doSomething2() {
        for (int i = 0; i < maze.length; i++) {
            maze[width / 2][i] = true;
        }
        for (int i = 0; i < maze.length; i++) {
            maze[i][height / 2] = true;
        }

        for (int i = 0; i <maze.length ; i++) {
            maze[i][i] = true;
        }
    }


    public void showMaze() {

        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {

                if (maze[i][j] == true) {
                    System.out.print(Color.BRIGHT_BG_CYAN + "   ");
                } else {
                    System.out.print(Color.BRIGHT_BG_BLACK + "   ");
                }

            }
            System.out.println(Color.RESET);
        }

    }
}