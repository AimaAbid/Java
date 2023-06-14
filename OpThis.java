public class OpThis {
    int a;

    public int val(int a) {
        this.a = a;
        return this.a;

    }

    public static void main(String[] args) {
        OpThis o = new OpThis();
        System.out.println(o.val(10));
    }

}
