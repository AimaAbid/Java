import java.util.Scanner;

public class NesTrCat {
    public static void main(String[] args) {
        int arr[] = new int[3];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;

        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter index");
        int i = Sc.nextInt();
        System.out.println("Enter divisor");
        int d = Sc.nextInt();

        Sc.close();

        try {
            System.out.println("To divide numbers");

            try {
                System.out.println(arr[i]);
                System.out.println(arr[i] / d);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array index out of bounds");
                System.out.println(e);

            } catch (Exception e) {
                System.out.println(e);
                System.out.println("Error Occured");

            }

        }

        finally {
            System.out.println("Done");
        }

    }
}
