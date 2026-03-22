package chapter2;
import java.util.Scanner;
public class Addtwonos {
    public static void main(String[] arg){
Scanner scanner = new Scanner(System.in);

  System.out.println("Enter a number");
          int num1 = scanner.nextInt();
        System.out.println("Enter a number");
        int num2 = scanner.nextInt();

        scanner.close();
         int sum = num1 + num2;

        System.out.println("Addition is "+sum);
    }
    };

