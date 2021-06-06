public class Practice_0117 {
    public static void main(String[] args) {
        String[][] table = new String[][]{
                {"A", "B", "C", "D", "E"},
                {"F", "G", "H", "I", "J"},
                {"K", "L", "M", "N", "O"}
        };

        for (int i = 0; i < table.length ; i++) {
            for (int j = 0; j <table[i].length ; j++) {
                System.out.print(table[i][j]);
            }
            System.out.println();
        }

        for (int j = 0; j < table[0].length; j++) {
            for (int i = 0; i < table.length ; i++) {
                System.out.print(table[i][j]);
            }
            System.out.println();
        }
    }







    public static void main1(String[] args) {
        String[][] table = new String[][]{
                {"A", "B", "C", "D", "E"},
                {"F", "G", "H", "I", "J"},
                {"K", "L", "M", "N", "O"}
        };

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j]);
            }
            System.out.println();
        }

        System.out.println("------------");

        for (int j = 0; j < table[0].length; j++) {
            for (int i = 0; i < table.length; i++) {
                System.out.print(table[i][j]);
            }
            System.out.println();
        }
    }
}
