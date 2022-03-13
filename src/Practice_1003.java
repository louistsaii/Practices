public class Practice_1003{
    public static void main1(String[] args) {
        Product[][] products = new Product[2][3];
        int id = 1;
        int price = 10;
        for (int i = 0; i < products.length; i++) {
            for (int j = 0; j < products[i].length; j++) {
                products[i][j] = new Product(id, price);
                id = id + 1;
                price = price + 10;
            }
        }

        for (int i = 0; i < products.length; i++) {
            // start : each row
            int total = 0;
            for (int j = 0; j < products[i].length; j++) {
                // start each row's columns
                int x = products[i][j].getPrice();
                total = total + x;
            }
            // end : each row
            System.out.println("Row total: " + total);
        }
    }
}

class Product {
    private int id;
    private int price;

    public Product(int id, int price) {
        this.id = id;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}