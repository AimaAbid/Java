import java.util.Scanner;

public class T {
    public static void main(String args[]) {
        double tax = 0;
        System.out.println("Enter the salary");
        Scanner Sc = new Scanner(System.in);
        double salary = Sc.nextDouble();
        Sc.close();

        if (salary <= 250000)
            tax = 0;

        else if (salary > 250000 && salary <= 500000) {
            tax = tax + 0.05 * (salary - 250000);
        }

        else if (salary > 500000 && salary <= 1000000) {
            tax = tax + 0.05 * (salary - 250000);
            tax = tax + 0.2 * (salary - 500000);
        } else {
            tax = tax + 0.05 * (salary - 250000);
            tax = tax + 0.2 * (salary - 500000);
            tax = tax + 0.3 * (salary - 1000000);
        }

        System.out.println("Tax = " + tax);

    }

}
