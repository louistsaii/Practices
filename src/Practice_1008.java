import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Practice_1008 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(6);
        list.add(9);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        ArrayList<Student> student = new ArrayList<Student>();
        Student a1 = new Student("Mary",98);
        Student a2 = new Student("Leo",100);
        Student a3 = new Student("Jay",95);
        student.add(a1);
        student.add(a2);
        student.add(a3);

        for (int i = 0; i <student.size(); i++) {
            Student x = student.get(i);
            x.show();
        }

        for (Student s1 : student) {
            if(s1.getScore()==100){
                String x = s1.getName();
                System.out.println(x);

            }
        }


    }




    public static void main2(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Mary");
        list.add("Leo");
        list.add("Jay");
        list.add("Ray");
        list.add("Annie");

        if (list.contains("Mary")){
            System.out.println("Yes 1");
            int x = list.indexOf("Mary");
            System.out.println(x);

            System.out.println(list.get(x));
        }else{
            System.out.println("No 1");
        }

        if (list.contains("Louis")){
            System.out.println("Yes 2");
        }else{
            System.out.println("No 2");
        }
        int y = list.indexOf("Louis");
        System.out.println(y);

        while(list.size()>0){
            String x = list.remove(0);
            System.out.println(x + " come get mask");
        }
        System.out.println(list);

    }


    public static void main1(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(7);
        list.add(0,3);
        list.add(2,6);
        list.add(9);
        System.out.println(list);

        int total = 0;
        for (Integer integer : list) {
            total = total + integer;
        }
        System.out.println(total);
    }
}

class Student{
    private String name;
    private int score;

    public Student(String name, int score){
        this.name = name;
        this.score = score;
    }

    public void show(){
        System.out.println("Name: " + name + " Score: " + score);
    }

    public int getScore(){
        return score;
    }

    public String getName(){
        return name;
    }
}
