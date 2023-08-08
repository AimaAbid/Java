class Th1 implements Runnable {
    public void run() {
        while (true) {
            System.out.println("Thread1 is running");
        }
    }
}

class Th2 implements Runnable {
    public void run() {
        while (true) {
            System.out.println("Thread2 is running");
        }
    }
}

public class Work2 {
    public static void main(String[] args) {
        Th1 th1 = new Th1();
        Th2 th2 = new Th2();

        Thread t1 = new Thread(th1); // Create a Thread object for Th1
        Thread t2 = new Thread(th2); // Create a Thread object for Th2

        t1.start(); // Start the first thread
        t2.start(); // Start the second thread
    }
}
