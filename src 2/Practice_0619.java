public class Practice_0619 {

    public static void main(String[] args) {

        Task t1 = new Task();
        t1.act1();
        int location = 50;
        location = t1.move(20, location);
        System.out.println("Location: "+location);

    }
}

class Task {

    void act1() {
        System.out.println("--------act1--------");
    }

    int move(int n, int location) {
        for (int i = 0; i < n; i++) {
            location = oneStep(location);
        }
        return location;
    }

    int oneStep(int location) {
        location = location + 1;
        System.out.println("1 step ------>" + location+ "k");
        return location;
    }

}