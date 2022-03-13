import java.util.ArrayList;

class Student4{
    Student4 s;
    public Student4(){
        this.s = s;
    }


}

class MultPractice{

    private int a;
    private int b;

    public MultPractice( int a , int b){
        this.a = a;
        this.b = b;
    }

    public String getProblem(){
        String a1 = a + " TIMES " + b;
        return a1;
    }

    public void nextProblem(){
        b = b + 1;
    }

}

class Test2{
    public static void main(String[] args){
        MultPractice p1 = new MultPractice(7,3) ;
        System.out.println( p1.getProblem()) ; // 7 TIMES 3

        p1.nextProblem() ;
        System.out.println( p1.getProblem()) ; // 7 TIMES 4

        p1.nextProblem() ;
        System.out.println( p1.getProblem()) ; // 7 TIMES 5

        MultPractice p2 = new MultPractice(4,12) ;
        System.out.println( p2.getProblem()) ; // 4 TIMES 12

        p2.nextProblem() ;
        System.out.println( p2.getProblem()) ; // 4 TIMES 13

        p2.nextProblem() ;
        System.out.println( p2.getProblem()) ; // 4 TIMES 14

    }
}






public class FreeResponse_2017 {
    public static void main(String[] args) {
        Digits a1 = new Digits(12567);
        for (int i = 0; i < a1.digitlist.size(); i++) {
            System.out.println(a1.digitlist.get(i));
        }
    }
}


class Digits {
    ArrayList<Integer> digitlist;

    public Digits(int num) {
        digitlist = new ArrayList<>();
        String s = "" + num;
        for (int i = 0; i < s.length(); i++) {
            String x = (s.substring(i, i + 1));
            digitlist.add(Integer.parseInt(x));
        }

    }
    public boolean isStrictlyIncreasing() {
        for (int i = 0; i < digitlist.size()-1; i++) {
            int x = digitlist.get(i);
            int y = digitlist.get(i+1);
            if(y<=x){
                return false;
            }
        }
    return true;
    }

}
