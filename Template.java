import java.util.Scanner;

public class Template {

    public static void main(String[] args) {

        System.out.println("Enter the name you want to put in the letter template");
        Scanner Sc = new Scanner(System.in);
        String name = "";
        name += Sc.nextLine();
        Sc.close();

        String letter = "Dear";

        String ans = letter + " " + name;

        System.out.println(ans);
    }
}