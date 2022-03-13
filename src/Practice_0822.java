import java.util.ArrayList;

public class Practice_0822 {
    public static void main(String[] args) {
        ArrayList<Item> X = new ArrayList<>();
        Item a1 = new Item("A", 50);
        Item a2 = new Item("B", 100);
        Item a3 = new Item("C", 150);
        SaleItem a4 = new SaleItem("D", 200, true);
        SaleItem a5 = new SaleItem("E", 250, false);
        X.add(a1);
        X.add(a2);
        X.add(a3);
        X.add(a4);
        X.add(a5);
        for (int i = 0; i < X.size(); i++) {
            System.out.println(X.get(i));
            Item item = (X.get(i));
            if (item instanceof SaleItem) {
                SaleItem y = (SaleItem) item;
                if (y.limited == true) {
                    System.out.println(y.getSpecialPrice());
                }
            }
        }
    }
}

class Item {
    String name;
    double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

class SaleItem extends Item {
    boolean limited;

    public SaleItem(String name, double price, boolean limited) {
        super(name, price * 0.8);
        this.limited = limited;
    }

    public int getSpecialPrice() {
        return 50;
    }
}
