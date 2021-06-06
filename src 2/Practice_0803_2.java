public class Practice_0803_2 {
    public static void main(String[] args) {
        Mouse[] x = new Mouse[4];
        x[0] = new Mouse(120);
        x[1] = new Mouse(100);
        x[2] = new Mouse(150);
        x[3] = new Mouse(200);
        int min=100000000;
        for (int i = 0; i < x.length; i++) {
            x[i].show("$");
            if(x[i].getPrice()<min){
                min = x[i].getPrice();
            }
        }
        System.out.println("Min:" + min );




    }

    public static void main1(String[] args) {
        Mouse[] x = new Mouse[4];
        x[0] = new Mouse(120);
        x[1] = new Mouse(100);
        x[2] = new Mouse(150);
        x[3] = new Mouse(200);

        for (int i = 0; i < x.length; i++) {
            x[i].show("$");
        }

        int total = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i].getPrice() == 150) {
                x[i].increasePrice(10);
                System.out.println(x[i].getPrice());
            }
            total = total + x[i].getPrice();
        }
        System.out.println("Total: " + total);
    }


}

class Mouse {
    private int price;

    public void show(String x) {
        System.out.println(x + price);
    }

    public Mouse(int price) {
        this.price = price;
    }

    public void increasePrice(int y) {
        price = price + y;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price){
        this.price = price;
    }
}