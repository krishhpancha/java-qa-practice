package Loops;
import java.util.Scanner;
public class LetterSearch {

    public static void main(String arg[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the letter");
        String text = scanner.nextLine();
        boolean letterfound = false;
        for (int i = 0; i < text.length(); i++) {
            char currentLetter = text.charAt(i);
            if (currentLetter == 'A' || currentLetter == 'a') {
                letterfound = true;
                break;
            }
        }
        if(letterfound){
            System.out.println("This text contains the letter 'A'");
        }
        else{
            System.out.println("This text does not contain the letter 'A'");
        }
        }
    }

