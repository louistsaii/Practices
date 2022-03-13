public class Practice_0213 {
    public static void main(String[] args) {
        Time a1 = new Time(06, 06, 11, "PM");
        Time a2 = a1.parseTime("15:06:1124H");
        a2.twentyfourHtoAMPM();
        System.out.println(a2);

    }
}

class Time {
    private int hour;
    private int minute;
    private int second;
    private String AMPMor24H;

    public Time(int hour, int minute, int second, String AMqPMor24H) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        this.AMPMor24H = AMPMor24H;
    }

    public void checkAMPMto24H() {
        if (AMPMor24H.equals("PM") && hour != 12) {
            hour = hour + 12;
            AMPMor24H = "24H";
        }else{
            AMPMor24H = "24H";
        }
    }

    public void twentyfourHtoAMPM(){
        if (hour>=12) {
            AMPMor24H = "PM";
        }else{
            AMPMor24H = "AM";
        }
        if(hour>12){
            hour = hour-12;
        }
    }

    public Time parseTime(String x) {
        String a = x.substring(0, 2);
        String b = x.substring(3, 5);
        String c = x.substring(6, 8);
        String d = x.substring(8);
        int e = Integer.parseInt(a);
        int f = Integer.parseInt(b);
        int g = Integer.parseInt(c);

        Time a1 = new Time(e, f, g, d);
        return a1;
    }


    @Override
    public String toString() {
        return "Time{" +
                "hour=" + hour +
                ", minute=" + minute +
                ", second=" + second +
                ", AMPM/24H='" + AMPMor24H + '\'' +
                '}';
    }
}
