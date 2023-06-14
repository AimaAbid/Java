import java.util.Scanner;

public class Fact {
    static int factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return (num * factorial(num - 1));
        }
    }

    public static void main(String[] args) {

        System.out.println("Enter the number whose factorial you intend to find");
        Scanner Sc = new Scanner(System.in);
        int num = Sc.nextInt();

        Sc.close();

        System.out.println("The factorial of " + num + " is " + factorial(num));

    }

}
