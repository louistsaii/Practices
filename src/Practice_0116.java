public class Practice_0116 {
    public static void main(String[] args) {
        String t = "110!010!100";

        int unit = 4;
        int total = 0;
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (c == '1') {
                total = total + unit;
                unit = unit / 2;
            } else if (c == '0') {
                unit = unit / 2;
            } else {
                unit = 4;
                total = 0;
            }
            if(unit==1){
                System.out.print(total);
            }
        }
    }
}
