public class Practice_0624 {
    public static void main(String[] args) {
        Practice a1 = new Practice();
        a1.total = 100;
        a1.info = "a1.task";

        Practice a2 = new Practice();
        a2.total = 200;
        a2. info = "a2.task";

        a1.task1(3);
        a2.task1(5);

        a2.task2();
        a1.task2();
    }
}

class Practice {
    int total;
    String info;

    void task1(int x) {
        total = total+x;
        //System.out.println(info+ ": task1 "+ "total>>> " + total);
    }

    void task2() {
        System.out.println("===========");
        System.out.println(info+" : "+total);
        System.out.println("===========");
    }

    void task3(int y) {
        task1(y);
        task2();
    }
}


