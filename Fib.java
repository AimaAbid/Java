import java.util.Scanner;

public class Fib {
    static int fibonacci(int num) {
        if (num == 1 || num == 2)
            return 1;

        else {
            return fibonacci(num - 1) + fibonacci(num - 2);
        }

    }

    public static void main(String[] args) {
        System.out.println("Enter the term of fibonacci series(starting from 1)");
        Scanner Sc = new Scanner(System.in);
        int num = Sc.nextInt();
        Sc.close();

        System.out.println(fibonacci(num));

    }

}
