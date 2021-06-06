public class Gift_0131 {
    public static void main(String[] args) {
        int pen = 0;
        int book = 0;
        Gift_0131 a1 = new Gift_0131();
        for (int i = 0; i < 10000; i++) {
            String x = a1.get();
            System.out.println(x);
            if (x.equals("Pen")) {
                pen = pen + 1;
            } else if (x.equals("Book")){
                book = book + 1;
            }
        }
        System.out.println("Pen: " + pen);
        System.out.println("Book: " + book);
    }


    public String get() {
        if (Math.random() < 0.25) {
            return "Book";
        } else {
            return "Pen";
        }
    }
}
