public class Practice_0805_2 {
    public static void main(String[] args) {
        int[] array = new int[4];
        array[0] = 23;
        array[1] = 54;
        array[2] = 62;
        array[3] = 17;

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("--------------------------");

        for (int n : array) {
            System.out.println(n);
        }

        Code[] Codes = new Code[4];
        for (int i = 0; i < Codes.length; i++) {
            Codes[i] = new Code(array[i]);
        }
        System.out.println("--------------------------");

        for (Code code : Codes) {
            System.out.println(code.n);
        }
        Code Code = new Code(0);
        Code.add(Codes);
        Code.show();




    }
}
