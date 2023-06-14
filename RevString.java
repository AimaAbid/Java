import java.util.Scanner;

public class RevString {

    public static void main(String args[]) {
        System.out.println("Enter the string to be reversed");
        Scanner Sc = new Scanner(System.in);
        String str = "";
        str = str + Sc.nextLine();
        Sc.close();

        String ans = " ";

        char charsArray[] = str.toCharArray();

        for (int i = charsArray.length - 1; i >= 0; i--) {
            ans = ans + charsArray[i];

        }

        System.out.println(ans);

    }

}
