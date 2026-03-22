package chapter4;
import java.util.Scanner;

public class GamePrediction1 {
    public static void main(String arg[]) {
        Scanner scanner = new Scanner(System.in);
        int correct = 7;
        int guess;
        int attempts = 0;

        do {
            System.out.println("Guess the number");
            guess = scanner.nextInt();

            attempts++;
            if (guess == 7) {
                System.out.println("Correct! You Win");
                break;
            }
                if (guess < 7) {

                    System.out.println("Too Low");

                }
                else
                {
                    System.out.println("Too High");
                }
            }

            while (attempts < 3) ;
            if (guess != 7) {
                System.out.println("You Lose! Correct number was " + 7);
            }
            scanner.close();
        }
    }






