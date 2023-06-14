import java.util.Scanner;

public class RemDTspaces {

    public static void main(String args[]) {
        System.out.println("Enter the string to remove double and triple spaces");
        Scanner Sc = new Scanner(System.in);
        String str = "";
        str = str + Sc.nextLine();
        Sc.close();

        String ans;
        ans = str.replaceAll(" +", " ");

        System.out.println("Output string is\n" + ans);

    }

}
