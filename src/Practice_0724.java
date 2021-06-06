public class Practice_0724 {
    public static void main(String[] args) {
        Pen[] x = new Pen[30];
        for (int i = 0; i < x.length; i++) {
            if (i % 2 == 0) {
                x[i] = new Pen("M");
            } else if (i % 5 == 0) {
                x[i] = new Pen("L");
            } else {
                x[i] = new Pen("S");
            }
            System.out.println(i + 1 + "->");
            x[i].show();
        }
        //-----------------------

        int L = 0;
        int M = 0;
        int S = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i].size.equals("L")) {
                L+=1;
            }else if(x[i].size.equals("M")){
                M+=1;
            }else{
                S+=1;
            }
        }
        System.out.println("Total L: " + L);
        System.out.println("Total M: " + M);
        System.out.println("Total S: " + S);
        x[0] = null;
        x[0].show();
    }




    public static void main1(String[] args) {
        Pen[]x = new Pen[10];
        for (int i = 0; i <x.length ; i++) {
            x[i] = new Pen("M");
        }

        int total = 0;
        for (int j = 0; j <x.length ; j++) {
            System.out.println(j+1 + "->");
            x[j].show();
            if (j >= 6){
                int a = x[j].getPrice(true);
                System.out.println("Sell price: " + a);
                total = total + a;
            }else{
                int b = x[j].getPrice(false);
                System.out.println("No sale: " + b);
                total = total + b;
            }
        }
        System.out.println("Total= " + total);
    }
}

class Pen {
    String size;
    int price;

    public Pen(String size) {
        this.size = size;
        if (size.equals("S")) {
            price = 25;
        } else if (size.equals("M")) {
            price = 40;
        } else if (size.equals("L")) {
            price = 50;
        }
    }

    public void show() {
        System.out.println("Size: " + size + " Price: " + price);
    }

    public int getPrice(boolean onSale) {
        if (onSale == true) {
            return price - 10;
        } else {
            return price;
        }
    }
}
