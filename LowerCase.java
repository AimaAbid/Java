import java.util.Scanner;
// Takes spaces as input too so u can give sentence as an input

class LowerCase {
    public static void main(String[] args) {
        System.out.println("Enter the string to turn to lower case");
        Scanner Sc = new Scanner(System.in);
        String name = "";

        name += Sc.nextLine();
        Sc.close();
        name = name.toLowerCase();
        System.out.println("the result is:  " + name);

    }
}