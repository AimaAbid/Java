class Student {
    private int rollNo;
    private String name;

    public void setDetails(int x, String y) {
        rollNo = x;
        name = y;
    }

    public void getDetails() {
        System.out.println("Name =" + name + "\nRoll No = " + rollNo);
    }
}

public class GetSet {

    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setDetails(1, "Aima");
        s1.getDetails();
    }

}
