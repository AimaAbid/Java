class A {
    public static int x = 10;
    protected static int y = 20;
    private static int z = 30;
    static int u = 40;
}

public class Access extends A {
    public static void main(String[] args) {
        A x = new A();
        System.out.println(A.x);
        System.out.println(A.y);
        System.out.println(A.z);
        System.out.println(A.u);

    }

}
