import java.util.ArrayList;

public class Practice_1128 {
    public static void main(String[] args) {
        Delimiters a1 = new Delimiters("(",")");
        String[] tokens = new String[4];
        tokens[0] = ")";
        tokens[1] = "x+y";
        tokens[2] = "(";
        tokens[3] = "*5";
        ArrayList<String> ArrofDelimiters = a1.getDelimitersList(tokens);
        boolean x = a1.isBalanced(ArrofDelimiters);
        System.out.println(x);
    }
}

class Delimiters {

    private String openDel;
    private String closeDel;

    public Delimiters(String open, String close) {
        openDel = open;
        closeDel = close;
    }

    /**
     * Returns an ArrayList of delimiters from the array tokens, as described
     * in part (a).
     */
    public ArrayList<String> getDelimitersList(String[] tokens) {
        ArrayList<String> ArrofDelimiters = new ArrayList<>();
        for (int i = 0; i < tokens.length; i++) {
            if(tokens[i].equals(openDel)||tokens[i].equals(closeDel)){
                ArrofDelimiters.add(tokens[i]);
            }
        }
        return ArrofDelimiters;
    }

    /**
     * Returns true if the delimiters are balanced and false otherwise, as
     * described in part (b).
     * Precondition: delimiters contains only valid
     * open and close delimiters.
     */
    public boolean isBalanced(ArrayList<String> delimiters) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < delimiters.size(); i++) {
            if (delimiters.get(i).equals(openDel)) {
                x = x + 1;
            } else {
                y = y + 1;
            }
            if(x<y){
                return false;
            }
        }
        if(x!=y){
            return false;
        }
        return true;
    }
}
