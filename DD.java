class Student {

    void greet() {
        System.out.println("Welcome student!");
    }

}

public class DD extends Student {
    void greet() {
        System.out.println("Welcome 6th sem student");
    }

    void fx1() {
        System.out.println("Hello!");
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.greet();
        DD st = new DD();
        st.greet();
        st.fx1();
        Student t = new DD();
        t.greet();

    }

}
