public class Practice_1003_2 {
    public static void main(String[] args) {
        Member[] x = new Member[3];
        Bucket a1 = new Bucket(0);

        x[0] = new Member(500);
        x[1] = new Member(750);
        x[2] = new Member(300);

        x[0].pourWater(a1);
        x[1].pourWater(a1);
        x[2].pourWater(a1);
        System.out.println();

//        int z = a1.pourToEveryone(x.length);
//        for (int i = 0; i < x.length; i++) {
//            //x[i].getWater() = x[i].getWater() + z;
//            x[i].addWater(z);
//            a1.getBucketWater(z);
//        }

        a1.pourToEveryone(x);

        System.out.println();
    }
}

class Member {
    private int water;

    public Member(int water) {
        this.water = water;
    }

    public void pourWater(Bucket x) {
        x.pouredWater(50);
        water = water - 50;
    }

    public int getWater() {
        return water;
    }

    public void addWater(int amount) {
        water = water + amount;
    }
}

class Bucket {
    private int water;

    public Bucket(int water) {
        this.water = water;
    }

    public void pouredWater(int amount) {
        water = water + amount;
    }

    public int pourToEveryone(int x) {
        int z = water / x;
        return z;
    }

    public void getBucketWater(int x) {
        water = water - x;
    }

    public void pourToEveryone(Member[] members) {
        int z = water / members.length;
        for (int i = 0; i < members.length; i++) {
            members[i].addWater(z);
            water = water - z;
        }
    }
}
