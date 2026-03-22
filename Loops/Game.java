package Loops;
import java.util.Scanner;
public class Game {
    public static void main(String args[]){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Welcome to complete 100 Rupees Game.");
        System.out.println("Enter no of 1 rupee coin");
        int one = scanner.nextInt();

        System.out.println("Enter no of 2 rupee coin");
        int two = scanner.nextInt();

        System.out.println("Enter no of 5 rupee coin");
        int five = scanner.nextInt();

        System.out.println("Enter no of 10 rupee Note");
        int ten = scanner.nextInt();

        double x = (one) + (two * 2) + (five * 5) + (ten * 10);
        if (x != 100) {
           if (x < 100){
               System.out.println("Sorry "+ (100-x) + " rupees less");
           }
           else {
               System.out.println("Sorry "+ (x-100) + " rupees more");
            }

        }
        else{
            System.out.println("Congratulations you win the game");
        }
    }

}
