interface Family {
    void display();

}

class Parent implements Family {
    public void display() {
        System.out.println("Java is boring");

    };
}

public class Main3 {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.display();
    }

}
