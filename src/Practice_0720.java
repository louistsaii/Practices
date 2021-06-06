public class Practice_0720 {
    public static void main(String[] args) {
        Game a1 = new Game("Fencing",1);
        a1.show();

        Game a2 = new Game("Fencing",2);
        a2.show();

    }
}

class Game{
    private String name;
    private int level;

    public Game(String lname, int l){
        name = lname;
        level=l;
    }

    public void show(){
        System.out.println("Name: " + name + " Level: " + level);
    }
}
