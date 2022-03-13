public class Practice_1017_2 {

    public static void main(String[] args) {
        Nums n1 = new Nums(1,2);
        Nums n2 = new Nums(1,3);
        Nums n3 = n1.add(n1,n2);
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
    }

    public static void main2(String[] args) {
        Nums[] x = new Nums[10];
        for (int i = 1; i <= 10; i++) {
            x[i - 1] = new Nums(1, i);
        }

        for (int i = 1; i <= 9; i++) {
            x[0].add(x[i]);
            x[0].printSimplifiedFraction();
        }
        x[0].printSimplifiedFraction();
    }




    public static void main1(String[] args) {
        Nums a1 = new Nums(1, 1);
        Nums a2 = new Nums(1, 2);
        Nums a3 = new Nums(1, 3);
        Nums a4 = new Nums(1, 4);
        Nums a5 = new Nums(1, 5);

        a1.add(a2);
        a1.add(a3);
        a1.add(a4);
        a1.add(a5);
        a1.printSimplifiedFraction();
    }
}

class Nums {
    private int dividend;
    private int divisor;

    public Nums(int dividend, int divisor) {
        this.dividend = dividend;
        this.divisor = divisor;
    }

    public int getQuotient() {
        int x = dividend / divisor;
        return x;
    }

    public int getRemainder() {
        int y = dividend % divisor;
        return y;
    }

    public void printSimplifiedFraction() {
        System.out.println(getQuotient() + " " + getRemainder() + "/" + divisor);
    }

    public void add(Nums n) {
        int x = divisor * n.divisor;
        dividend = dividend * n.divisor;
        int y = n.dividend * divisor;
        int z = dividend + y;
        dividend = z;
        divisor = x;
    }

    public Nums add(Nums n1, Nums n2){
        Nums n3 = new Nums(n1.dividend,n1.divisor);
        n3.add(n2);
        return n3;
    }

    public String toString(){
        String x = ("Dividend: " + dividend + " Divisor: " + divisor);
        return x;
    }
}