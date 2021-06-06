public class Practice_1229_2 {
    public static void main(String[] args) {
        int[][] table1 = {
                {1, 2, 3, 4, 5},
                {21, 22, 23, 24, 25},
                {31, 32, 33, 34, 35}
        };


        for (int j = 0; j < table1[0].length; j++) {
            int total = 0;
            for (int i = 0; i < table1.length; i++) {
                total = total + table1[i][j];
                System.out.print(table1[i][j] + ",");
            }
            System.out.println("----------------" + total);
            //System.out.println();
        }
    }


    public static void main2(String[] args) {
        String[] str = {
                "..*.*",
                ".....",
                "...*.",
                "***..",
                ".....",
                "...*."};


        // a
        for (int i = 0; i < str.length; i++) {
            int total = 0;
            // b
            for (int j = 0; j < str[i].length(); j++) {
                char x = str[i].charAt(j);
                //c
                if (x == '*') {
                    total = total + 1;
                }
                //d
            }
            //e
            System.out.print(total);
        }
        // f
    }


    public static void main1(String[] args) {
        String[] str = {
                "..*..",
                ".....",
                ".....",
                ".*...",
                ".....",
                "...*."};

        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length(); j++) {
                char c = str[i].charAt(j);

                if (c == '*') {
                    System.out.println(i + "," + j);
                }
            }
        }
    }
}
