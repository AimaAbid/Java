import java.util.Scanner;

public class InvPyr {
    public static void main(String[] args) {
        System.out.println("Enter the number of lines");
        Scanner Sc = new Scanner(System.in);
        int num = Sc.nextInt();
        Sc.close();

        for (int i = num; i >= 1; i--) {
            {
                for (int j = i; j >= 1; j--) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

    }
}
