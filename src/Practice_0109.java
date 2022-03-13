public class Practice_0109 {
    public static void main(String[] args) {
        Cup[][] box = new Cup[2][3];
        for (int i = 0; i <box.length ; i++) {
            for (int j = 0; j < box[i].length; j++) {
                int p = (int) (10 + Math.random() * 21);
                int q = (int) (5 + Math.random() * 6);
                Cup a1 = new Cup(p, q);
                box[i][j] = a1;
            }
        }
        for (int i = 0; i <box.length ; i++) {
            for (int j = 0; j <box[i].length ; j++) {
                box[i][j].show();
            }
        }

        box[1][0].sell();
        box[1][0].sell();

        System.out.println("---------------");

        for (int i = 0; i <box.length ; i++) {
            for (int j = 0; j <box[i].length ; j++) {
                box[i][j].show();
            }
        }

        int total = 0;
        for (int i = 0; i < box.length; i++) {
            for (int j = 0; j < box[i].length; j++) {
                total = total + box[i][j].getTotalPrice();
            }
        }
        System.out.println(total);

        int totals = 0;
        for (int i = 0; i < box.length; i++) {
            for (int j = 0; j < box[i].length; j++) {

                }
            }
        }
    }


class Cup {
    private int price;
    private int qty;

    public Cup(int price, int qty) {
        this.price = price;
        this.qty = qty;
    }

    public void show() {
        System.out.println(price + "*" + qty);
    }

    public void sell(){
        qty = qty - 1;
    }

    public int getTotalPrice(){
        int total = price*qty;
        return total;
    }
}
