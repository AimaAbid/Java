interface ABC {
    void fx1();

    void fx2();
}

interface EFG {
    void fx3();

    void fx4();
}

public class InhInf implements ABC, EFG {
    public void fx1() {
        System.out.println("fx1");
    }

    public void fx2() {
        System.out.println("fx2");
    }

    public void fx3() {
        System.out.println("fx3");
    }

    public void fx4() {
        System.out.println("fx4");
    }

    public static void main(String[] args) {

        InhInf a = new InhInf();

        a.fx1();
        a.fx2();
        a.fx3();
        a.fx4();
    }

}
