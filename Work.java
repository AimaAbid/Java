class Thread1 extends Thread {
    public void run() {
        while (true) {
            System.out.println("Thread 1 is implementing");
            System.out.println("Work Efficient");

        }
    }

}

class Thread2 extends Thread {

    public void run() {
        while (true) {
            System.out.println("Thread 2 is implementing");
            System.out.println("Work nicely");

        }
    }

}

public class Work {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();

    }
}
