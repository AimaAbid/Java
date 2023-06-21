abstract class Base {
    public Base() {
        System.out.println("I am a Base constant");
    }

    void greet() {
        System.out.println("Welcome to base");
    }

    abstract void Instruct();
}

class Derived extends Base {
    void Instruct() {
        System.out.println("Instruction defined");
    }

    void greet() {
        System.out.println("Welcome to derived");
    }
}

public class Main {
    public static void main(String[] args) {
        Derived d = new Derived();
        d.greet();
        d.Instruct();

    }

}
