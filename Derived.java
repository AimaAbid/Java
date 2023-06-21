abstract class Base {
    public Base() {
        System.out.println("I am a Base constant");
    }

    public void greet() {
        System.out.println("Hola!");

    }

    abstract void instruct();
}

class Derived1 extends Base {
    void instruct() {
        System.out.println("instruct defined");
    }

    public void greet() {
        System.out.println("Assalamu Alaikum");
    }
}

public class Derived {
    public static void main(String[] args) {
        Derived1 d = new Derived1();

        d.greet();
        d.instruct();
    }

}
