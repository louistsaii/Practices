import javax.xml.namespace.QName;

public class Practice_0622 {
    public static void main(String[] args) {
          Account a1 = new Account("John",10000);
//        Account a1 = new Account();
//        a1.name = "John";
//        a1.balance = 10000;
        a1.show();

          Account a2 = new Account("Mary",5000);
//        a2.name = "Mary";
//        a2.balance = 5000;
        a2.show();

        Printer p1 = new Printer();




        Calculator c1 = new Calculator();
        int f = c1.add(a1.balance, a2.balance);
//        System.out.println("Total: " + f);
        p1.show("total", f);
        float g = c1.multiply(f, 1.25f);
//        System.out.println("Total*1.25= " + g);
        p1.show("Investment" , g);
    }
}

class Calculator {
    int add(int a, int b) {
        int c = a + b;
        return c;
    }

    float multiply(float c, float d) {
        float e = c * d;
        return e;
    }
}

class Printer {
    void show(String title, float value ) {
        System.out.println(title + ">>>" + value);
    }
}

class Account {
    String name;
    int balance;

    Account(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    void show() {
        System.out.println(name + ": $" + balance);
    }
}