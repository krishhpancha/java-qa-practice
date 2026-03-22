package Basics;
import java.util.Scanner;
public class avg {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        double a = scanner.nextDouble();

        System.out.println("Enter a number");
        double b = scanner.nextDouble();

        System.out.println("Enter a number");
        double c = scanner.nextDouble();

        scanner.close();
        double avg = (a + b + c) / 3;
        System.out.println("Average is " + avg);

    }
}
