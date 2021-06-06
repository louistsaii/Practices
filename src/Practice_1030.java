public class Practice_1030 {
    public static void main(String[] args) {
        Manager m1 = new Manager(1500000,"G101");

        Engineer e1 = new Engineer(900000,"G001");

        Engineer e2 = new Engineer(800000,"G002");

        Engineer e3 = new Engineer(850000,"G003");

        Worker[] workers = new Worker[4];
            workers[0] = m1;
            workers[1] = e1;
            workers[2] = e2;
            workers[3] = e3;

        for (Worker worker : workers) {
            worker.show();
        }
    }
}

class Worker {
    int salary;
    String id;

    public Worker(int salary,String id){
        this.salary = salary;
        this.id = id;
    }

    public void doDailyTask() {
        System.out.println("Do daily task");
    }

    public void show() {
        System.out.println(getClass().getName() + " id: " + id);
        System.out.println(getClass().getName() + "Salary: " + salary);
    }
}

class Manager extends Worker {
    public Manager(int salary, String id) {
        super(salary, id);
    }

    public void callMeeting() {
        System.out.println("Call meeting");
    }
}

class Engineer extends Worker {
    public Engineer(int salary, String id) {
        super(salary, id);
    }

    public void coding() {
        System.out.println("Coding");
    }
}