import java.util.Random;

public class RandomNumberSeries {
    public static void main(String[] args) {
        Random random = new Random();

        System.out.println("Random Number Series:");

        for (int i = 0; i < 5; i++) {
            int randomNumber = random.nextInt(101) + 100; // Generate random number between 100 and 200
            System.out.println("Random Number " + (i + 1) + ": " + randomNumber);

            double roundedNumber = Math.round(randomNumber); // Round off the number

            System.out.println("Random Number " + (i + 1) + " after round off : " + roundedNumber);
        }
    }
}
