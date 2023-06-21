class ItsSup {
    int x = 5;

    void fx1() {
        System.out.println("Parent class method");
    }

    ItsSup() {
        System.out.println("Sup constructor");
    }
}

class Sub extends ItsSup {
    int x = 10;

    void printx() {
        System.out.println("If we print x without using super keyword we get " + x);
        System.out.println("If we print x using super keyword we get " + super.x);

    }

    void fx1() {
        System.out.println("Sub class method");

    }

    void fx2() {
        System.out.println("fx2 method");

    }

    void fx3() {
        super.fx1();
        fx2();
        fx1();
    }
}

public class Sup {
    public static void main(String[] args) {
        Sub s = new Sub();
        s.printx();
        s.fx3();
    }

}
