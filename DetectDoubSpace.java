import java.util.Scanner;

public class DetectDoubSpace {

    public static void main(String args[]) {
        System.out.println("Enter the string to detetc double and triple spaces");
        Scanner Sc = new Scanner(System.in);
        String str = "";
        str = str + Sc.nextLine();
        Sc.close();

        char charsArray[] = str.toCharArray();

        for (int i = 0; i < charsArray.length; i++) {

            if (charsArray[i] == ' ' && charsArray[i + 1] == ' ' && charsArray[i + 2] == ' ') {
                System.out.println("Triple space found at index " + i);
                i++;
                i++;

            } else if (charsArray[i] == ' ' && charsArray[i + 1] == ' ') {
                System.out.println("Double space found at index " + i);
            }
        }

    }

}
