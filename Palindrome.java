import java.util.Scanner;

public class Palindrome {

    public static void main(String args[]) {
        System.out.println("Enter the string to check for Palindrome");
        Scanner Sc = new Scanner(System.in);
        String str = "";
        str = str + Sc.nextLine();
        Sc.close();

        char charsArray[] = str.toCharArray();
        int flag = 0;

        for (int i = 0; i < charsArray.length; i++) {

            if (charsArray[i] != charsArray[charsArray.length - i - 1]) {
                System.out.println("Its not a palindrome");

                flag = 1;
                break;

            }

        }
        if (flag == 0) {
            System.out.println("Its a palindrome");

        }

    }

}
