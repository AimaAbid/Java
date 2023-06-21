import java.util.Scanner;

public class RemDoubTripSpaces {

    public static void main(String args[]) {
        System.out.println("Enter the string to detetc double and triple spaces and to replace them with single space");
        Scanner Sc = new Scanner(System.in);
        String str = "";
        str = str + Sc.nextLine();
        Sc.close();

        char charsArray[] = str.toCharArray();
        char ans[] = { ' ' };

        int flag = 0;
        int i;

        for (i = 0; i < charsArray.length; i++) {

            if (charsArray[i] == ' ' && charsArray[i + 1] == ' ' && charsArray[i + 2] == ' ') {
                flag = 3;

                System.out.println("Triple space found at index " + i);

                i++;

                i++;

            } else if (charsArray[i] == ' ' && charsArray[i + 1] == ' ') {
                flag = 2;

                System.out.println("Double space found at index " + i);
            }

        }
        if (flag == 3) {
            ans[i - 2] = ' ';
        } else if (flag == 2) {
            ans[i] = ' ';
        } else {
            ans[i] = charsArray[i];
        }

    }

    String finalAnswer = new String(ans);

}
