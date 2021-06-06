public class Practice_0807 {
    public static void main(String[] args) {

    }
}

class StepTracker {

    private int aDays;
    private int total;
    private int days;
    private int goal;

    public StepTracker(int x) {
        this.aDays = 0;
        this.total = 0;
        this.days = 0;
        this.goal = x;
    }

    public void addDailySteps(int x) {
        if (x >= goal) {
            aDays = aDays + 1;
            days = days + 1;
        } else {
            days = days + 1;
        }

        total = total + x;
    }

    public double averageStep() {
        if (total == 0 || days == 0) {
            return 0;
        }
        double x = (double) total / days;
        return x;
    }

    public int activeDays() {
        return aDays;
    }
}