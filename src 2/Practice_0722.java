public class Practice_0722 {
    public static void main1(String[] args) {
        Player a1 = new Player("A",100);
        a1.show();

        Player a2;
        Player a3;
        //a2=a1;
        a2 = new Player("B",100);
        a2.show();
        int x= a1.getHp()*2;
        a1.setHp(x);
        a1.show();

//        a1 = a2 ;
//        System.out.println("=============");
//        a1.show();
//        a2.show();


        a3=a2;
        a2=a1;
        a1=a3;
        System.out.println();


    }

    public static void main(String[] args) {
        Player a1 = new Player("A",100);
        a1.show();

        Player a2 = new Player("B");
        a2.setHp(110);
        a2.show();

        Player a3 = new Player();
        a3.setName("C");
        a3.setHp(120);
        a3.show();

        Player[]x = new Player[3];
        x[0] = a1;
        x[1] = a2;
        x[2] = a3;
        int y = a1.getHp()+17;
        a1.setHp(y);
        x[0].show();


    }
}

class Player{

    private String name;
    private int hp;

    public Player(String lname,int HP){
        this.name = lname;
        this.hp = HP;
    }

    public Player(String lname){
        this.name = lname;
    }
    public Player(){

    }
    public void show(){
        System.out.println("Name:" + name +" HP: " + hp);
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public int getHp(){
        return hp;
    }
}


