import java.sql.SQLOutput;
import java.util.ArrayList;

public class Practice_0927 {
    public static void main(String[] args) {

        ArrayList<Ticket> list = new ArrayList<Ticket>();
        for (int i = 0; i < 10; i++) {
            Ticket A = new Ticket();

            list.add(A);
        }
        System.out.println(list.size());
        for (Ticket ticket : list) {
            ticket.show();
        }
        System.out.println("-------------------------");
        list.remove(0);
        list.remove(0);
        list.remove(0);
        for (Ticket ticket : list) {
            ticket.show();
        }
        System.out.println(list.size());
        list.get(5).show();
    }


    public static void main2(String[] args) {
        Ticket[] tickets = new Ticket[10];


        for (int i = 0; i < 10; i++) {
            Ticket A = new Ticket();

            tickets[i] = A;
        }

        for (int i = 0; i < tickets.length; i++) {
            tickets[i].show();
        }

        double w = Ticket.discount(10,Ticket.findTotal(tickets));
        double x = Ticket.discount(15, Ticket.findTotal(tickets));
        double y = Ticket.discount(20 ,Ticket.findTotal(tickets));
    }


    public static void main1(String[] args) {
        Ticket A = new Ticket("A");
        Ticket B = new Ticket("B");
        Ticket C = new Ticket("C");
        A.show();
        B.show();
        C.show();

    }

}

class Ticket {
    private String seat;
    private int price;

    public Ticket(String seat) {
        setSeat(seat);
    }

    public Ticket() {
        String[] seatClass = new String[3];
        seatClass[0] = "A";
        seatClass[1] = "B";
        seatClass[2] = "C";

        int ranIdx = (int) (Math.random() * seatClass.length);
        setSeat(seatClass[ranIdx]);

    }

    public void setSeat(String seat) {
        this.seat = seat;


        if (seat.equals("A")) {
            price = 500;
        } else if (seat.equals("B")) {
            price = 300;
        } else if (seat.equals("C")) {
            price = 200;
        }
    }

    public void show() {
        System.out.println("Seat: " + seat + "  Price: " + price);
    }

    public static int findTotal(Ticket[] x){
        int total = 0;
//        for (int i = 0; i < x.length; i++) {
//            total = total + x[i].price;
//        }
        for (Ticket ticket : x) {
            total = total + ticket.price;
        }
        System.out.println("Total: " + total);
        return total;
    }

    public static double discount(int discount,int total){
        double x = 0.01*(100-discount);
        double price = total * x;
        System.out.println("Discount after " + discount + "% off: " + price);
        return price;
    }
}