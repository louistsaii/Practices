import java.util.ArrayList;

public class Practice_1126 {
    public static void main(String[] args) {
        String s1 = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < 5; i= i+2) {
            System.out.println(s1.substring(i,i+4));
        }
    }


    public static void main1(String[] args) {
        String s1 = "abc";
        ArrayList<String> x = new ArrayList<>();
        x.add("ABC");
        x.add("bbb");
        x.add("abc");
        x.add("Cba");

//        for (int i = 0; i <x.size(); i++) {
//            int z = s1.compareTo(x.get(i));
//            if(z == 0){
//                System.out.println(i+1 +  " is True");
//            } else {
//                System.out.println("False");
//            }
//        }

        for (int i = 0; i < x.size(); i++) {
            boolean z = s1.equals(x.get(i));
            if(z == true){
                System.out.println(i+1 + " is True");
            }else{
                System.out.println("False");
            }
        }
    }
}
