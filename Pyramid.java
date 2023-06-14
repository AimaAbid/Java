import java.util.Scanner;

class Pyramid {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows");
        Scanner Sc1 = new Scanner(System.in);
        int num = Sc1.nextInt();
        int i, j, k;

        for (i = 1; i <= num; i++) {
            for (j = num; j > i; j--) {
                System.out.print(" ");

            }
            for (k = 1; k <= i; k++) {
                System.out.print("* ");

            }
            System.out.println();
        }

    }
}