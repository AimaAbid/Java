import java.util.Scanner;

public class Pascal {
    public static void main(String[] args) {
        System.out.println("Enter the no of lines");

        Scanner Sc = new Scanner(System.in);
        int nol = Sc.nextInt();
        Sc.close();

        int spaces = nol;
        int number = 1;

        for (int i = 0; i < nol; i++) {

            for (int s = 1; s <= spaces; s++) {
                System.out.print(" ");

            }
            number = 1;

            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }
            spaces--;
            System.out.println();

        }

    }

}
