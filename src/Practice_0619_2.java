public class Practice_0619_2 {
    public static void main(String[] args) {

        Task06192 x = new Task06192();
        Task06193 y = new Task06193();

        int z = x.act(20);
        System.out.println("i*i = " + z);
        int a = x.act2(20);
        System.out.println("i+i = " + a);


    }
}

class Task06193 {
    void method() {
        System.out.println("method");
    }
}

class Task06192 {
    int act(int i) {
        //System.out.println("act");
        //System.out.println("i ----> " + i);
        //System.out.println(i*i);
        return i*i;
    }

    int act2(int i) {
        //System.out.println("act2");
        System.out.println("i = " + i);
        //System.out.println(i+i)
        return i+i;
    }

    void act3() {
        System.out.println("act3");
    }

    void act4() {
        System.out.println("act4");
    }
}