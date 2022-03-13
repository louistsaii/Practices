import java.lang.reflect.Array;
import java.util.ArrayList;

public class Practice_1212_2 {
    public static void main(String[] args) {
        String[] t = {"A", "B", "C", "A"};
//        WordPairList a1 = new WordPairList(t);
        WordPairList a1;
        a1 = new WordPairList(t);
        for (int i = 0; i < a1.allPairs.size(); i++) {
            System.out.println(a1.allPairs.get(i));
        }
        System.out.println(a1.numMatches());

    }
}

class WordPair {
    private String first;
    private String second;

    public WordPair(String first, String second) {
        this.first = first;
        this.second = second;
    }

    public String getFirst() {
        return first;
    }

    public String getSecond() {
        return second;
    }

    public String toString() {
        return "First: " + first + " Second: " + second;
    }

}


class WordPairList {
    ArrayList<WordPair> allPairs;

    public WordPairList(String[] words) {
        allPairs = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                WordPair a1 = new WordPair(words[i], words[j]);
                allPairs.add(a1);
            }
        }
    }

    public int numMatches() {
        int total = 0;
        for (int i = 0; i < allPairs.size(); i++) {
            if (allPairs.get(i).getFirst().equals(allPairs.get(i).getSecond())) {
                total = total + 1;
            }
        }
        return total;
    }
}

