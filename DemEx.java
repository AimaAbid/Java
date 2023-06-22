import java.util.Scanner;

public class DemEx {

    public static void main(String[] args) {
        int a = 1000;

        Scanner Sc = new Scanner(System.in);
        int y = Sc.nextInt();
        Sc.close();
        System.out.println("The result is :");
        try {
            System.out.println(a / y);

        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
