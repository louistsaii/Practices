public class Practice_1114 {
    public static void main(String[] args) {
        StringParser2 a1 = new StringParser2("&&&&Hello Java&&&","&");
        a1.refineText();
        System.out.println(a1);
    }

    public static void main2(String[] args) {
        Temperature t1 = new Temperature("Taichung", 25);
        System.out.println(t1);
    }

    public static void main1(String[] args) {
        StringParser2 a1 = new StringParser2("###Good morning#", "#");
        System.out.println(a1);
        a1.getContent();
        System.out.println(a1);
        a1.refineText();
        System.out.println(a1);

    }
}

class StringParser2 {
    private String text;
    private String rvChar;

    public StringParser2(String text, String rvChar) {
        this.text = text;
        this.rvChar = rvChar;
    }

    public int getFirstCharPos() {
        int a = 0;
        for (; a < text.length(); a++) {
            String x = text.substring(a, a + 1);
            if (x.equals(rvChar)) {
            } else {
                break;
            }
        }
        return a;
    }

    public int getLastCharPos() {
        int b = text.length() - 1;
        for (; b >= 0; b--) {
            String x = text.substring(b, b + 1);
            if (x.equals(rvChar)) {
            } else {
                break;
            }
        }
        return b;
    }

    public String getContent() {
        int a = this.getFirstCharPos();
        int b = this.getLastCharPos();
        String x = text.substring(a, b + 1);
        return x;
    }

    public void refineText(){
        String x = this.getContent();
        text = x;
    }

    public String toString(){
        return text;
    }
}


class Temperature{
    private String city;
    private int t;

    public Temperature(String city, int t){
        this.city = city;
        this.t = t;
    }

    public String toString(){
        String x = ("City: " + city + " Temp: " + t);
        return x;
    }
}