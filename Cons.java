public class Cons {

    int rollNo;
    String name;

    Cons(int x, String y) {
        rollNo = x;
        name = y;

    }

    public void getDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + rollNo);
    }

    public static void main(String[] args) {

        Cons c1 = new Cons(1, "Aima");
        c1.getDetails();

    }
}
