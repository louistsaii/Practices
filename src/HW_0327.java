public class HW_0327 {
    public static void main(String[] args) {
        Message.countChar("I like trains");
    }
}

class Message {

    public static void countChar(String message) {
        int chars = 0;
        for (int i = 0; i < message.length(); i++) {
            char c1 = message.charAt(i);
            if ('a' <= c1 && c1 <= 'z' || 'A' <= c1 && c1 <= 'Z') {
                chars = chars + 1;
            }
        }
        System.out.println(chars);
    }
}