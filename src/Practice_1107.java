import java.util.ArrayList;

public class Practice_1107 {
    public static void main(String[] args) {
        String s1 = new String("Jeff,May,Leo,May,Mark,Mark,Jeff");
        NameCounter a1 = new NameCounter(s1);
        a1.countNames();
        System.out.println();
    }
}

class NameCounter {
    String text;
    ArrayList<String> nameList;
    ArrayList<Integer> countList;

    public NameCounter(String text) {
        this.text = text;
        nameList = new ArrayList<>();
        countList = new ArrayList<>();
    }

    public void countNames(){
        ArrayList<String> x = getTokens();
//        for (int i = 0; i < x.size(); i++) {
//            x.get(i);
//        }
        for (String name : x) {
            int pos = nameList.indexOf(name);
            if(pos == -1){
                nameList.add(name);
                countList.add(1);
            }else{
                int n = countList.get(pos);
                countList.set(pos,n+1);
            }
        }
    }

    public ArrayList<String> getTokens() {
        ArrayList<String> names = new ArrayList<>();
        while (true) {
            int x = text.indexOf(",");
            if (x != -1) {
                String a1 = text.substring(0, x);
                names.add(a1);
                text = text.substring(x + 1);
            } else {
                names.add(text);
                break;
            }
        }
        return names;
    }
}
