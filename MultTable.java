import java.util.Scanner;

public class MultTable {

    public static void main(String[] args) {

        System.out.println("Enter the number whose table you want to create");
        Scanner Sc = new Scanner(System.in);
        int num = Sc.nextInt();
        Sc.close();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + num * i);
        }

    }
}
