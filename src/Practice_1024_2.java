import java.util.ArrayList;

class StringParser {

    private String sentence;
    private String sTag;
    private String eTag;
    private ArrayList<String> tokens;

    public StringParser(String sent, String sT, String eT) {
        this.sentence = sent;
        this.sTag = sT;
        this.eTag = eT;
        this.tokens = new ArrayList<String>();
    }

    public String getSentence() {
        return sentence;
    }

    public String getSTag() {
        return sTag;
    }

    public String getETag() {
        return eTag;
    }

    public ArrayList<String> getTokens() {
        return tokens;
    }

    // Master:[Mark], Member: [Jeff] [Ke
    // 01234567890123
    // getStartEndPos(0) ==> [7,12]
    public int[] getStartEndPos(int startIdx) {
        int x = sentence.indexOf(startIdx);
        return null;
    }

    public void parseTokens() {
        //substring, take it out and put into arraylist
        while (true) {
            int[] a = getStartEndPosition(sentence);
            if (a[0] == -1 || a[1] == -1) {
                break;
            }
            String s1 = sentence.substring(a[0] + 1, a[1]);
            tokens.add(s1);
            sentence = sentence.substring(a[1] + 1);
        }
    }

    public int[] getStartEndPosition(String s) {
        int x = s.indexOf(sTag);
        int y = s.indexOf(eTag);
        int[] a = new int[2];
        a[0] = x;
        a[1] = y;
        return a;
    }

    public static void main(String[] args) {
        String info = "Master:[Mark],  Member: [Jeff] [Kevin] [John]";
        String s1 = info.substring(1, 5);
        System.out.println(s1);
        System.out.println(info.indexOf("Mark"));
        StringParser sp = new StringParser(info, "[", "]");
        sp.parseTokens();
        System.out.println(sp.getTokens());
    }

}
