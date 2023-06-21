
public class VariableArguments {

    static int sum(int... ar) {
        int add = 0;
        for (int a : ar) {
            add += a;
        }
        return add;
    }

    public static void main(String[] args) {
        System.out.println("Sum of 1 and 2 is " + sum(1, 2));
        System.out.println("Sum of 1  2and 3 is " + sum(1, 2, 3));
        System.out.println("Sum of 1,2,3,4 and 5 is " + sum(1, 2, 3, 4, 5));

    }

}
