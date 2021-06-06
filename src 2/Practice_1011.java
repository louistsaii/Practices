public class Practice_1011 {
    public static void main(String[] args) {
        String x = "5678";

        int y = Integer.parseInt(x);
        System.out.println(y);

        int z = y + 6789;
        System.out.println(z);
        System.out.println(x + 6789);

        char a = 'X';
        System.out.println(a + "-->" + (int) a);

        char b = 'Y';
        System.out.println(b + "-->" + (int) b);

        char c = 'Z';
        System.out.println(c + "-->" + (int) c);

        int p = 86;
        System.out.println(p + "-->" + (char) p);

        char start = 'a';
        char end = 'z';
        for (int i = start; i <= end; i++) {
            System.out.println((char) i);
        }

        char begin = 'A';
        char finish = 'Z';
        for (int i = begin; i <= finish; i++) {
            System.out.println((char) i);
        }

        char[] message = new char[]{'c','a','l','l','m','e'};
        int startCode = 117;
        for (char c1 : message) {
            int diff = c1-'a';
            int code = startCode + diff;
            System.out.println(code);
        }

        }
    }


