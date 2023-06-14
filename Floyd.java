import java.util.Scanner;

public class Floyd {
    public static void main(String[] args) {
        System.out.println("Enter the number of lines");
        Scanner Sc = new Scanner(System.in);
        int num = Sc.nextInt();
        Sc.close();

        int value = 1;

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(value + " ");
                value++;
            }
            System.out.println();
        }

    }

}
