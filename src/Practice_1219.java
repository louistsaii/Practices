public class Practice_1219 {
    public static void main(String[] args) {
        StringChecker sc1 = new StringChecker(5, 8, "$");
        System.out.println(sc1.isValid("Code"));
        StringChecker sc2 = new StringChecker("pass");
        System.out.println(sc2.isValid("Mypassport"));

    }
}

class StringChecker {
    private int min;
    private int max;
    private String x;

    boolean isValid(String str) {
        if (min <= str.length() && str.length() <= max) {
            if (str.contains(x) == false) {
                return true;
            }
        }
        return false;
    }

    public StringChecker(int min, int max, String x) {
        this.min = min;
        this.max = max;
        this.x = x;
    }

    public StringChecker(String x) {
        min=6;
        max=20;
        this.x = x;
    }

}