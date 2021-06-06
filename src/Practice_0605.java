import java.sql.SQLOutput;
import java.util.Scanner;

public class Practice_0605 {

    //game
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("set target number :");
        int target = sc.nextInt();
        System.out.println("======================");
        System.out.println("   TARGET : "+target);
        System.out.println("======================");

        while(target>0){
            System.out.print("enter a number :");
            int n = sc.nextInt() ;
            System.out.println(" ==> "+n);
            if( n<=3 &&  n>0){
                target = target-n ;
            }else{
                System.out.println("Please enter a number between 1 and 3!!!");
            }
        }

        if( target == 0){
            System.out.println("WIN!!!");
        }else{
            System.out.println("LOSE!!!");
        }
    }
}













//    public static void main3(String[] args) {
//
//        for(int i=1; i<=3;i=i+1){
//            System.out.println("#######");
//        }
//        for (int i=1; i<=5; i=i+1){
//            System.out.println("  ###  ");
//        }
//        for(int i=1; i<=3;i=i+1){
//            System.out.println("#######");
//        }
//




//        System.out.println("#######");
//        System.out.println("#######");
//        System.out.println("#######");
//        System.out.println("  ###  ");
//        System.out.println("  ###  ");
//        System.out.println("  ###  ");
//        System.out.println("  ###  ");
//        System.out.println("  ###  ");
//        System.out.println("#######");
//        System.out.println("#######");
//        System.out.println("#######");

//    }
//
//
//    public static void main2(String[] args) {
//        for (int i=10;i>=4;i=i-2){
//            System.out.println (i);
//        }
//    }
//
//
//    public static void main1
//            (String[] args) {
//        String t = "";
//        for (int i = 1; i <= 5; i = i + 1) {
//            if (i <= 4) {
//                t = t + 1 + ",";
//            } else {
//                t = t + 1;
//            }
//        }
//        System.out.println(t);
//    }
//}
