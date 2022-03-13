public class Practice_1212 {
    public static void main(String[] args) {

    }








    public static void main1(String[] args) {
        FrogSimulation a1 = new FrogSimulation(50,10);
        System.out.println(a1.runSimulation(10));

    }
}

class FrogSimulation{
    private int goalDistance;
    private int maxHops;

    public FrogSimulation(int goalDistance, int maxHops){
        this.goalDistance = goalDistance;
        this.maxHops = maxHops;
    }

    private int hopDistance(){
        return (int)(Math.random()*40-10) ;
    }

    public boolean simulate(){
        int location = 0;
        for (int i = 0; i <maxHops ; i++) {
            location = location + hopDistance();
            if(location<0){
                return false;
            }
        }
        if(location>=goalDistance){
            return true;
        }
        return false;
    }

    public double runSimulation(int num){
        double total = 0;
        double result = 0;
        for (int i = 1; i <= num; i++) {
            if(simulate() == true){
                total = total + 1;
                System.out.println("Success");
            }
        }
        result = total/num;
        return result;
    }
}
