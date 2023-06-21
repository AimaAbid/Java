
class Base {
    final int a = 5;

    final void fx1() {
        System.out.println("JAVA");

    }

}

public class Fin extends Base {

    void fx1() {
        System.out.println("welcome");
    }

    public static void main(String[] args) {

        Fin f = new Fin();
        f.fx1();

    }

}
