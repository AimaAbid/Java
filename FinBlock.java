public class FinBlock {
    public static int fx1() {
        try {
            int a = 10;
            int b = 0;
            int c = a / b;
            return c;

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Program finished");

        }
        return 0;

    }

    public static void main(String[] args) {
        int x = fx1();
        System.out.println(x);
    }

}
