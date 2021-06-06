public class Practice_0803 {
    public static void main(String[] args) {
        t1[] id = new t1[3];
        id[0] = new t1("ID01");
        id[1] = new t1("ID02");
        id[2] = new t1("ID03");

        for (int i = 0; i < id.length; i++) {
            id[i].show();
        }

        t1[] id2 = new t1[3];
        for (int j = 0; j < id2.length; j++) {
            int x = j + 1;
            id2[j] = new t1("ID0" + x);
            id2[j].show();
        }
    }
}

class t1 {
    String id;

    public t1(String id) {
        this.id = id;
    }

    public void show() {
        System.out.println("ID:" + id);
    }
}

