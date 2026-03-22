package Basics;
import java.util.Scanner;
public class Simpleinterest {
    public static void main(String arg[]){
Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Principal");
        int Pri = scanner.nextInt();

        System.out.println("Enter Rate");
        double rate = scanner.nextDouble();

        System.out.println("Enter Time");
        double time = scanner.nextDouble();

        double Interest = (Pri * rate * time) / 100;

        scanner.close();
        System.out.println("Your Interest is" + Interest);
    }
}
