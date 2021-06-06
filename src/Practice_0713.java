public class Practice_0713 {
    public static void main(String[] args) {
        int[] x = new int[4];
        x[0] = 3;
        x[1] = 5;
        x[2] = 9;
        x[3] = 2;

        int total = 0;
        for (int i = 0; i < x.length; i++) {
            total = total + x[i];
        }
        System.out.println("Total: " + total);

        int max = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] > max) {
                max = x[i];
            }
        }
        System.out.println("Max: " + max);

        Laptop a1 = new Laptop("Macbook", 35000);
        a1.name = "Macbook";
        a1.price = 35000;
        a1.show();

        Laptop a2 = new Laptop("Predator", 32000);
        a2.name = "Predator";
        a2.price = 32000;
        a2.show();

        Laptop a3 = new Laptop("Test", -100);
        a3.show();
    }
}

class Laptop {
    String name;
    int price;

    //    Laptop(){
//        name = "test";
//        price = -100;
//    }
    public Laptop(String lname, int p) {
        name = lname;
        price = p;
    }

    public void show() {
        System.out.println(name);
        System.out.println(price);
    }
}

