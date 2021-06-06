public class Practice_1108 {
    public static void main(String[] args) {
        Route r1 = new Route(250,4);
        RouteByBus bus = new RouteByBus(250,4,5,0.5);
        int x = r1.duration;

        System.out.println("r1 duration:" + x +
                "\n Bus total duration:" +
                bus.getTotalDuration() +
                "\n r1 average speed: " + r1.getAverageSpeed() +
                "\n Bus average speed:" + bus.getAverageSpeed());
    }
}

class Route {
    int distance;
    int duration;

    public Route(int distance, int duration) {
        this.distance = distance;
        this.duration = duration;
    }

    public double getAverageSpeed() {
        double x = distance/duration;
        return x;
    }
}

class RouteByBus extends Route {
    double restingStops;
    double restingTimes;

    public RouteByBus(int distance, int duration, double restingStops, double restingTimes) {
        super(distance,duration);

        this.restingStops = restingStops;
        this.restingTimes = restingTimes;
    }

    public double getTotalDuration(){
        double y = duration + restingStops*restingTimes;
        return y;
    }

    public double getAverageSpeed(){
        double z = distance/ getTotalDuration();
        return z;
    }
}
