public class Practice_0727 {
    public static void main(String[] args) {
        SP a1 = new SP("police");
        SP a2 = new SP("terrorist");
        SP a3 = new SP("citizen");
        a1.show();
        a2.show();
        a3.show();

        a1.attack(a2);
        System.out.println("-----------------");
        a2.show();

        System.out.println("-----------------");

        a3.help(a1, 10);
        a1.show();
        a3.show();
    }
}

class SP {
    String role;
    int AP;
    int HP;
    int DP;

    public void show() {
        System.out.println("Role:" + role + " AP:" + AP + " HP:" + HP + " DP:" + DP);
    }

    public SP(String role) {
        this.role = role.toUpperCase();

        if (role.equalsIgnoreCase("Police")) {
            HP = 70;
            AP = 70;
            DP = 80;
        } else if (role.equalsIgnoreCase("Terrorist")) {
            HP = 50;
            AP = 80;
            DP = 50;
        } else if (role.equalsIgnoreCase("Citizen")) {
            HP = 100;
            AP = 30;
            DP = 50;
        }
    }

    public void hurt(int y) {
        HP = HP - y;
    }

    public void attack(SP target) {
        target.HP = target.HP - (AP - target.DP);
    }

    public void help(SP target, int transfer) {
        target.HP = target.HP + transfer;
        HP = HP - transfer;
    }

}