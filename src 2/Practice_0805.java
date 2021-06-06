public class Practice_0805 {
    public static void main(String[] args) {
        int[] array = new int[4];
        array[0] = 23;
        array[1] = 54;
        array[2] = 62;
        array[3] = 17;

        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total = total + array[i];
        }
        System.out.println("Total: " + total);

        Code[] Codes = new Code[4];
        for (int i = 0; i < Codes.length; i++) {
            Codes[i] = new Code(array[i]);
            Codes[i].show();
        }
        System.out.println("---------------");

        Code[] UnitCodes = new Code[4];
        for (int i = 0; i < UnitCodes.length; i++) {
            int x = Codes[i].n % 10;
            UnitCodes[i] = new Code(x);
            UnitCodes[i].show();
        }
        System.out.println("---------------");

        Code[] TensCode = new Code[4];
        for (int i = 0; i < TensCode.length; i++) {
            int x = Codes[i].n / 10;
            TensCode[i] = new Code(x);
            TensCode[i].show();
        }
        System.out.println("----------------");
        Codes[3].show();
        TensCode[3].show();
        TensCode[3].add(Codes[3]);
        TensCode[3].show();

        System.out.println("----------------");
        UnitCodes[0].show();
        TensCode[0].showArray(TensCode);
        UnitCodes[0].add1(TensCode);
        UnitCodes[0].show();

        System.out.println("----------------");
        Codes[1].show();
        UnitCodes[0].showArray(UnitCodes);
        Codes[1].add1(UnitCodes);
        Codes[1].show();

    }
}

class Code {
    int n;

    public Code(int x) {
        this.n = x;
    }

    public void show() {
        System.out.println("N: " + n);
    }

    //overloading
    public void add(Code x) {
        this.n = this.n + x.n;
    }

    //overloading
    public void add1(Code[] array) {
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total = total + array[i].n;
        }
        total = total + this.n;
        this.n = total;
    }

    //overloading
    public void add(Code[] array) {

        for (int i = 0; i < array.length; i++) {
            this.add(array[i]);
        }
    }

    public void showArray(Code[] array) {
        System.out.println("------show array------");
        for (int i = 0; i < array.length; i++) {
            array[i].show();
        }
        System.out.println("------show array------");
    }
}
