import java.util.Scanner;

class SampleException extends Exception {
    public String toString() {
        return "I am toString method";
    }

    public String getMessage() {
        return "I am getMessage method";
    }
}

public class HanSpecExc {

    public static void main(String[] args) {
        int a;
        Scanner Sc = new Scanner(System.in);
        a = Sc.nextInt();
        Sc.close();

        try {
            if (a > 100) {
                throw new SampleException();
            }
        } catch (SampleException e) {
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            System.out.println(e);

        }
    }

}
