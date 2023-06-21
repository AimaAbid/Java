interface ABC {
    void fx1();

    void fx2();
}

interface EFG extends ABC {
    void fx3();

    void fx4();
}

class Inter implements EFG {
    public void fx1() {
        System.out.println("FX1 is defined");
    }

    public void fx2() {
        System.out.println("FX2 is defined");
    }

    public void fx3() {
        System.out.println("FX3 is defined");

    }

    public void fx4() {
        System.out.println("FX4 is defined");
    }

}

public class InherIntface {

    public static void main(String[] args) {
        Inter i = new Inter();
        i.fx1();
        i.fx2();
        i.fx3();
        i.fx4();
    }

}
