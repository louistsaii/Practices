import javax.print.attribute.standard.Severity;
import java.lang.annotation.Repeatable;

public class Practice_0608 {

    public static void main(String[] args) {
        int i = 1;

        while (true) {

            System.out.println(">> " + i);

            if (i > 5) {
                i = i + 5;
                continue;
            }

            System.out.println(" -- " + i + " -- ");

            i = i + 1;

            if (i > 12) {
                break;
            }

        }
    }

    public static void main5(String[] args) {

        for (int i = 1; i <= 10; i = i + 1) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }

    }


    public static void main4(String[] args) {
        int k = 0;
        for (int i = 1; i <= 101; i = i + 5) {
            //System.out.println(i);
            System.out.println(k);
            k = k + 5;
        }
    }


    public static void main3(String[] args) {
        int k = 2503;
        for (int i = 1; i <= 8; i = i + 1) {
            //System.out.println(i);
            System.out.println(k);
            k = k + 7;
        }
    }


    public static void main2(String[] args) {
        int k = 1024;
        for (int i = 1; i <= 5; i = i + 1) {
            //System.out.println(i);
            System.out.println(k);
            k = k * 2;

        }


    }


    //    public static void main(String[] args) {
//        int i=1;
//        int k=1;
//        while (i<=10){
//            //System.out.println (i);
//            i=i+1;
//            k=k*3;
//            System.out.println(k);
//        }
//    }
}
