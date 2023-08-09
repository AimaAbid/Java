import java.util.Scanner;

public class UserDefinedExc {
    public static void main(String[] args) {
        int arr[] = new int[3];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        System.out.println("Enter the index of element");
        Scanner Sc = new Scanner(System.in);
        int i = Sc.nextInt();
        System.out.println("Enter the divisor");
        int d = Sc.nextInt();
        Sc.close();

        try {
            System.out.println("Value entered at index is " + arr[i]);
            System.out.println("Ratio is " + arr[i] / d);

        }

        catch (ArithmeticException e) {
            System.out.println("Arithematic exception");
            System.out.println(e);

        } catch (ArrayIndexOutOfBoundsException b) {
            System.out.println("ArrayIndexOutOfBoundsException");
            System.out.println(b);

        } catch (Exception f) {
            System.out.println("Exception other than Arithematic exception and ArrayIndexOutOfBoundsException");
            System.out.println(f);

        }

    }

}
