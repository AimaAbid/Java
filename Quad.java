import java.util.Scanner;
import java.lang.Math;

public class Quad {
    public static void main(String[] args) {
        System.out.println("Enter a ,b and c for general quadractic equation");
        Scanner Sc1 = new Scanner(System.in);
        int a = Sc1.nextInt();

        Scanner Sc2 = new Scanner(System.in);
        int b = Sc2.nextInt();

        Scanner Sc3 = new Scanner(System.in);
        int c = Sc3.nextInt();
        Sc1.close();
        Sc2.close();
        Sc3.close();

        double D = b * b - 4 * a * c;
        if (D < 0)
            System.out.println("The roots are imaginary");
        else if (D == 0) {
            System.out.print("The roots are equal and each are equal to");
            double ans = -(b / (2 * a));
            System.out.println(" " + ans);
        } else {
            System.out.print("The roots are ");
            double ans1 = (-b + Math.sqrt(D)) / (2 * a);
            double ans2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.print(ans1 + " " + ans2);

        }

    }

}
