import java.util.Random;
import java.util.Scanner;

public class HighLow {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        do {
            Random random = new Random();
            int winningNumber = random.nextInt(100) + 1;
            System.out.println("Start guessing");
            guessGame(getInteger(1,100), winningNumber);
            System.out.println("Play again? Enter yes or no.");
        } while(sc.nextLine().equalsIgnoreCase("yes"));
    }

    public static void guessGame(int guess, int winningNumber) {

        if (guess == winningNumber) {
            System.out.println("Took you long enough");
        } else if (guess < winningNumber) {
            System.out.println("Higher");
            guessGame(getInteger(1,100), winningNumber);
        } else {
            System.out.println("Lower");
            guessGame(getInteger(1,100), winningNumber);
        }
    }
    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        int numInput = 0;
        while (numInput < min || numInput > max) {
            numInput = sc.nextInt();
        }
        return numInput;
    }
}