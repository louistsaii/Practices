import java.util.ArrayList;

public class Practice_0131 {
    public static void main(String[] args) {
        int total = 0;
        int[][] x = new int[100][100];
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                if (Math.random() < 0.3) {
                    x[i][j] = 1;//30%
                    total = total + 1;
                }else{
                    x[i][j]=0;//70%
                }
                System.out.print(x[i][j]);



            }
            System.out.println();
        }
        System.out.println("Total: " + total);


    }


    public static void main2(String[] args) {
        ArrayList<String> x = new ArrayList<String>();
        x.add("Alice");
        x.add("Eric");
        x.add("Joe");
        x.add("Frank");
        x.add("Mark");


        for (int i = 0; i < 5; i++) {
            int y = (int) (Math.random() * x.size());
            System.out.println(x.get(y));
            x.remove(y);
        }

    }


    public static void main1(String[] args) {
        ArrayList<String> x = new ArrayList<String>();
        x.add("Alice");
        x.add("Eric");
        x.add("Joe");
        x.add("Frank");
        x.add("Mark");

        int[] z = new int[5];

        for (int i = 0; i < 10; i++) {
            int y = (int) (Math.random() * 5);
            System.out.println(x.get(y));
            z[y] = z[y] + 1;
        }
        for (int i : z) {
            System.out.println(i);
        }


    }
}
