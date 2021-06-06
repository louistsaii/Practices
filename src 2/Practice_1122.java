import java.util.ArrayList;

public class Practice_1122 {
    public static void main(String[] args) {
//        ScoreBoard a1 = new ScoreBoard("Mathtest");
//        a1.addScore(100);
//        a1.addScore(78);
//        a1.addScore(85);
//        a1.addScore(93);
//        a1.listScore();
//        System.out.println("----------------------");
        ScoreCalculator a2 = new ScoreCalculator("Mathtest");
        a2.addScore(100);
        a2.addScore(78);
        a2.addScore(85);
        a2.addScore(93);
        System.out.println(a2.getTotal());
        System.out.println(a2.getAverage());
        a2.listScore();
    }
}

class ScoreBoard {
    private String title;
    private ArrayList<Integer> scores = new ArrayList<Integer>();

    public ScoreBoard(String title) {
        this.title = title;
    }

    public void addScore(int s) {
        if(s<0 || s>100){
            return;
        }
        scores.add(s);
    }

    public void listScore() {
        System.out.println("----------\n" + title + " start" + "\n----------");
        for (int i = 0; i < scores.size(); i++) {
            System.out.println(scores.get(i));
        }
        System.out.println("----------\n" + title + " end" + "\n----------");
    }

    public ArrayList<Integer> getScores() {
        return scores;
    }
}

class ScoreCalculator extends ScoreBoard {

    public ScoreCalculator(String title) {
        super(title);
    }

    public int getTotal() {
        int total = 0;
        ArrayList<Integer> sList = getScores();
        for (int i = 0; i < sList.size(); i++) {
            total = total + sList.get(i);
        }
        return total;
    }

    public double getAverage() {
        ArrayList<Integer> sList = getScores();
        double x = (double) this.getTotal() / sList.size();
        return x;
    }

    public void listScore(){
        super.listScore();
        System.out.println("Total: " + getTotal());
        System.out.println("Average: " + getAverage());
    }
}
