interface A {
    void greet();

    void Msg();
}

class XYZ implements A {
    public void greet() {// i had to make it public since it said cant reduce the visibility of greet()
                         // from A
        System.out.println("Nice to see you again!");
    }

    public void Msg() {
        System.out.println("Still here!?!?");
    }

}

public class Intface {

    public static void main(String args[]) {
        XYZ thing = new XYZ();
        thing.greet();
        thing.Msg();
    }

}
