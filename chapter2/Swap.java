package chapter2;
import java.util.Scanner;
public class Swap {
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        double num1 = scanner.nextDouble();

            System.out.println("Enter a number");
            double num2 = scanner.nextDouble();
        System.out.println("Before Swap: a = " + num1 + ", b = " + num2);
    scanner.close();

    double swap = num1;
    num1 = num2;
    num2 = swap;
        System.out.println("After Swap: a = " + num1 + ", b = " + num2);
    }

}
